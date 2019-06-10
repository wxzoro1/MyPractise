package The_third.Exercise;
import java.util.Scanner;

public class Rational {											//练习题 2
	int nume;								//分子
	int deno;								//分母
	int fz,fm;								//临时分子分母
	
	Rational(int a, int b){
		this.nume = a;
		this.deno = b;
		
		int com = 1 ;						//公约数
		for(int i=1; i<=Math.abs(Math.min(nume, deno)); i++) {
			if(nume % i ==0 && deno % i == 0) {
				com = i;}
		}	
		nume = nume/com;					//最后结果
		deno = deno/com;
	}
	
	Rational add(Rational x){
		fz = this.nume * x.deno + x.nume * this.deno;
		fm = this.deno * x.deno;
		return new Rational(fz, fm);
	}
	
	Rational sub(Rational x) {
		fz = nume * x.deno - x.nume * deno;
		fm = deno * x.deno;
		return new Rational(fz, fm);
	}
	
	Rational mul(Rational x) {
		fz = nume * x.nume;
		fm = deno * x.deno;
		return new Rational(fz, fm);
	}

	Rational div(Rational x) {
		fz = nume * x.deno;
		fm = deno * x.nume;
		return new Rational(fz, fm);
	}
	
	void printRational() {
		if(deno != 0) {
			if(nume == deno) {
				System.out.println(nume);}
			else if(nume != deno && nume == Math.abs(deno)) {
				System.out.println("-"+nume);}	
			else 
			{
				System.out.println(nume+"/"+deno);
			}
		}
		else {
			System.out.println("输入有误 分母不能为0");
		}
	}
	
	void printReal() {
		double nnum = (double)nume/(double)deno;
		System.out.println(nnum);
	}
	
	public static void main(String[]args) {
		System.out.println("请依次两个分数的分子分母：");
		Scanner in = new Scanner(System.in);
		Rational a1 = new Rational(in.nextInt(), in.nextInt());
		Rational a2 = new Rational(in.nextInt(), in.nextInt());
		a1.printRational();
//		a2.printReal();
//		a1.add(a2).mul(a1).sub(a2).add(a2).printRational();
		
	}
}
