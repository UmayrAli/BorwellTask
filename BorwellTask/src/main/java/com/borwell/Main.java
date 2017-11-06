package com.borwell;

import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args)
    {
        Inputs ClassInput = new Inputs();
        PaintCalculation ClassCalculation = new PaintCalculation();

        //Receives the user's input
        ClassInput.Collect();

        //The calculation is run and values are returned
        double FloorArea = ClassCalculation.AreaOfFloor(ClassInput.Parsed[0], ClassInput.Parsed[1]);
        double RequiredPaint = ClassCalculation.RequiredPaint(ClassInput.Parsed[2], ClassInput.Parsed[3], ClassInput.Parsed[4], ClassInput.Parsed[5], ClassInput.Parsed[11], ClassInput.Parsed[10], ClassInput.Parsed[9]);        double RoomVolume = ClassCalculation.VolumeOfRoom(ClassInput.Parsed[6], ClassInput.Parsed[7], ClassInput.Parsed[8]);

        //Formatting to 2 places after the decimal place
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        //Prints out the values
        System.out.println("The area of the floor is: \n" + decimalFormat.format(FloorArea) + " metres squared \n");
        System.out.println("The required amount of paint is: \n" + decimalFormat.format(RequiredPaint) + " litres \n");
        System.out.println("The recommended amount of paint is: \n" + decimalFormat.format(RequiredPaint+ 1) + " litres \n");
        System.out.println("The volume of the room is: \n" + decimalFormat.format(RoomVolume) + " metres cubed \n");

    }
}


