package The_forth.Exercise;

public class ExerciseDemo {
	public static void main(String[] args) {			//��ϰ�� 1
		int repeat;
		repeat = Integer.parseInt(args[0]);
		int n = 2 / repeat;
		String s = args[0].substring(5);
	}
}
// java.lang.ArrayIndexOutOfBoundsException: 0 ����Խ�����
// repeat Ϊ0 
// substring(5)Խ��

