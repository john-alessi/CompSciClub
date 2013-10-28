//Prints Hello, World! to the console. Shows examples of class declarations, method calls, method declarations, and parameter passing.


public class HelloWorld { //declares and begins a class
	public static void main(String args[]) { //declares and begins a method with one accepted (unused) parameter
		System.out.println("Hello, World!"); //Calls the println method of the out class in the Systen namespace, and passes "Hello, World!" to be printed
	}//declares the end of the method
}//declares the end of the class

/* GLOSSARY

public - any public class or method may be seen at any point in the program.
class - A big object that holds code and values. Classes may represent anything, be it concrete or abstract. Today, we are creating a HelloWorld, which has one behavior: saying Hello, World!
{curlybraces} - Signifies the beginning or end of a statement. A curly brace after a declaration of a statement, class, or method, shows that everything inside of the curly brace belongs to the method/class/statement. These braces can (and will) stack.
static - Don't worry about this just yet. Just know that the main method must be static.
void - A type of method without a return type. Methods may be declared with any type, such as int, long, HelloWorld, or void.
String args[] - A very nonessential piece of code that allows arguments to be passed via command line at the time of running. For example, replacing "Hello World!" with args[0] (don't worry about that just yet) allows the program to print whatever argument was passed
System.out.println - A method called println in the out class of the Systen namespace. The method is a static void, just like the main one, and accepts one argument (usually. don't worry about that either.) - The method prints the argument to the console.
() - Parameters go here. For println, nearly any parameter is accepted, such as a number, character, string, or even a boolean value (true/false value)
; - Tells the compiler that the statement is over, and to proceed to the next statement. These little buggers are the bane of new programmers everywhere.
abstraction - The idea that a person does not need to know how something works to use it. For example, you have no idea how println knows how to print its argument to the console. You just accept that it works trust that it will work. This goes for all built-in methods.
