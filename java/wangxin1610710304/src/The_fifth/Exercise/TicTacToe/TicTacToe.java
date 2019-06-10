package The_fifth.Exercise.TicTacToe;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {		//练习题 4
	
private JFrame window = new JFrame("井字棋");		//游戏名称
private String letter = "";						//棋
private int count = 0;							//回合数
JButton[] butts = new JButton[10];				//棋盘按钮
private final int SIZE = 3;						//棋盘型号
String[][] board = new String[SIZE][SIZE];		//棋盘矩阵

public TicTacToe(){

/*创建按钮及事件*/
JButton[] thButtons = new JButton[10];
for (int i = 1; i < thButtons.length; i++) {
	thButtons[i] = new JButton();
	thButtons[i].setFont(new java.awt.Font("SimSun", 1, 60));
	thButtons[i].setBackground(Color.white);
	window.add(thButtons[i]);
	butts[i] = thButtons[i];
	thButtons[i].addActionListener(this);	
}
		
/*窗体*/
window.setSize(500,500);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(SIZE,SIZE));

/*可视化*/
window.setVisible(true);
}

public void actionPerformed(ActionEvent a) { 	//动作响应
	count++;
	
	if(count % 2 != 0)
		letter = "X";
	else 
		letter = "O";

	for(int i = 1; i < butts.length; i++) {		//按键
		if(a.getSource() == butts[i]) {
			butts[i].setText(letter);
			butts[i].setEnabled(false);}
	}
	
	for(int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			if(butts[3*i+j+1].getText() != null) {
			board[i][j] =butts[3*i+j+1].getText();}
			}
	}

	for(int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			System.out.print(board[i][j]+(3*i+j+1)+" ");
		}
	}
	
	WinOrNot();
}

public void WinOrNot() {						//检测胜利
	boolean winResult  = false;
	int numOFX = 0;
	int numOFO = 0;
//	检查行
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
// 检查列
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
// 检查正对角线
	if(!winResult)
	{
		numOFX = numOFO = 0;
		for(int i=0;i<SIZE;i++)
		{
			if(board[i][i].equals("X")) {
				numOFX ++;
				System.out.println(numOFX);	
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
//检查负对角线
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
//判定
	if(winResult)
	{
		if(numOFX == SIZE)
		{
			JOptionPane.showMessageDialog(null, " WINNER X!");
			System.exit(0);
		}
		if(numOFO == SIZE)
		{
			JOptionPane.showMessageDialog(null, " WINNER O!");
			System.exit(0);
		}
	}
	else
	{	
		if(count == 9) {
		JOptionPane.showMessageDialog(null, "DRAW!");
		System.exit(0);
		}
		else {
		System.out.println(" ");
		}
	}
}

public static void main(String[] args){
new TicTacToe();
}
}