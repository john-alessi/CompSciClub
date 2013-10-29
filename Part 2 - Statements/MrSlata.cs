using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AwesomeIfs
{
    static class MrSlata //static because there can be only one Mr. Slata
    {
        static bool Happy = false;
        public static void isHappy() //remember that static classes can only contain static methods.
        {
            Happy = true; //Awesome.
        }

        public static int giveGrade()
        {
            Random r = new Random();
            int Grade;
            if (Happy)
            {
                Grade = r.Next(90, 100); //Yay, good grades!
            }
            else
            {
                Grade = r.Next(40, 80); //Boo, bad grades!
            }
            return Grade;
        }
    }
}
