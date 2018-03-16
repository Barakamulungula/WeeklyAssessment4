package com.company.Question_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */

         Main main = new Main();
         main.enterAString();


    }

    private void enterAString(){
        System.out.println("Guess a letter");

        try {

            String guess = input.nextLine();
            switch (guess.toUpperCase()) {
                case "A":
                    System.out.println("Correct");
                    break;
                case "B":
                    System.out.println("Correct");
                    break;
                case "C":
                    System.out.println("Correct");
                    break;
                case "d":
                    System.out.println("Correct");
                    break;
                default:
                    System.out.println("WRONG");
                    enterAString();
                    break;
            }
        }catch (InputMismatchException imfe){
            input.nextLine();
            System.out.println("enter valid input");
            enterAString();
        }
    }


}
