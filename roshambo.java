// Name: roshambo.java
// Author: Ansonia McIntire
// Date: 9/21/2024
// Purpose: roshambo

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

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
        int user_choice;
        
      
        //title
        
        JOptionPane.showMessageDialog(null, "THE EPIC ROSHAMBO!!!\nWelcome to Roshambo! I am your host for today and since today's a great day, let's have a great game!\nBefore we start I need to give you some ground rules. Well, only two rules, and these rules are have fun and win lots!\nTo start the game, I will give you four options to choose from. These options are...\nRock = 1,\tPaper = 2,\tScissors = 3,\tQuit = 4\nSo, why dont you choose an option?");

        user_choice = Integer.parseInt(JOptionPane.showInputDialog(null,"What number do you choose? "));

        JOptionPane.showMessageDialog(null, "You chose number " + user_choice);
        
        if (user_choice == 4) {
            JOptionPane.showMessageDialog(null, "Since you chose '4'...the game was quit. Thank you for playing!!!");
        }

        //loop
        //System.out.println("\n Rock = 1, \n Paper = 2, \n Scissors = 3, \n Quit = 4");

            //System.out.print("What number do you pick? ");
            //int user_choice = keyboard.nextInt();
             
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