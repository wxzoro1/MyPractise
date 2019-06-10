package The_third.Exercise;
import java.util.Scanner;

public class Complex {											//��ϰ�� 1
	int realPart;
	int imaginaryPart;
	
	Complex(int realPart, int imaginaryPart){
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public void add(Complex a,Complex b) {
		realPart = a.realPart + b.realPart;
		imaginaryPart = a.imaginaryPart + b.imaginaryPart;
		System.out.print("������Ϊ��");
		print();
	}
	
	public void sub(Complex a,Complex b) {
		realPart = a.realPart - b.realPart;
		imaginaryPart = a.imaginaryPart - b.imaginaryPart;
		System.out.print("������Ϊ(ǰһ�����һ��)��");
		print();
	}
	
	public void print() {
		if (this.imaginaryPart == 0 && this.realPart == 0) {
			System.out.println(0);
		}
		else if(this.realPart == 0 && this.imaginaryPart != 0 ) {
			System.out.println(this.imaginaryPart+"i");
		}
		else if(this.realPart != 0 && this.imaginaryPart == 0) {
			System.out.println(this.realPart);
		}
		else if(this.realPart != 0 && this.imaginaryPart < 0) {
			System.out.println(this.realPart+""+this.imaginaryPart+"i");
		}
		else {
		System.out.println(this.realPart+"+"+this.imaginaryPart+"i");
		}
	}
	
	public static void main(String[]args) {
		Complex base  = new Complex(0, 0);
		Complex[] n = new Complex[3];
		
		for (int k = 0; k < 2; k++) {
			System.out.println("��ֱ�����ʵ��,�鲿(����i):");
			Scanner in = new Scanner(System.in);
			int r = in.nextInt();
			int i = in.nextInt();
			n[k] = new Complex(r, i);
		}
		
		base.add(n[0], n[1]);				
		base.sub(n[0], n[1]);	

		
		
		
	}
}
