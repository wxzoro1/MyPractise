#include <stdio.h> 

int main()
{
	int hour1, minutes1;
	int hour2, minutes2;
	
	scanf("%d %d", &hour1, &minutes1);
	scanf("%d %d", &hour2, &minutes2);
	
	int ih = hour2-hour1;
	int im = minutes2-minutes1;
	if(im < 0){
		im = 60 + im;
		ih --;
	} 
	
	printf("ʱ�����%dСʱ%d���ӡ�", ih, im);
	return 0;	
}
