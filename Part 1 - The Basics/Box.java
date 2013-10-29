//An example of a java object representing a physical object

public class Box
{
	int length;
	int width;
	int height;
	
	public Box() //Called whenever a Box is created without any parameters
	{
		length = 1;
		width = 1;
		height = 1; //The default dimensions of our Box.
	}
	
	public Box(int l, int w, int h) //Called if a Box is created with three integer parameters
	{
		length = l;
		width = w;
		height = h; //Allows custom-shaped Boxes
	}
	
	public int getVolume() //An integer representing the volume of the Box. Works for any Box.
	{
		return l*w*h; //return takes any argument. The return type is specified as an integer.
	}
	
	public int getSurfaceArea() //An integer representing the surface area of the Box.
	{
		return (2*l*l)+(2*w*w)+(2*h*h); //return even takes complicated arguments for on-the-fly calculations.
	}
	
	public void crushBox() //A behavior of the Box, which halves its height.
	{
		h /= 2; //equivalent to h = h/2;
	}
	
	public static String toString() //Works the same for any Box. Cannot access instance variables, and must be referenced by the class name, not any object name.
	{
		return "I'm a box!";
	}
}
