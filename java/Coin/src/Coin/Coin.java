package Coin;

import java.util.HashMap;
import java.util.Scanner;
public class Coin {
	private HashMap<Integer, String> coinname = new HashMap<Integer, String>();	//ע��Integer��������
	int i ;
	public Coin() {
		coinname.put(1,"penny");		
		coinname.put(10,"dime");		
		coinname.put(25,"quarter");		
		coinname.put(50,"half-dollar");		
		coinname.put(50,"new");									//ֻ�ᱣ�����µ�ֵ �Ḳ��
		System.out.println(coinname);							//coinname����ֱ����� �Դ�String toString
		for(Integer k: coinname.keySet()) {						//Hash��������
			String s = coinname.get(k);	
			System.out.println(s); 
		}														//�鿴�м��� ��coinname.keySet().size();
	}
	
	public String getName(int amount) {
		this.i = amount;
		if (coinname.containsKey(amount))						//containsKey �ж��Ƿ����
			return coinname.get(amount);						//get		     �õ���ֵ
		else
			return "NOT FOUND";
	}
	
	public String toString() {									//ֱ���������
		return ""+coinname.get(i);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
		System.out.println(coin);//								�����Ϳ���ֱ�������	Yeah��
	}

}
