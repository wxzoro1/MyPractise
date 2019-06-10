package The_third.Prac_3;
import java.util.Scanner;

public class WhoWinGame {

	private int WhoWin (char child1, char child2)
	{
		int result = 0;
		if(child1 == child2) result = 0;
		else if (child1 == 'S' && child2 == 'J')
			result = 1;
		else if (child1== 'S' && child2 == 'B')
			result = -1;
		else if (child1== 'J' && child2 == 'S')
			result = -1;
		else if (child1== 'J' && child2 == 'B')
			result = 1;
		else if (child1== 'B' && child2 == 'S')
			result = 1;
		else if (child1== 'B' && child2 == 'J')
			result = -1;
		return(result);
	}

	public static void main(String[] args) {
		char c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("A请出手(S,J,B)！");
		c = (in.next()).charAt(0);
		for (int i=0; i<3; i++)
			System.out.println( );
		System.out.println("B请出手(S,J,B)！");
		d = (in.next()).charAt(0);
		
		WhoWinGame x = new WhoWinGame();
		if (x.WhoWin(c,d) == 1)
			System.out.println("A赢");
		else
			System.out.println("B赢");                                                                     
	}

}

