package com.borwell;

public class PaintCalculation
{
    //Returns the area of the floor
    public double AreaOfFloor(double FloorWidth, double FloorDepth)
    {
        double FloorArea = FloorWidth * FloorDepth;

        return FloorArea;
    }

    public double RequiredPaint(double WallWidth, double WallHeight, double WindowWidth, double WindowHeight, double NumberOfWalls, double NumberOfDoors, double NumberOfWindows)
    {
        double ReturnValue = 0;

        //Setting the areas
        double WallArea = WallWidth * WallHeight;
        double WindowArea = WindowWidth * WindowHeight;
        double DoorArea = 2.04 * 0.82;

        // Multiplying the Areas to Number of walls/windows/doors
        double FullWallArea = WallArea * NumberOfWalls;
        double FullWindowArea = WindowArea * NumberOfWindows;
        double FullDoorArea = DoorArea * NumberOfDoors;

        //Area Manipulation
        double TotalWallArea = FullWallArea - (FullWindowArea + FullDoorArea); // Only walls, no windows or doors.
        double PaintRequired = TotalWallArea / 10; //1 litre of paint can cover 10 square metres.
        ReturnValue = PaintRequired;

        return ReturnValue;
    }
    public double VolumeOfRoom (double RoomWidth, double RoomHeight, double RoomDepth)
    {
        double VolumeOfRoom = RoomWidth * RoomDepth * RoomHeight;

        return VolumeOfRoom;
    }

}
