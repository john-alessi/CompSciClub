using System;
using System.Threading;

namespace WhileExample
{
    class WhileExample
    {
        static void Main(string[] args)
        {
            int x = 5;
            Console.Write("Commencing launch in ");
            while (x > 0) //Decrements x by 1 each cycle to print a launch counter. Runs the code in the blocks unti the condition in parens is false
            {
                Console.Write(x + "... "); //Writes the value of x, then ... - DOES NOT ADD ... TO X
                x--; //x = x - 1;
                Thread.Sleep(500); //So the launch timer is actually visible. Makes the entire program freeze up for .5 seconds. Requires System.Threading for easy access.
            }
            Console.Write("WHEE");
            while (true) Console.Write("E"); //while(true) lasts forever. Press ctrl-c to stop the fun. while(false) is never looped
        }
    }
}
