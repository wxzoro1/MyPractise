#include <stdio.h> 

int main()
{
	int x;
	double sum = 0;
	int cnt = 0;
	int number[cnt];	//c99���Զ�̬���� 
	scanf("%d", &x);
	while( x != -1){
		number[cnt] = x;
		sum += x;
		cnt ++;
		scanf("%d", &x); 
	} 
	if(cnt > 0){
		printf("ƽ����Ϊ%f\n", sum/cnt);
		int i;
		for(i = 0; i<cnt; i++){
			if(number[i]>sum/cnt){
				printf("����ƽ��������%d\n", number[i]);
			}
		}
	}
	return 0;	
}
