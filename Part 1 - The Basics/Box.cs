using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpExamples
{
    class Box
    {
        int l;
        int w;
        int h; //length, width, and height

        public Box() //Called whenever a Box is created without any parameters
        {
            l = 1;
            w = 1;
            h = 1; //The default dimensions of our Box.
        }

        public Box(int l, int w, int h) //Called if a Box is created with three integer parameters
        {
            this.l = l; //this.[var] means "the variable belonging to the class which this method resides in, and NOT any variable of the same name within this method."
            this.w = w;
            this.h = h; //Allows custom-shaped Boxes
        }

        public int getVolume() //An integer representing the volume of the Box. Works for any Box.
        {
            return l * w * h; //return takes any argument. The return type is specified as an integer.
        }

        public int getSurfaceArea() //An integer representing the surface area of the Box.
        {
            return (2 * l * l) + (2 * w * w) + (2 * h * h); //return even takes complicated arguments for on-the-fly calculations.
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
}
