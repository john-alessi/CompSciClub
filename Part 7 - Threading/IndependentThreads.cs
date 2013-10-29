using System;
using System.Threading;

namespace ThreadingExample
{
    class IndependentThreads //Shows two independent threads working without communicating
    {
        static int subject;
        static Random r = new Random();
        static Thread t = new Thread(Randomize);

        static void Main(string[] args)
        {
            t.Start();
            while (true)
                Console.WriteLine(subject); 
        }

        static void Randomize()
        {
            while(true)
                subject = r.Next(100); //some random numbers might not be printed, as r.Next can be done much faster than writeline
        }
    }
}
