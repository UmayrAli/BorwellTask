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

        //Prints out the values
        System.out.println("The area of the floor is: \n" + decimalFormat.format(FloorArea) + " metres squared \n");
        System.out.println("The required amount of paint is: \n" + decimalFormat.format(RequiredPaint) + " litres \n");
        System.out.println("The recommended amount of paint is: \n" + decimalFormat.format(RequiredPaint+ 1) + " litres \n");
        System.out.println("The volume of the room is: \n" + decimalFormat.format(RoomVolume) + " metres cubed \n");
    }
}
