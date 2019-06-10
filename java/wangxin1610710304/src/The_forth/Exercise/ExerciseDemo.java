package The_forth.Exercise;

public class ExerciseDemo {
	public static void main(String[] args) {			//练习题 1
		int repeat;
		repeat = Integer.parseInt(args[0]);
		int n = 2 / repeat;
		String s = args[0].substring(5);
	}
}
// java.lang.ArrayIndexOutOfBoundsException: 0 数组越界错误
// repeat 为0 
// substring(5)越界

