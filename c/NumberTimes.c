#include <stdio.h> 

int main()
{
	const int number = 10;
	int x;
	int count[number];
	int i;
	scanf("%d", &x);
	
	for(i=0; i<number; i++){
		count[i] = 0;
	}
	
	while(x != -1){
		if(x>=0 && x<number){
			count[x] ++;
		}
		scanf("%d", &x);
	} 
	
	for(i=0; i<number; i++){
		printf("%d:%d\n", i, count[i]);
	}
	
	return 0;	
}
