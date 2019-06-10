package The_third.Exercise.TicTacToe;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Al_TicTacToe implements ActionListener {			//��ϰ��  4
	
private JFrame window = new JFrame("������");		//��Ϸ����
private String letter = "";						//��
private int count = 0;							//�غ���
JButton[] butts = new JButton[10];				//���̰�ť
private final int SIZE = 3;						//�����ͺ�
String[][] board = new String[SIZE][SIZE];		//���̾���

public Al_TicTacToe(){

/*������ť���¼�*/
JButton[] thButtons = new JButton[10];
for (int i = 1; i < thButtons.length; i++) {
	thButtons[i] = new JButton();
	thButtons[i].setFont(new java.awt.Font("SimSun", 1, 60));
	thButtons[i].setBackground(Color.white);
	window.add(thButtons[i]);
	butts[i] = thButtons[i];
	thButtons[i].addActionListener(this);	
}
		
/*����*/
window.setSize(500,500);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(SIZE,SIZE));

/*���ӻ�*/
window.setVisible(true);
}

public void AI() {
	int numOFX = 0;
	int numOFO = 0;
	
//����
//if(butts[1].getText().equals("X") && butts[5].getText().equals("O") && butts[9].getText().equals("X") && count % 2 != 0) {
//  butts[6].setText("O");
//  butts[6].setEnabled(false);
//  count++;
//}    
//
//else if(butts[3].getText().equals("X") && butts[5].getText().equals("O") && butts[7].getText().equals("X")&& count % 2 != 0) {
//  butts[4].setText("O");
//  butts[4].setEnabled(false);   
//  count++;
//}

	if(butts[5].getText().equals("")&& count % 2 != 0){
	  butts[5].setText("O");
	  butts[5].setEnabled(false); 
	  System.out.println("�м�count");
	  count++;
	}
	
	else if(butts[1].getText().equals("")&& count % 2 != 0){
	  butts[1].setText("O");
	  butts[1].setEnabled(false);  
	  System.out.println("11count");
	  count++;
	}
//��
	if(count % 2 != 0) {
		for (int i=0; i<SIZE; i++){
			numOFX  =numOFO = 0;
			int sumj = 0;
			for (int j = 0;j<SIZE;j++)
			{
				
				if(board[i][j].equals ("X") && count % 2 != 0) {
					sumj = sumj + j;
					numOFX ++;
					if(numOFX == SIZE-1 && (!butts[(i*3+4)-sumj].getText().equals("X") && !butts[(i*3+4)-sumj].getText().equals("O")))
					{
						butts[(i*3+4)-sumj].setText("O");
						butts[(i*3+4)-sumj].setEnabled(false);
						System.out.println("��2X��count");
						count ++;
					}
				}
				else if(board[i][j].equals ("O") && count % 2 != 0) {
					sumj = sumj + j;
					numOFO ++;
					if(numOFO == SIZE-1 && (!butts[(i*3+4)-sumj].getText().equals("X") && !butts[(i*3+4)-sumj].getText().equals("O")))
					{
						butts[(i*3+4)-sumj].setText("O");
						butts[(i*3+4)-sumj].setEnabled(false);
						System.out.println("��2O��count");
						count ++;
					}
				}
			}
		}
	}
	
//��
	if (count % 2 != 0) {
		for(int i=0;i<SIZE;i++)
		{
			numOFX=numOFO = 0;
			for (int j=0; j<SIZE; j++)
			{
				int sumj = 0;
				if(board[j][i].equals("X") && count % 2 != 0) {
					sumj = sumj+j;
					numOFX ++;
					if (numOFX == 2 && (!butts[(3-sumj)*3+(1+i)].getText().equals("X") && !butts[(3-sumj)*3+(1+i)].getText().equals("O"))) {
						butts[(3-sumj)*3+(1+i)].setText("O");;
						butts[(3-sumj)*3+(1+i)].setEnabled(false);
						System.out.println("��2X��count");
						count ++;
					}
				}
				else if (board[j][i].equals("O") && count % 2 != 0) {
					sumj = sumj+j;
					numOFO ++;
					if (numOFO == 2 && (!butts[(3-sumj)*3+(1+i)].getText().equals("X") && !butts[(3-sumj)*3+(1+i)].getText().equals("O"))) {
						butts[(3-sumj)*3+(1+i)].setText("O");;
						butts[(3-sumj)*3+(1+i)].setEnabled(false);
						System.out.println("��2O��count");
						count ++;
					}
				}
			}
		}
	}
//���Խ���
	if (count % 2 != 0) {
		numOFX= numOFO = 0;
		int sumi = 0;
		for(int i=0;i<SIZE;i++)
		{	
			
			if(board[i][Math.abs(i-2)].equals("X") && count % 2 != 0) {
				sumi = sumi + i;
				numOFX ++;
				if(numOFX == 2 && sumi != 0 && (!butts[(3-sumi)*3+sumi].getText().equals("X") && !butts[(3-sumi)*3+sumi].getText().equals("O")))
				{
					butts[(3-sumi)*3+sumi].setText("O");
					butts[(3-sumi)*3+sumi].setEnabled(false);
					System.out.println("���Խ���2	X��count");
					count ++;
				}
			}
			else if (board[i][Math.abs(i-2)].equals("O") && count % 2 != 0) {
				sumi = sumi + i;
				numOFO ++;
				if(numOFO == 2 && sumi != 0 && (!butts[(3-sumi)*3+sumi].getText().equals("X") && !butts[(3-sumi)*3+sumi].getText().equals("O"))){
					butts[(3-sumi)*3+sumi].setText("O");
					butts[(3-sumi)*3+sumi].setEnabled(false);
					System.out.println("���Խ���2	O��count");
					count ++;
				}
			}
		}
	}
//���Խ���
	if(count % 2 != 0) {
		numOFX = numOFO = 0;
		int sumi = 0;
		for(int i=0;i<SIZE;i++)
		{
			
			if(board[i][i].equals("X") && count % 2 != 0) {
				sumi = sumi + i;
				numOFX ++;
				if(numOFX == 2 && sumi != 0 && (!butts[(3-sumi)*3+(3-sumi+1)].getText().equals("X") && !butts[(3-sumi)*3+(3-sumi+1)].getText().equals("O")))
				{
					butts[(3-sumi)*3+(3-sumi+1)].setText("O");
					butts[(3-sumi)*3+(3-sumi+1)].setEnabled(false);
					System.out.println("���Խ���2X��count");
					count ++;
				}
			}
			else if (board[i][i].equals("O") && count % 2 != 0) 
				sumi = sumi + i;
				numOFO ++;
				if(numOFO == 2 && sumi!=0 && (!butts[(3-sumi)*3+(3-sumi+1)].getText().equals("X") && !butts[(3-sumi)*3+(3-sumi+1)].getText().equals("O")))
				{
					butts[(3-sumi)*3+(3-sumi+1)].setText("O");
					butts[(3-sumi)*3+(3-sumi+1)].setEnabled(false);
					System.out.println("���Խ���2	O��count");
					count ++;
				}
		}
	}
	
	if(count % 2 != 0){
        RandomChess();
		System.out.println("�����count");
    	count++;
    }
	
	WinOrNot();
	System.out.println("O��count��"+count);
}

public void RandomChess() {
	Random x = new Random();
	int y = x.nextInt(9)+1 ;
	System.out.println("y:"+y);
	if(butts[y].getText().equals("O") || butts[y].getText().equals("X")) {
		RandomChess();
	}
	else {
		butts[y].setText("O");
		butts[y].setEnabled(false);
	}
}

public void actionPerformed(ActionEvent a) { 	//������Ӧ
	for(int i = 1; i < butts.length; i++) {		//����
		if(a.getSource() == butts[i]) {
			butts[i].setText("X");
			butts[i].setEnabled(false);}
	}
	count ++;
	WinOrNot();
	System.out.println("X��count��"+count);
	AI();
}

public void WinOrNot() {						//���ʤ��
	boolean winResult  = false;
	int numOFX = 0;
	int numOFO = 0;
//�������
	for(int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			if(butts[3*i+j+1].getText() != null) {
			board[i][j] =butts[3*i+j+1].getText();}
			}
	}
//�������
	for(int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			System.out.print(board[i][j]+(3*i+j+1)+" ");
		}
	}
//	�����
	for (int i=0; i<SIZE; i++){
		numOFX=numOFO = 0;
		for (int j = 0;j<SIZE;j++)
		{
			if(board[i][j].equals ("X"))
				numOFX ++;
			else if(board[i][j].equals ("O"))
				numOFO ++;
			else {}
		}
		if(numOFX == SIZE | numOFO ==SIZE)
		{
			System.out.println("hang");
			winResult  =true;
			break;
		}
	}
// �����
	if(!winResult)
	{
		for(int i=0;i<SIZE;i++)
		{
			numOFX=numOFO = 0;
			for (int j=0; j<SIZE; j++)
			{
				if(board[j][i].equals("X"))
					numOFX ++;
				else if (board[j][i].equals("O")) 
					numOFO ++;
				else {}
			}
			if(numOFX == SIZE | numOFO ==SIZE)
			{
				System.out.println("lie");
				winResult=true;
				break;
			}
		}
	}
// ������Խ���
	if(!winResult)
	{
		numOFX = numOFO = 0;
		for(int i=0;i<SIZE;i++)
		{
			if(board[i][i].equals("X")) {
				numOFX ++;
			}
			else if (board[i][i].equals("O")) 
				numOFO ++;
			else {}
			if(numOFX == SIZE | numOFO == SIZE)
			{
				System.out.println("zdjx");
				winResult=true;
				break;
			}
		}
	}
//��鸺�Խ���
	if(!winResult)
	{
		numOFX=numOFO = 0;
		for(int i=0;i<SIZE;i++)
		{
			if(board[i][Math.abs(i-2)].equals("X"))
				numOFX ++;
			else if (board[i][Math.abs(i-2)].equals("O")) 
				numOFO ++;
			else {}
		
			if(numOFX == SIZE | numOFO ==SIZE)
			{
				System.out.println("fdjx");
				winResult=true;
				break;
			}
		}
	}
//�ж�
	if(winResult)
	{
		if(numOFX == SIZE)
		{
			JOptionPane.showMessageDialog(null, " You Win!");
			System.exit(0);
		}
		if(numOFO == SIZE)
		{
			JOptionPane.showMessageDialog(null, "Computer Win!");
			System.exit(0);
		}
	}
	else
	{	
		if(count >= 9) {
		JOptionPane.showMessageDialog(null, "DRAW!");
		System.exit(0);
		}
		else {
		System.out.println(" ");
		}
	}
}

public static void main(String[] args){
new Al_TicTacToe();
}
}