package com.borwell;

import java.text.DecimalFormat;

public class Display
{
    //Prints the values that are entered to the console
    public static void Send(double FloorArea, double RequiredPaint, double RoomVolume)
    {
        //Formatting to 2 places after the decimal place
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        //Separating the lines
        System.out.print("\n\n _______ \n\n");

        //Print out the values.
        System.out.println("The area of the floor is: " + decimalFormat.format(FloorArea) + " metres squared.");
        System.out.println("The required amount of paint is: " + decimalFormat.format(RequiredPaint) + " litres.");
        System.out.println("The recommended amount of paint is: " + decimalFormat.format(RequiredPaint+ 1) + " litres.");
        System.out.println("The volume of the room is: " + decimalFormat.format(RoomVolume) + " metres cubed.");
    }
}
