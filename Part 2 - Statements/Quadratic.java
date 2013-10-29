//Quadratic Solver: This program will factor any quadratic. I will give you the zero, if the exist and the vertex.

import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;

public class Quadratic {
	
     public static void main(String[] args){

	double a = 0;
	double b;
	double c;
	double second;
	double third;	
	double first;
	double forth;
	double sixth;
	double y;
	

	Scanner input = new Scanner( System.in );

	System.out.println("Please enter the coefficients for the quadratic equation: ");

	while(a == 0){

	System.out.print("A: ");
		a = input.nextDouble();
	if (a == 0){
		System.out.println("Enter a value that is not zero!");
		}
	}	
	System.out.print("B: ");
		b = input.nextDouble();
	
	System.out.print("C: ");
		c = input.nextDouble();

	second = ( b*b - 4.0*a*c );


	third = (-b/(2.0*a));
	y = a*third*third + b*third + c;

	if (second >= 0){

	first = (Math.sqrt(second)/(2.0*a));
	forth = (third + first);
	sixth = (third - first);
	
	System.out.print("X equals " + forth + " and " + sixth + "\n");

		}

	if (second < 0){
	System.out.println("There are no real root!");

		}

	System.out.print("The vertex is at (");
	System.out.print(third + ", " + y + ")\n");

	}
}
		