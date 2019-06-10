package Darray;

import java.util.Scanner;

public class Darray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[][] a = new int[3][5];				//{{1,2,3,4},{1,2,3}} 两行四列
		final int SIZE = 3;
		int[][] a = new int[SIZE][SIZE];
		boolean gotResult  = false;
		int numOFX= 0;
		int numOFO= 0;
		//读入矩阵
		for (int i=0; i<a.length; i++)			//有利于不规则矩阵
		{
			for (int j = 0; j<a[i].length;j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		//检查行
		for (int i=0; i<SIZE; i++)	
		{
			numOFX=numOFO= 0;
			for (int j = 0; j<SIZE;j++)
			{
				if(a[i][j]==1)
				{
					numOFX ++;
				}
				else {
					numOFO ++;
				}
			}
			if(numOFX == SIZE | numOFO ==SIZE)
			{
				gotResult  =true;
				break;
			}
		}
		//检查列
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				numOFX=numOFO = 0;
				for (int j=0; j<SIZE; j++)
				{
					if(a[j][i]==1)
					{
						numOFX ++;
					}
					else
					{
						numOFO ++;
					}
				}
				if(numOFX == SIZE | numOFO ==SIZE)
				{
					gotResult=true;
					break;
				}
			}
		}
		//检查正对角线
		if(!gotResult)
		{
			for(int i=0;i<SIZE;i++)
			{
				numOFX=numOFO = 0;
				for (int j=0; j<SIZE; j++)
				{
					if(a[i][i]==1)
					{
						numOFX ++;
					}
					else
					{
						numOFO ++;
					}
				}
				if(numOFX == SIZE | numOFO ==SIZE)
				{
					gotResult=true;
					break;
				}
			}
		}
		//检查负对角线
				if(!gotResult)
				{
					for(int i=0;i<SIZE;i++)
					{
						numOFX=numOFO = 0;
						for (int j=0; j<SIZE; j++)
						{
							if(a[i][i-2]==1)
							{
								numOFX ++;
							}
							else
							{
								numOFO ++;
							}
						}
						if(numOFX == SIZE | numOFO ==SIZE)
						{
							gotResult=true;
							break;
						}
					}
				}
		if(gotResult)
		{
			if(numOFX == SIZE)
			{
				System.out.println("甲赢");
			}
			if(numOFO == SIZE)
			{
				System.out.println("乙赢");
			}
		}
		else
		{
			System.out.println("平局");
		}
	}

}
