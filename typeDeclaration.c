#include<stdio.h>

int main(){
	int age = 22;
	int oldage=age;
	int newAge=oldage +2;
	printf("new age is: %d",newAge);

	int rupee=1,doller;
	doller=74;

	/* 
	order of declaration is importent- wrong declaration order
	float pi= 3.14;
	floar area = pi * rad * rad;
	float rad = 3;
	*/
//valid declaration
int age1, age2, age3;
age1=age2=age3=22;

//invalid
// int a1 =a2=a3=22;
return 0;
}