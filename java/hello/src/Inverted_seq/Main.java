package Inverted_seq;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int digit;
		int nnum = 0;
		while(number > 0)
		{
			digit = number % 10;
			number = number / 10;
			nnum = (nnum + digit) * 10; 		 // nnum = nnum * 10 + digit 结果不必除10
		}
		System.out.println(nnum/10+"success");
	}

}
