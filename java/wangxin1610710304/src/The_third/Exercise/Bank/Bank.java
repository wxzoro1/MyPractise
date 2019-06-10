package The_third.Exercise.Bank;

abstract class Bank {					//¡∑œ∞Ã‚ 8
	protected static double oneyearRate = 0.0178;
	protected static double oneyearNationale = 0.0198;
	protected static double interestRate = 0.0078;
	protected double deposit;
	
	public Bank(double money)
	{
		deposit = money;
	}
	
	abstract void count();
	abstract void show();
}
