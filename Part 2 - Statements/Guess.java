// Number Guess

import java.util.Random;
import java.util.Scanner;
public class Guess {

	public static void main ( String[] args ) {

Random rand = new Random();

		int counter = 0;
		int numbertoguess = 0;
		int guess = 0;
	    int next = 0;

Scanner input = new Scanner( System.in );	

		while (next == 0){

		System.out.println("Pick a number between 1-100 and lets see how long it will take for me to guess it.");
			numbertoguess = input.nextInt();
			next = 1;
		if (numbertoguess < 1){
			System.out.println("I said a number between 1 and 100!");
			next = 0;
			}
		
		if (numbertoguess > 100){
			System.out.println("I said a number between 1 and 100!");
			next = 0;
				}
			}

		while (numbertoguess != guess)
		{
		guess = rand.nextInt(101);
		System.out.printf("%d \n", guess);
		counter = (counter + 1);
		}
		System.out.printf(" \n It took the computer %d times to guess your number.", counter);
	}

}