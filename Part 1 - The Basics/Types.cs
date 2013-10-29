using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpExamples
{
    class Types //Notice how variables don't need to be declared inside of a method. Typically, declaring variables outside of a method is the best approach.
    {
        bool IsAwesome = true; //1 bit, two possible values
        bool? NoComment = null; //2 bits, three possible values (one wasted value) (all types are nullable with a ?, giving it one more value and adding a bit to its length. Typically not worth it due to and size)

        byte Members = 22;//8 bits; ranges from -128 to 127
        short PowerLevel = 9001;//16 bits; ranges from -32,768 to 32,767
        int AstronomicalUnit = 92955807;//32 bits; ranges from -2,147,483,648 to 2,147,483,647
        long DistanceToPluto = 3053000000;//64 bits; ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        ulong DistanceToAndromeda = 14696249500000000000; //64 bits, ranges from 0 to 18,446,744,073,709,551,615 (ubyte, ushort, and uint are also available, but why would you need them?

        //It's important to note that any nonmultiple of 32 is rounded up to the next 32 bits, making byte and short nearly useless, save for rollovers and nulling. This also makes nulling very space inefficient.

        float BallmerPeak = 0.1335f;//32 bits. Floats and doubles are almost never perfectly exact, but deltas are usually negligible.
        double Pi = 3.141592653589793238462643383279502884197169;//64 bits, ~16 sigfigs. Absolutely massive domain, though huge numbers lose precision quickly. 
        double AndBeyond = Double.PositiveInfinity; //May also be set to Epsilon, Negative Infinity, and NaN
        decimal SuperPi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679M;//128 bits, ~29 sigfigs, incredibly slow.

        char CharacterWithCharacter = 'u'; //16 bits, roughly 65,000 characters possible, including alternate alphabets.
        string JohnsName = "John Cornelius Alessi"; //An array of characters, really. It's not primitive, but it's treated as such.
    }
}
