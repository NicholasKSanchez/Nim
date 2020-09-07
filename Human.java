/*
 * Programmer: Nicholas Sanchez
 * Purpose: To allow a human to play Nim
 * File Name: Human.java
 */
package HonorableGameOfNim;

import java.util.Scanner;

/**
 * Allows a human to play the game of Nim
 */
public class Human implements Player{
    
    private String name ; //the players name
    private boolean legalMove ; //wether the move is legal or not
    private Scanner input = new Scanner(System.in) ; // player input
    private int take ; // what the player takes
    
    /**
     * constructs a human object with a name
     * @param name the players name
     */
    public Human(String name)
    {
        this.name = name ;
    }
    /**
     * Allows the human to decide how many marbles they want to take from the 
     * pile
     * @return the amount of marbles taken from the pile 
     */
    public int move(int pileSize)
    {
        legalMove = false ;
        
        //while not a legal move
        while(!legalMove)
        {
            take = input.nextInt() ; //receive move from the user
            
            //if the user tries to take more than half the pike
            //print error message
            if(take > pileSize / 2)
            {
                System.out.println("Sorry, you can't take more than half of the"
                        + " marbles!");
            } else //the move is valid
            {
                legalMove = true ;
            }
        }
        System.out.println(this.getName() + " took " + take + " marbles.");
        return take ; //return the players move
    }
    
    /**
     * Returns the name of the player
     * @return the name of the player
     */
    public String getName()
    {
        return name ;
    }
    
}
