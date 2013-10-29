//This program is an example of how to use a Scanner in Java, you can ask for inputs from the user

import java.util.Scanner; //Importing the needed files to run the Scanner 

public class Survey {

	public static void main (String[] args) {
	
	Scanner input = new Scanner( System.in ); //Declares a new Scanner for the program

	String Name;
	int age;
	
	

	System.out.print("What is your name? ");
		Name = input.nextLine(); //Find the value/String in the next line and records it

	System.out.print("No way! My name is " + Name + " too! \n"); //Spitting back out the recorded String

	System.out.print("How old are you? ");
		age = input.nextInt(); //Find the int given as input
		
	System.out.println("This is just too strange... It just so happens that I am " + age + " also. \n");
	}
}

	





