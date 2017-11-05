package com.borwell;

public class Main {
    public static void main (String[] args)
    {
        Inputs ClassInput = new Inputs();
        Display ClassDisplay = new Display();
        PaintCalculation ClassCalculation = new PaintCalculation();

        //Receives the user's input
        ClassInput.Collect();

        //The calculation is run and values are returned
        double FloorArea = ClassCalculation.AreaOfFloor(ClassInput.Parsed[0], ClassInput.Parsed[1]);
        double RequiredPaint = ClassCalculation.RequiredPaint(ClassInput.Parsed[2], ClassInput.Parsed[3], ClassInput.Parsed[4], ClassInput.Parsed[5], ClassInput.Parsed[11], ClassInput.Parsed[10], ClassInput.Parsed[9]);        double RoomVolume = ClassCalculation.VolumeOfRoom(ClassInput.Parsed[6], ClassInput.Parsed[7], ClassInput.Parsed[8]);


        //Prints the values
        ClassDisplay.Send(FloorArea, RequiredPaint, RoomVolume);
    }
}


