package com.borwell;

import java.util.Scanner;

public class Inputs {
    public Scanner InputScanner = new Scanner(System.in);
    //Naming and setting variables
    public String[] Required = {"floor width", "floor depth", "wall width", "wall height", "window width", "window height", "room width", "room height", "room depth", "number of windows in the room", "number of doors in the room", "number of walls in the room"};
    public String[] Inputs = new String[12];
    public Double[] Parsed = new Double[12];

    //
    public void Collect()
    {
        //Going through the Required array to print the message and storing the response in the Inputs array
        for(int q=0; q<=11; q++)
        {
            boolean isParsed = false;
            System.out.println("Please enter the " + Required[q] + (": "));
            Inputs[q] = InputScanner.nextLine();
            //Keeps loop to ensure the user inputs the right value
            while(isParsed == false)
            {
                try
                {
                    Parsed[q] = Double.parseDouble(Inputs[q]);
                    isParsed = true;
                }
                catch(NumberFormatException ex)//If the loop parsing process fails the code below is run
                {
                    System.out.println("Your input was invalid. Please enter the " + Required[q] + " again");
                    Inputs[q] = InputScanner.nextLine();
                }
            }
        }
    }
}
