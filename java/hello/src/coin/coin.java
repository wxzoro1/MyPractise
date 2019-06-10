package coin;

import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		LABLE:																				//标签
		for (int one = 0; one<= amount; ++one)
		{
			for(int five = 0; five<= amount/5; ++five)										//++i 这种方式更好 
			{
				for(int ten = 0; ten<= amount/10; ++ten)
				{
					for(int twenty = 0; twenty<=amount/20; ++twenty )
					{
						if(one + five*5 + ten*10 + twenty*20 == amount)
						{
							System.out.println(one+"1元"+five+"5元"+ten+"10元"+twenty+"20元");
							break LABLE;
						}
					}
				}
			}
		}
	}

}
