package Darray;

import java.util.Scanner;

public class Darray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[][] a = new int[3][5];				//{{1,2,3,4},{1,2,3}} ��������
		final int SIZE = 3;
		int[][] a = new int[SIZE][SIZE];
		boolean gotResult  = false;
		int numOFX= 0;
		int numOFO= 0;
		//�������
		for (int i=0; i<a.length; i++)			//�����ڲ��������
		{
			for (int j = 0; j<a[i].length;j++)
			{
				a[i][j] = in.nextInt();
			}
		}
		//�����
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
		//�����
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
		//������Խ���
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
		//��鸺�Խ���
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
				System.out.println("��Ӯ");
			}
			if(numOFO == SIZE)
			{
				System.out.println("��Ӯ");
			}
		}
		else
		{
			System.out.println("ƽ��");
		}
	}

}
