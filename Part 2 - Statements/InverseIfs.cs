using System;

namespace InverseIfs
{
    class InverseIfs
    {
        static void Main()
        {
            bool b = true;
            if (b) Console.WriteLine(b); // If b is true, write b
            b = !b; // Assign the inverse of b to b
            if (!b) Console.WriteLine(!b); // If b is false, write the inverse of b
        }
    }
}