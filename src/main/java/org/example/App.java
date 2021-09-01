package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 21 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        int month = stringToInt("Please enter the number of months: ");
        String monthText = monthCheck(month);

        System.out.println("The name of the month is " + monthText);

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String error)
    {
        int temp = 0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Integer.parseInt(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");


            }
        }
        return temp;
    }

    public static double stringToDouble (String error)
    {
        double temp = 0.0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Double.parseDouble(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");

            }
        }
        return temp;
    }

    public static String monthCheck (int num) {
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
