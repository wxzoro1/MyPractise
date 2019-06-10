package Distance;

import java.util.Scanner;

import java.util.HashMap;;

class Distance {
		Scanner in = new Scanner(System.in);
		private HashMap<String, Integer> cityname = new HashMap<String, Integer>();
		int n = 0;
		int [][] distance;
		String s;
		
		public void add() {
			while (!(s = in.next()).equals("###")) {			
				cityname.put(s, n++);
			}
			distance = new int[n][n];
		}	
		
		public void print() {
			System.out.println("Cityname:"+cityname);
		}
		
		public void buildMap() {		
			
			for (int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					distance[i][j] = in.nextInt();
				}
			}
		}
		
		public void getDistance() {
			System.out.println( distance[cityname.get(in.next())][cityname.get(in.next())]);
		}
			

	public static void main(String[] args) {
		Distance city = new Distance();
		city.add();
		city.buildMap();
		city.getDistance();						//缺点 不能一次粘贴
	}
}
