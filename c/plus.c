#include <stdio.h> 

int main()
{
	int i;
	int j;
	printf("请输入两个整数：");
	scanf("%d%d", &i, &j);
	printf("%d + %d = %d\n", i, j, i+j);
	return 0;	
}
