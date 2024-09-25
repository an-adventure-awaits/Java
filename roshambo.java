// Name: roshambo.java
// Author: Ansonia McIntire
// Date: 9/21/2024
// Purpose: roshambo

import java.util.Scanner;
import java.util.Random;

    
public class roshambo{
    public static void main(String[] args) {
        
        // input Scanner
        Scanner keyboard = new Scanner(System.in);

        // Random integer
        Random rand = new Random();


        
            // variables
            int computer = rand.nextInt(1,4);
            int rock = 1;
            int paper = 2;
            int scissors = 3;
            int score_computer =+ 1;
            int score_user =+ 1;
            int running_total = 0;
            int still_running = 4;
            int computer_win = 0;
            int player_win = 0;

            
            //title
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~  THE EPIC ROSHAMBO!!!  ~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

            //loop
            while (still_running == 4) {
                System.out.println("\n Rock = 1, \n Paper = 2, \n Scissors = 3,");

                
                System.out.print("What number do you pick? ");
                int user = keyboard.nextInt();


                // if 
                if (computer == rock) {

                    if (user == rock) {

                    System.out.println("You picked rock!");
                    }

                    else if (user == paper) {
                    System.out.println("You picked paper!");
                    }

                    else if (user == scissors) {
                    System.out.println("You picked scissors!");
                    }
                    }

                
                // else if 
                else if (computer == paper) {

                    if (user == rock) {
                    System.out.println("You picked rock!");
                    }

                    else if (user == paper) {
                    System.out.println("You picked paper!");
                    }

                    else if (user == scissors) {
                    System.out.println("You picked scissors!");
                    }}
                    

                // else if 
                else if (computer == scissors) {

                    if (user == rock) {
                    System.out.println("You picked rock!");
                    }

                    else if (user == paper) {
                    System.out.println("You picked paper!");
                    }

                    else if (user == scissors) {
                    System.out.println("You picked scissors!");
                    }
                    }}
                    

        // close out program
        keyboard.close();

    }
}

    
