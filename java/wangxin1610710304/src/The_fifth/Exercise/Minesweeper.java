package The_fifth.Exercise;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import The_third.Exercise.Bank.interestAccount;


public class Minesweeper extends JFrame {			//¡∑œ∞Ã‚ 10
	JLabel[] thJLabel = new JLabel[169];
	JPanel[] thJPanel = new JPanel[169];
	JButton[] thButtons = new JButton[169];
	int buttoncount = 0;
	 
	public static void main(String[]args) {
		Minesweeper demo = new Minesweeper();
		demo.go();
}
	public void go() {
		setTitle("Minesweeper");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JPanel board = getBoard();
		add(board,"Center"); 
		setVisible(true);
	}
	 
	public JPanel getBoard() {
		JPanel board1 = new JPanel();
		board1.setLayout(new GridLayout(13,13));
		for (int i = 0; i < 169; i++) {
		final int temp = i;
		thJPanel[i] = new JPanel();
		thJPanel[i].setLayout(new CardLayout());
		thJLabel[i] = new JLabel(" ", JLabel.CENTER);
		thJLabel[i].setBorder(BorderFactory.createEtchedBorder());
		thJLabel[i].setOpaque(true);
		thButtons[i] = new JButton();
		thButtons[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)thJPanel[temp].getLayout()).previous(thJPanel[temp]);
				buttoncount ++;
				if (thJLabel[temp].getText().equals("*")) {
					JOptionPane.showMessageDialog(null, "Bomb!Bomb!Bomb!!!");
					System.exit(0);
				}else if(buttoncount == 153){
					JOptionPane.showMessageDialog(null, "You are win!!!");
					System.exit(0);
				}
			}
		});
		thJPanel[i].add(thButtons[i],"first");
		thJPanel[i].add(thJLabel[i], "second");
		board1.add(thJPanel[i]);
		}
		Bomb();		 
		scanNum();
		return board1;
	}
	 
	public void Bomb() {
		int[] bomb = new int[13*13/10];
		for (int i = 0; i < bomb.length; i++) {
		    bomb[i] = (int)(0 + Math.random()*(169-1+1));
			thJLabel[bomb[i]].setText("*");
			thJLabel[bomb[i]].setFont(new Font("∫⁄ÃÂ", Font.CENTER_BASELINE, 30));
			thJLabel[bomb[i]].setBackground(Color.white);
			thJLabel[bomb[i]].setForeground(Color.black);
		}
	}
	
	public void scanNum() {
		ArrayList<Integer> findBomb = new ArrayList<Integer>();
		String[] count = new String[169];
		for (int i = 0; i < count.length; i++) {
			count[i] = "0";
		}
		for (int i = 0; i < thJLabel.length; i++) {
			try {
				if (thJLabel[i].getText().equals("*")) {
					findBomb.add(i);
					if (i<=12) {
						thJLabel[i+1].setText((Integer.parseInt(count[i+1])+1)+"");
						count[i+1] = (Integer.parseInt(count[i+1])+1)+"";
						thJLabel[i+12].setText((Integer.parseInt(count[i+12])+1)+"");
						count[i+12] = (Integer.parseInt(count[i+12])+1)+"";
						thJLabel[i+13].setText((Integer.parseInt(count[i+13])+1)+"");
						count[i+13] = (Integer.parseInt(count[i+13])+1)+"";
						thJLabel[i+14].setText((Integer.parseInt(count[i+14])+1)+"");
						thJLabel[i-1].setText((Integer.parseInt(count[i-1])+1)+"");
						count[i-1] = (Integer.parseInt(count[i-1])+1)+"";
					}else if (i>12 && i<156) {
						if ( i % 13 == 0) {
							thJLabel[i+1].setText((Integer.parseInt(count[i+1])+1)+"");
							count[i+1] = (Integer.parseInt(count[i+1])+1)+"";
							thJLabel[i+13].setText((Integer.parseInt(count[i+13])+1)+"");
							count[i+13] = (Integer.parseInt(count[i+13])+1)+"";
							thJLabel[i+14].setText((Integer.parseInt(count[i+14])+1)+"");
							count[i+14] = (Integer.parseInt(count[i+14])+1)+"";
							thJLabel[i-13].setText((Integer.parseInt(count[i-13])+1)+"");
							count[i-13] = (Integer.parseInt(count[i-13])+1)+"";
							thJLabel[i-12].setText((Integer.parseInt(count[i-12])+1)+"");
							count[i-12] = (Integer.parseInt(count[i-12])+1)+"";
						}else if (i % 13 == 12) {
							thJLabel[i-1].setText((Integer.parseInt(count[i-1])+1)+"");
							count[i-1] = (Integer.parseInt(count[i-1])+1)+"";
							thJLabel[i-14].setText((Integer.parseInt(count[i-14])+1)+"");
							count[i-14] = (Integer.parseInt(count[i-14])+1)+"";
							thJLabel[i-13].setText((Integer.parseInt(count[i-13])+1)+"");
							count[i-13] = (Integer.parseInt(count[i-13])+1)+"";
							thJLabel[i+12].setText((Integer.parseInt(count[i+12])+1)+"");
							count[i+12] = (Integer.parseInt(count[i+12])+1)+"";
							thJLabel[i+13].setText((Integer.parseInt(count[i+13])+1)+"");
							count[i+13] = (Integer.parseInt(count[i+13])+1)+"";
						}else {
							thJLabel[i+1].setText((Integer.parseInt(count[i+1])+1)+"");
							count[i+1] = (Integer.parseInt(count[i+1])+1)+"";
							thJLabel[i+12].setText((Integer.parseInt(count[i+12])+1)+"");
							count[i+12] = (Integer.parseInt(count[i+12])+1)+"";
							thJLabel[i+13].setText((Integer.parseInt(count[i+13])+1)+"");
							count[i+13] = (Integer.parseInt(count[i+13])+1)+"";
							thJLabel[i+14].setText((Integer.parseInt(count[i+14])+1)+"");
							count[i+14] = (Integer.parseInt(count[i+14])+1)+"";
							thJLabel[i-1].setText((Integer.parseInt(count[i-1])+1)+"");
							count[i-1] = (Integer.parseInt(count[i-1])+1)+"";
							thJLabel[i-14].setText((Integer.parseInt(count[i-14])+1)+"");
							count[i-14] = (Integer.parseInt(count[i-14])+1)+"";
							thJLabel[i-13].setText((Integer.parseInt(count[i-13])+1)+"");
							count[i-13] = (Integer.parseInt(count[i-13])+1)+"";
							thJLabel[i-12].setText((Integer.parseInt(count[i-12])+1)+"");
							count[i-12] = (Integer.parseInt(count[i-12])+1)+"";
						}
						
					}else if (i>=156) {
						thJLabel[i-1].setText((Integer.parseInt(count[i-1])+1)+"");
						count[i-1] = (Integer.parseInt(count[i-1])+1)+"";
						thJLabel[i-14].setText((Integer.parseInt(count[i-14])+1)+"");
						count[i-14] = (Integer.parseInt(count[i-14])+1)+"";
						thJLabel[i-13].setText((Integer.parseInt(count[i-13])+1)+"");
						count[i-13] = (Integer.parseInt(count[i-13])+1)+"";
						thJLabel[i-12].setText((Integer.parseInt(count[i-12])+1)+"");
						count[i-12] = (Integer.parseInt(count[i-12])+1)+"";
						thJLabel[i+1].setText((Integer.parseInt(count[i+1])+1)+"");
						count[i+1] = (Integer.parseInt(count[i+1])+1)+"";
					}
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;	
			}
		}
	}
	
	public void checkWin() {
		
	}
}

	
