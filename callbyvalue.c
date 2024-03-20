#include<stdio.h>

void square(int n);
int main(){
	int num =9;
	square(num);
	printf("number = %d\n", num);
	return 0;
}
//call by value
void square(int n){
	n= n*n;
	printf("square = %d\n", n);
}