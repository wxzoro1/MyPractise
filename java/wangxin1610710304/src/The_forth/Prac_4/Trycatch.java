package The_forth.Prac_4;


public class Trycatch {
	public static void main(String[] args) {
//		-----------------------���һ------------------------
//		int [] a = {1,2,3,4};
//		try {
//			for(int i = 1; i <= 4; i++)
//				System.out.println(a[i]);
//			System.out.println("�һ�����ִ�е���");
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("��ĳ���������Խ�����");
//		}
//		-----------------------�����------------------------
		int [] a = {1,2,3,4};
		try {
			for(int i = 0; i <= 3; i++)
				System.out.println(a[i]);
			System.out.println("�һ�����ִ�е���");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("��ĳ���������Խ�����");
		}
	}
}
