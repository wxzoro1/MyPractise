package The_first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(),in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
//---------------------------------------------------------------------------------------------------------
public static class Fraction{
	private int fz ;
	private int fm ;
	public Fraction(int a, int b)
	{	
		this.fz = a;
		this.fm = b;	
	}
//------------------------------------------------------------
	public double toDouble()
	{
		double fs;					// return ((double)fz)/fm
		fs = (double)fz/(double)fm;
		return fs;
	}
//------------------------------------------------------------
	Fraction plus(Fraction r)
	{
		int nfz = fz*r.fm + r.fz*fm;
		int nfm = fm*r.fm;
		return new Fraction(nfz,nfm);
	}
//------------------------------------------------------------
	Fraction multiply(Fraction r)
	{
		int nfz = fz*r.fz;				//return new Fraction(fz*r.fz, fm*r.fm)
		int nfm = fm*r.fm;
		return new Fraction (nfz,nfm);
	}
//------------------------------------------------------------
	void print()
	{
		String r = new String();
		int digit = 1;
		int t;
		if(fz>fm) t=fm;
		else	t=fz;
		for (int i=2; i<=t; i++)
		{
			if(fm%i == 0 && fz%i ==0)
			{
				digit = i;
			}
		}
		fz = fz/digit;
		fm = fm/digit;
		r = fz+"/"+fm;	
		if(fz != fm)		System.out.println(r);
		else if(fm == 0)	System.out.println("分母不能为零");
		else 				System.out.println(fz);
	}
	}
}

