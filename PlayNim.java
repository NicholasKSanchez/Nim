/*
 * Programmer: Nicholas Sanchez
 * Purpose: To receive input from user and to create a game of Nim based off 
 * the input
 * File Name: PlayNim.java 
 */
package HonorableGameOfNim;

import java.util.Scanner;

/**
 * A class that begins the game of Nim
 */
public class PlayNim {
    
    public static void main(String[] args)
    {
        Scanner letsPlayAGame = new Scanner(System.in) ;//user input
        Player playerOne ; //player one in the game
        Player playerTwo ; //okayer two of the game
        Nim playNim ;      //the class that controls the game once created
        
        System.out.println("Want to play a game of Nim?(Y to continue)");
        
        //A loop that allows the user to play as many games as they want
        while(letsPlayAGame.next().equalsIgnoreCase("Y"))
        {
            System.out.println("Player 1: Human or Computer?");
            
            //if player one is human asks them their name
            if(letsPlayAGame.next().equalsIgnoreCase("Human"))
            {
                System.out.println("What is your name?");
                playerOne = new Human(letsPlayAGame.next()) ;
            } else //select the difficulty of the player one computer
            {
                System.out.println("Easy or Hard Computer?");
                if(letsPlayAGame.next().equalsIgnoreCase("Easy"))
                {
                    playerOne = new BelowAverageComputer() ; //easy computer
                } else
                {
                    playerOne = new SmartComputer() ; //hard computer
                }
            }
            
            System.out.println("Player 2: Human or Computer?");
            
            //if player two is human, ask for their name
            if(letsPlayAGame.next().equalsIgnoreCase("Human"))
            {
                System.out.println("What is your name?");
                playerTwo = new Human(letsPlayAGame.next()) ;
            } else //ask for the difficulty of the player two computer
            {
                System.out.println("Easy or Hard Computer?");
                if(letsPlayAGame.next().equalsIgnoreCase("Easy"))
                {
                    playerTwo = new BelowAverageComputer() ; //easy computer
                } else
                {
                    playerTwo = new SmartComputer() ; //hard computer
                }
            }
            
            System.out.println("Who goes first? (Type 1 or 2)") ;
            
            //creates nim object based off who goes first
            if(letsPlayAGame.next().equals("1"))
            {
                playNim = new Nim(playerOne, playerTwo) ; //player one is first
                        
            } else
            {
                playNim = new Nim(playerTwo, playerOne) ; //player two is first
            }
            
        
            System.out.println("The winner is " + playNim.play()) ; //play nim
            
            System.out.println("Play Again?(y for yes)");
           
        }
        
    }
    
}
