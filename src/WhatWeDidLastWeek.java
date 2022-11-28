/*
Recap of Week 2 Capita NOVUS Fullstack Software Development.
 */

//Import Libraries
import java.util.Scanner;

public class WhatWeDidLastWeek {
    public static void main(String[] args) {
        //Initialise Variables
        String output = "Output!";

        //Print an output string.
        System.out.println(output);

        //Input Age Method
        getAge();

    }

    public static void getAge(){
        //Initialise Variables
        int age=0;

        //Create a scanner for user input of age.
        // Scanner loops until a valid value is inputted.
        boolean validInput = false;

        while(!validInput) {
            try {
                Scanner reader = new Scanner(System.in);
                System.out.print("Input your age: ");
                age = reader.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Value not Valid!");
            }
        }
        System.out.println("Your age is: " + age + ".");
    }
}