package The_forth.Prac_4;


public class Trycatch {
	public static void main(String[] args) {
//		-----------------------情况一------------------------
//		int [] a = {1,2,3,4};
//		try {
//			for(int i = 1; i <= 4; i++)
//				System.out.println(a[i]);
//			System.out.println("我还有幸执行到吗？");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("真的出现了数组越界错误");
//		}
//		-----------------------情况二------------------------
		int [] a = {1,2,3,4};
		try {
			for(int i = 0; i <= 3; i++)
				System.out.println(a[i]);
			System.out.println("我还有幸执行到吗？");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("真的出现了数组越界错误");
		}
	}
}
