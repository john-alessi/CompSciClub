using System;

namespace CSharpExamples //Namespaces are like superclasses. Don't bother with them unless your project is absolutely gargantuan. Just keep everything under the same namespace.
{
    class Hello //declares a class, defaults to public so no need for the keyword
    {
        static void Main(string[] args) //declares the main method, no need for public because it defaults to public
        {
            Console.WriteLine("Hello, World!"); //Actually System.Console.Writeline, but since System is using'd, we don't need to type it. No need to import packages from Java, just "use" them for brevity
        }
    }
}

//See the java version for more detailed commenting. 99.99% of it can be applied here.