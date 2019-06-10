package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;
					
public class CellMachine {												//�����ҵ���߼�������޹� ���ֿ�����ͼ�Ρ��ı� ������Զ�̡�����	
																		//op����ֻ��c++֧�ֶ�̳�
	public static void main(String[] args) {							//1.��main	2.����С���� ׷���� ��ϸ�ڿ�ʼ
		Field field = new Field(30,30);									//30*30����
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());						//����Cell
			}
		}
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {							//С��1/5
					cell.reborn();										//׼������
				}
			}
		}
		View view = new View(field);									
		JFrame frame = new JFrame();									//ͼ�δ���	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//���Ͻǹر�
		frame.setResizable(false);										//�����Ըı��С
		frame.setTitle("Cells");										//Title
		frame.add(view);												
		frame.pack();													
		frame.setVisible(true);
		
		for ( int i=0; i<1000; i++ ) {
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);					//����Χ8��
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;												//�ж��ٸ��ھ�
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();													//��
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();													//����
						System.out.print("reborn");
					}
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
																						
}
