#include<stdio.h>

int sum(int a, int b);
void printTable(int n);
int main(){
	// int a, b;
	int n;
	// printf("enter a: ");
	// scanf("%d",&a);
	// printf("Enter b: ");
	// scanf("%d",&b);

	// int s = sum(a, b);
	// printf("sum is %d : ", s);
	printf("enbter table: ");
	scanf("%d",&n);
	printTable(n);//argument/ actual parameter
	return 0;


}

int sum(int a, int b){
	return a + b;

}

void printTable(int n){//parameter formal parameter7
	for(int i=1;i<=10;i++){
		printf("%d\n",i*n);
	}
}