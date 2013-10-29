using System;

namespace AwesomeIfs
{
    class AwesomeIfs //Attempts to realistically simulate a period of Algebra II/Trig with Mr. Slata
    {
        static void Main(string[] args)
        {
            Console.Write("How was that test? ");
            if (Console.ReadLine() == "Awesome")
            {
                MrSlata.isHappy();
            }
            else
            {
                //Doom awaits
            }

            Console.WriteLine("Test Grade: {0}", MrSlata.giveGrade()); //Inline arguments in C# are done with a number in curly braces. 0 argument #1, etc. This is equivalent to %f, %d, %s, etc in java.
        }
    }
}
