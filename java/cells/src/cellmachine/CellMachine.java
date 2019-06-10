package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;
					
public class CellMachine {												//程序的业务逻辑与表现无关 表现可以是图形、文本 可以是远程、进程	
																		//op语言只有c++支持多继承
	public static void main(String[] args) {							//1.找main	2.找最小的类 追父类 从细节开始
		Field field = new Field(30,30);									//30*30网格
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());						//创建Cell
			}
		}
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				if ( Math.random() < 0.2 ) {							//小于1/5
					cell.reborn();										//准备数据
				}
			}
		}
		View view = new View(field);									
		JFrame frame = new JFrame();									//图形窗口	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//右上角关闭
		frame.setResizable(false);										//不可以改变大小
		frame.setTitle("Cells");										//Title
		frame.add(view);												
		frame.pack();													
		frame.setVisible(true);
		
		for ( int i=0; i<1000; i++ ) {
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					Cell[] neighbour = field.getNeighbour(row, col);					//找周围8个
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;												//有多少个邻居
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();													//死
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();													//重生
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
