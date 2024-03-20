#include<stdio.h>

int fact(int f);
int main(){
	printf("fact is : %d",fact(5));

	return 0;

}
int fact(int f){
	if(f==0){// nbase case 
		return 1;
	}
	int factNum1= fact(f-1);
	int factN= factNum1 * f;
	return factN;

}