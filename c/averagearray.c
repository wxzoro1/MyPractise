#include <stdio.h> 

int main()
{
	int x;
	double sum = 0;
	int cnt = 0;
	int number[cnt];	//c99可以动态创建 
	scanf("%d", &x);
	while( x != -1){
		number[cnt] = x;
		sum += x;
		cnt ++;
		scanf("%d", &x); 
	} 
	if(cnt > 0){
		printf("平均数为%f\n", sum/cnt);
		int i;
		for(i = 0; i<cnt; i++){
			if(number[i]>sum/cnt){
				printf("大于平均数的有%d\n", number[i]);
			}
		}
	}
	return 0;	
}
