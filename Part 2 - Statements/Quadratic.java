//Quadratic Solver: This program will factor any quadratic. I will give you the zero, if the exist and the vertex.

import java.util.Scanner; //Importing the Scanner for the program
import java.lang.Math; //Allows you to use code like Math.sqrt
import java.lang.Double; //Importing Double

public class Quadratic {
	
     public static void main(String[] args){

	double a = 0; //This will be the coefficient for the x^2 term
	double b; //This will be the coefficient for the x term
	double c; //This will be the variable known as c
	double second; // This will become b^2 - 4ac
	double third; // This will become -b/2a, giving the X value for the Vertex
	double first; // This will become Math.sqrt(b^2 - 4ac)/2a
	double forth; // Gives you the first zero -b + Math.sqrt(b^2 - 4ac)/2a
	double sixth; // Gives you the second zero -b - Math.sqrt(b^2 - 4ac)/2a
	double y; // Y-value for the vertex
	

	Scanner input = new Scanner( System.in );

	System.out.println("Please enter the coefficients for the quadratic equation: ");

	while(a == 0){ //This is a while statement, it states that as long as a equals zero, a == zero, the program will repeat what is stated below.

	System.out.print("A: "); // Asks for a Coefficient
		a = input.nextDouble();
	if (a == 0){ //Tests if the a value given by the user is equal to 0, a == 0. If a is equal to zero, then the equation is not a quadratic and will crash the program. The a value needs to otherwise greater than or less than 0. 
		System.out.println("Enter a value that is not zero!"); //If a is zero, it lets the user know that they need to enter a value that is not 0. The program will repeat the above step because of the while statement since a == 0.
		}
	}	
	System.out.print("B: "); // Asks for b Coefficient
		b = input.nextDouble();
	
	System.out.print("C: "); // Asks for the constant c
		c = input.nextDouble();

	second = ( b*b - 4.0*a*c );

	third = (-b/(2.0*a));
	y = a*third*third + b*third + c;

	if (second >= 0){ // Tests to make sure that the value for b^2 - 4ac is greater than or equal to (>=) 0. If the double second is less than zero, aka negative, then the square root of a negative number does not exist. Without this if statement, the program would crash since you can not square root a negative number.

	first = (Math.sqrt(second)/(2.0*a)); // Finds the square root of the b^2 - 4ac
	forth = (third + first); // First zero of the quadratic
	sixth = (third - first); // Second zero of the quadratic
	
	System.out.print("X equals " + forth + " and " + sixth + "\n"); // Prints the two zeros of the quadratic

		}

	if (second < 0){ // If the b^2 - 4ac is negative, less than zero then you can determine that there are no zeros. This is because you cannot square root a negative number.
	System.out.println("There are no real roots!"); //Prints the information to let the user know that the quadratic does not have any zeros, aka no real roots.

		}

	System.out.print("The vertex is at (");
	System.out.print(third + ", " + y + ")\n"); // Prints the X and the Y values for vertex of the quadratic. All quadratics will have a vertex.

	}
}
		