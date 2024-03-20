#include<stdio.h>

void number(int arr[], int n);

int main(){
	int arr[] = {1,2,4,3,5,6};
	number(arr, 6);
	return 0;

}

void number(int arr[], int n){
	for(int i=0;i<n;i++){
		printf("%d\t",arr[i]);
	}
	printf("\n");
}