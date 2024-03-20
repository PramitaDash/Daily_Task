#include<stdio.h>

float squareArea(float side);
float circleArea(float radius);
float rectangleArea(float side1, float side2);

int main(){
	float radius;
	printf("Enter radius: ");
	scanf("%f",&radius);
	printf("area is : %f",circleArea(radius));

	return 0;

}

float squareArea(float side){
	return side * side;
}

float circleArea(float radius){
	return 3.14*radius *radius;
}
float rectangleArea(float side1, float side2){
	return side1 * side2;
}