#include <stdio.h> 

int search(int key,int a[], int length);
 
int main(void)
{
	int a[] = {2,4,6,7,1,3,5,9,11,13,15,17,19,32};
	int x;
	int loc;
	printf("������һ�����֣�");
	scanf("%d", &x);
	loc = search(x,a,sizeof(a)/sizeof(a[0]));	//sizeof��λ���ֽ� ��ʱ����õ���������ĵ�Ԫ���� 
	if(loc != -1){
		printf("%d�ڵ�%d��λ����\n",x,loc);
	}else{
		printf("%d������\n",x); 
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


