import java.math.*;

class DataTypes {
	
	byte members = 22;//8 bits; ranges from -128 to 127
	short powerLevel = 9_001;//16 bits; ranges from -32,768 to 32,767
	int AstronomicalUnit = 92_955_807;//32 bits; ranges from -2,147,483,648 to 2,147,483,647
	long distanceToPluto = 3_053_000_000L;//64 bits; ranges from -18,446,744,073,709,551,616 to 18,446,744,073,709,551,615
	
	BigInteger avogadro = new BigInteger(/*about 6.02x10^23*/"602214100000000000000000");//Non-primitive data; unlimited value; used for VERY big numbers
	
	float ballmerPeak = 0.1335f;//32 bits
	double pi = 3.141592653589793238462643383279502884197169;//64 bits 
	
	BigDecimal treeFiddy = new BigDecimal("3.50");//Non-primitive; unlimited value; more appropriate for exact values
	
	boolean hasTheLargeHadronColliderDestroyedTheWorldYet = false;//1 bit of data but size "not precisely defined"; possible values true and false
	
	char firstInitial = 'J';//16 bits; 65536 characters in the Unicode set
	
	String einsteinQuote = "We all know that light travels faster than sound.  That's why certain people appear bright until you hear them speak.";
	//^Non-primitive; represents an array of characters
}
//more info at http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
