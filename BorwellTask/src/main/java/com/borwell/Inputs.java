package com.borwell;

import java.util.Scanner;

public class Inputs {
    public Scanner InputScanner = new Scanner(System.in);

    private String[] Required = {"floor width: ", "floor depth: ", "wall width: ", "wall height: ", "window width: ", "window height: ", "room width: ", "room height: ", "room depth: ", "number of windows in the room: ", "number of doors in the room: ", "number of walls in the room: "};
    private String[] Inputs = new String[12];
    private Double[] Parsed = new Double[12];

    //
    public void Collect()
    {
        for(int q=0; q<=11; q++)
        {
            boolean isParsed = false;
            System.out.println("Please enter the " + Required[q]);
            Inputs[q] = InputScanner.nextLine();

            while(isParsed == false)
            {
                try
                {
                    Parsed[q] = Double.parseDouble(Inputs[q]);
                    isParsed = true;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Your input was invalid. Please enter the " + Required[q] + " again");
                    Inputs[q] = InputScanner.nextLine();
                }
            }
        }
    }
}
