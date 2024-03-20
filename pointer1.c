#include<stdio.h>

int main(){
	int age =34;
	int *ptr = &age;

	//address
	printf("%p\n",&age);
	printf("%u\n",&age);
	printf("%d\n", ptr);
	printf("%d\n", &ptr);

	//value
	printf("%d\n", age);
	printf("%d\n", *ptr);
	printf("%d\n", *(&age));
	return 0;
}