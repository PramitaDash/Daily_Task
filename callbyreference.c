#include<stdio.h>

void _square(int *n);
int main(){
	int num =4;
	_square(&num);
	printf("number = %d\n", num);
	return 0;
}

void _square(int* n){
	*n = (*n) * (*n);
	printf("square = %d\n", *n);
}