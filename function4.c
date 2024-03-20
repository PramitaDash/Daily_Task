#include<stdio.h>

void printNamaste();
void printBojour();

int main(){
	printf("Enter i for indian & f for french: ");
	char ch;
	scanf("%c", &ch);
	if(ch == 'i'){
		printNamaste();

	}else{
		printBojour();
	}
	return 0;

}

void printNamaste(){
	printf("Namaste");
	// printBojour();
}

void printBojour(){
	printf("Bonjour");
}