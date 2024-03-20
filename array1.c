#include<stdio.h>

int main(){
	// int age = 33;
	// int *ptr = &age;
	// printf("%u\n", ptr);
	// ptr++;
	// printf("%u\n", ptr);
	// ptr--;
	// printf("%u\n", ptr);
	// float price = 100.0;
	// float *ptr = &price;
	// printf("%u\n", ptr);
	// ptr++;
	// printf("%u\n", ptr);
	char star = "*";
	char *ptr = &star;
	printf("%u\n", ptr);
	ptr++;
	printf("%u\n", ptr);

	return 0;
}

