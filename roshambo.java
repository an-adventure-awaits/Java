// Name: roshambo.java
// Author: Ansonia McIntire
// Date: 9/21/2024
// Purpose: roshambo

import java.util.Scanner;
import java.util.Random;

public class roshambo {
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
        int computer_win = 0;
        int player_win = 0;
        
        

            
        //title
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~  THE EPIC ROSHAMBO!!!  ~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

       
        
            
        
        //loop

        System.out.println("\n Rock = 1, \n Paper = 2, \n Scissors = 3, \n Quit = 4");

    
            System.out.print("What number do you pick? ");
            int user_choice = keyboard.nextInt();
             
        while (user_choice < 4) {
            
            // if 
            if (user_choice == rock) {

                if (computer == rock) {

                System.out.println("You picked rock...and you tied:/");
                computer_win += 1;
                player_win += 1;

                }

                else if (computer == paper) {
                System.out.println("You picked paper!\n You won! Yay!!!:)");
                player_win += 1;
                }

                else if (computer == scissors) {
                System.out.println("You lost!");
                computer_win += 1;
                }
                }

            
            // else if 
            else if (computer == paper) {

                if (user_choice == rock) {
                System.out.println("You picked rock!");
                computer_win += 1;
                
                }

                else if (user_choice == paper) {
                System.out.println("You picked paper!");
                computer_win += 1;
                player_win += 1;
                }

                else if (user_choice == scissors) {
                System.out.println("You picked scissors!");
                player_win += 1;
                }}
                

            // else if 
            else if (computer == scissors) {

                if (user_choice == rock) {
                System.out.println("You picked rock!");
                player_win += 1;
                }

                else if (user_choice == paper) {
                System.out.println("You picked paper!");
                computer_win += 1;
                }

                else if (user_choice == scissors) {
                System.out.println("You picked scissors!");
                computer_win += 1;
                player_win += 1;
                }
            }
            

        //str still_running = "y";
        //String still_running = String.format("");
        String score = String.format("The score is Computer: %d, and Player: %d", computer_win, player_win);
        System.out.println(score);
        
        
        System.out.println("Enter '4' to exit");
        user_choice = keyboard.nextInt();
    

    

    //}
}
// close out program
keyboard.close();


}
}