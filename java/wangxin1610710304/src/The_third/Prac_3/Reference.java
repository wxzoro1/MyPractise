package The_third.Prac_3;


class Counter{
	int i = 0;
}
public class Reference {

	public void plus(int i) {								//单向值传递 不变
		i++;
	}
	
	public void plus(Counter c) {							//引用类型 管理对象改变 
		c.i++;
	}
	
	public void create(Counter c) {						    //引用类型 两次管理对象改变 原来不变
		c = new Counter();
		c.i++;
	}
	
	public static void main(String[] args) {
		int i = 0;
		Reference r = new Reference();
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		r.plus(i);
		System.out.println(i);
		r.plus(c1);
		System.out.println(c1.i);
		r.create(c2);
		System.out.println(c2.i);
	}

}


