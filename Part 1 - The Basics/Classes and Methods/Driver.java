
public class Driver {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		c.example();
		System.out.println("The sum is:  " + c.add(3.3, 6.6));
		System.out.println("The average is:  " + c.getAverage(3.3, 6.6));
	}
}
