#include<stdio.h>

void calcPrice(float val);
int main(){
	float val =100.0;
	calcPrice(val);
	printf("val is: %f\n", val);
	return 0;

}

void calcPrice(float val){
	val =val +(0.18* val);
	printf("cst is : %f",val);

}

