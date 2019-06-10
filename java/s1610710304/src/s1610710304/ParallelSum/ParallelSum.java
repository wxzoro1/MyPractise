package s1610710304.ParallelSum;

public class ParallelSum {                         //µÚÈıÌâ     
	public static void main(String[] args) {
		Data1 d = new Data1();
		for (int i = 0; i < 300; i++) {
			d.sum[i] = (int)(Math.random()*100+1);
		}
		CountThread a1 = new CountThread(d,0,100);
		a1.start();
		CountThread a2 = new CountThread(d,100,200);
		a2.start();
		CountThread a3 = new CountThread(d,200,300);
		a3.start();
		
		try {Thread.sleep(100);} catch(Exception e) {}
		System.out.println(a1.sum+a2.sum+a3.sum);
		
	}
}

class Data1{
	int[] sum = new int[300];
	public Data1(){
		
	}
}

class CountThread extends Thread{
	Data1 data1;
	int sta,end;
	int sum = 0;
	public CountThread(Data1 d, int sta, int end) {
		data1 = d;
		this.sta = sta;
		this.end = end;
	}
	public void run() {
		for (int i = sta; i < end; i++) {
			sum += data1.sum[sta];
			sta ++;
		}
	}
}