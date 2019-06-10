#include <stdio.h> 

int main()
{
	int hour1, minutes1;
	int hour2, minutes2;
	
	scanf("%d %d", &hour1, &minutes1);
	scanf("%d %d", &hour2, &minutes2);
	
	int t1 = hour1 * 60 + minutes1;
	int t2 = hour2 * 60 + minutes2;
	
	int t = t2 - t1;
	
	printf("时间差是%d小时%d分钟。", t/60, t%60);
	return 0;	
}
