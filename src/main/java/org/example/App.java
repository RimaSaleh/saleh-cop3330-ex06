/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

//import statement for year
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();

        //print statement asking for current age to be inputted
        System.out.println( "What is your current age? " );
        //number will be inputted and stored as "age"
        int age = scanner.nextInt();

        //print statement asking for retirement age to be inputted
        System.out.println( "At what age would you like to retire? " );
        //number will be inputted and stored as "retireAge"
        int retireAge = scanner.nextInt();

        //print year, retirement year, and years left until retirement
        System.out.format( "You have %d years left until you can retire.\n", retireAge - age);
        System.out.format( "It's %d, so you can retire in %d", calendar.get(Calendar.YEAR) , (calendar.get(Calendar.YEAR)) + (retireAge - age) );
    }
}