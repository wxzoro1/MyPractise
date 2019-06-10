#include <stdio.h> 

void cheer(int i){
	printf("cheer %d\n", i);
}

int main()
{
	cheer(2.3); 	//c语言漏洞 自动帮忙转换类型 让我们忽视了自己的错误。 
	return 0;	
}
