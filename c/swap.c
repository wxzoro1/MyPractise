#include <stdio.h> 
int swap(int a, int b);

int main()
{
	int a = 1;
	int b = 2;
	swap(a,b); //ʵ��  
	
	{
		int a = 0; 				//�������ڵĻḲ�������ֵ 
		printf("a=%d\n", a); 
	}
	 
	printf("a=%d b=%d\n", a,b);
	return 0;	
}
int swap(int a, int b){ //�β� 
	int t = a;
	a = b;
	b = t;
	return a,b; //��ʱ�Ǵ���� ���ܽ���a b��ֵ 
}
