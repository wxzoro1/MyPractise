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
	
	printf("ʱ�����%dСʱ%d���ӡ�", t/60, t%60);
	return 0;	
}
