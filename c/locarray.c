#include <stdio.h> 

int search(int key,int a[], int length);
 
int main(void)
{
	int a[] = {2,4,6,7,1,3,5,9,11,13,15,17,19,32};
	int x;
	int loc;
	printf("请输入一个数字：");
	scanf("%d", &x);
	loc = search(x,a,sizeof(a)/sizeof(a[0]));	//sizeof单位是字节 此时相除得到的是数组的单元个数 
	if(loc != -1){
		printf("%d在第%d个位置上\n",x,loc);
	}else{
		printf("%d不存在\n",x); 
	}
	return 0;	
}

int search(int key,int a[], int length){
	int ret = 1;
	int i;
	for(i=0; i<length; i++){
		if(a[i]==key){
			ret = i;
			break;
		}
	}
	return ret;
}


