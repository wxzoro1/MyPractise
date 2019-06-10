package The_third.Exercise.Bank;

import java.util.Scanner;

public class BankTest {
	public static void main (String[]args) {
		System.out.println("ÇëÊäÈë´æ¿î¶î:");
		Scanner in = new Scanner(System.in);
		double m = in.nextInt();
		Bank[] theBanks = new Bank[3];
		theBanks[0] = new oneyearRateAccount(m);
		theBanks[1] = new oneyearNationaldebtAccount(m);
		theBanks[2] = new interestAccount(m);
		for (int i = 0; i < 3; i++) {
			theBanks[i].count();
			theBanks[i].show();
		}
	}
}