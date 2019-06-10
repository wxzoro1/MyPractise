#include <stdio.h> 
int isPrime(int x , int knownPrimes[], int numberOfKnownPrimes); 
int main(void)
{
	const int number = 100;
	int prime[number] = {2}; 							//问题：不能初始化的同时赋值 
	int count = 1;
	int i = 3;
	while(count < number){
		if(isPrime(i, prime, count)){
			prime[count++] = i; 						//套路 
		}
		{
			printf("i = %d \tcnt=%d\t", i, count);
			for(i=0;i<number;i++){
				printf("%d\t, prime[i]");
			}
			printf("\n");
		}
		i++;
	}	
	for(i=0; i<number; i++){
		printf("%d", prime[i]);
		if((i+1)%5) printf("\t");
		else printf("\n");
	}
	return 0;	
}

int isPrime(int x , int knownPrimes[], int numberOfKnownPrimes){
	int ret = 1;
	int i ;
	for( i=0; i<numberOfKnownPrimes; i++){
		if(x % knownPrimes[i] == 0){
			ret = 0;
			break;
		}
	}
	return ret;
}
