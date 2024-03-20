#include<stdio.h>
#include<string.h>

int main(){
	//declaration
	char name[] = "Pramita Dash";
	char cource[]= {'p','r','a','m','i','t','a','\0'};

	//printing string 
	for(int i=0; name[i]!='\0';i++){
		printf("%c", name[i]);
	}
	printf("\n");

	//printing string with pointer
	for(char *ptr=name; *ptr!='\0';ptr++){
		printf("%c", *ptr);
	}
	printf("\n");

	//printing using format specifier
	printf("%s\n", name);

	//input a string
	char firstName[40];
printf("enter first name : ");
scanf("%s", firstName);
printf("you first name is %s\n", firstName);
char fullName[40];
printf("enter full name : ");
scanf("%s", fullName);
printf("you first name is %s\n", fullName);

	//get & put
	char fullname[40];
	printf("enter fullname : ");
	fgets(fullname, 40, stdin);
	puts(fullname);

	//library function

	char name[] = "Pramita";
	int length = strlen(name);
	printf("the length of the name is: %d\n", length);

	char oldval[]= "oldval";
	char newval[]= "newval";
	strcpy(newval, oldval);
	puts(newval);

	char firststr[50] =  "hello";
	char secstr[]="world";
	strcat(firststr, secstr);
	puts(strcat);

	char str1[] = "Apple";
	char str2[] = "Banana";
	printf("%d\n", strcmp(str1, str2));

	printf("enter string : ");
	char str[100];
	char ch;
	int i=0;
	while(ch != '\n'){
		scanf("%c", &ch);
		str[i] = ch;
		i++;
	}
	str[i] = '\0';
	puts(str);

	return 0;
}