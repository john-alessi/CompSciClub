
public class Calculator {
	
	public Calculator() {
		System.out.println("A new calculator object was created.");
	}
	
	public void example() {
		System.out.println("Hello, world!");
	}
	
	public double add(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
	public double getAverage(double a, double b) {
		double average = a + b;
		average = average/2;
		return average;
	}
}
