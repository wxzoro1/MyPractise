#include <stdio.h> 
int swap(int a, int b);

int main()
{
	int a = 1;
	int b = 2;
	swap(a,b); //实参  
	
	{
		int a = 0; 				//大括号内的会覆盖外面的值 
		printf("a=%d\n", a); 
	}
	 
	printf("a=%d b=%d\n", a,b);
	return 0;	
}
int swap(int a, int b){ //形参 
	int t = a;
	a = b;
	b = t;
	return a,b; //此时是错误的 不能交换a b的值 
}
