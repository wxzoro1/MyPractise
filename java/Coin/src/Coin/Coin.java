package Coin;

import java.util.HashMap;
import java.util.Scanner;
public class Coin {
	private HashMap<Integer, String> coinname = new HashMap<Integer, String>();	//注意Integer包裹类型
	int i ;
	public Coin() {
		coinname.put(1,"penny");		
		coinname.put(10,"dime");		
		coinname.put(25,"quarter");		
		coinname.put(50,"half-dollar");		
		coinname.put(50,"new");									//只会保存最新的值 会覆盖
		System.out.println(coinname);							//coinname可以直接输出 自带String toString
		for(Integer k: coinname.keySet()) {						//Hash遍历方法
			String s = coinname.get(k);	
			System.out.println(s); 
		}														//查看有几个 用coinname.keySet().size();
	}
	
	public String getName(int amount) {
		this.i = amount;
		if (coinname.containsKey(amount))						//containsKey 判断是否存在
			return coinname.get(amount);						//get		     得到键值
		else
			return "NOT FOUND";
	}
	
	public String toString() {									//直接输出方法
		return ""+coinname.get(i);
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
		System.out.println(coin);//								这样就可以直接输出了	Yeah！
	}

}
