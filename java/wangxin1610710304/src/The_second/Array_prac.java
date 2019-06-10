package The_second;

public class Array_prac {

	public static void main(String[] args) {
//		---------------------一维数组----------------
		int[] a = {1,2,3,4};
		for (int x:a) {
		System.out.print(x+" ");
		}
		System.out.println("");
//		---------------------------------------------
		int[] b = new int[4];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		for (int x:b) {
		System.out.print(x+" "); 
		}
		System.out.println("");
//		---------------------------------------------
		int[] c = new int[] {1,2,3,4};
		for (int x:c) {
		System.out.print(x+" "); 
		}
		System.out.println("");
//		-------------------二维数组------------------
		int d[][]= {{1,2},{3,4},{5,6}};
		for (int[] x:d) {
			for(int y:x) {
				System.out.print(y+" "); 
			}
			System.out.print(";");
		}
		System.out.println("");
//		---------------------------------------------
		int[][] e = new int[3][2];
		e[0][0] = 1;
		e[0][1] = 2;
		e[1][0] = 3;
		e[1][1] = 4;
		e[2][0] = 5;
		e[2][1] = 6;
		for (int[] x:e) {
			for(int y:x) {
				System.out.print(y+" "); 
			}
			System.out.print(";");
		}
		System.out.println("");
//		---------------------------------------------
		int [][] f = new int[][] {{1,2},{3,4},{5,6}};
		for (int[] x:f) {
			for(int y:x) {
				System.out.print(y+" "); 
			}
			System.out.print(";");
		}
	}
}
