#include<stdio.h>

void printAddress(int n);
void printAddresss(int *n);

int main(){
	int n =7;
	printAddress(n);
	printAddresss(&n);
	printf("%u\n", &n);
	return 0;
}

void printAddress(int n){
	printf("%u\n",&n);
}
void printAddresss(int *n){
	printf("%u\n",&n);
}
