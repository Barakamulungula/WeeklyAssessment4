package com.company.Question_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

   /*
    Baraka Mulungula
     */


   List <String> clubs = new ArrayList<String>();

   private void addToArrayList(){
       clubs.add("Real Madrid");
       clubs.add("Barcelona");
       clubs.add("PSG");
       clubs.add("Bayern Munich");
       clubs.add("LA Galaxy");
       clubs.add("Chelsea");
   }

   private void displayArray(){
       for (String club:
            clubs) {
           System.out.println(club);
       }
   }

    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */

         Main main = new Main();
         main.addToArrayList();
         main.displayArray();


    }
}
