/*
 * Programmer: Nicholas Sanchez
 * Purpose: To implement a dumb computer that plays nim
 * File Name: BelowAverageComputer.java
 */
package HonorableGameOfNim;

import java.util.Random;

/**
 * A below average computer that plays the game of Nim
 */
public class BelowAverageComputer implements Player{
    
    private String name = "DUMMY"; // name of the computer
    private int take ; // the dummy's move
    private Random generator = new Random() ; //how the dummy decides his move
    
    
    /**
     * The computer decides how many marbles to remove from the pile
     * @param pileSize the size of the pile
     * @return the number of marbles to remove
     */
    public int move(int pileSize)
    {
        //the dummy takes a random number of marbles from the pile 
        take = generator.nextInt((pileSize / 2)) + 1 ;
        System.out.println(this.getName() + " took " + take + " marbles.");
        return take ;
    }
    
    /**
     * Returns the name of the computer
     * @return the name of the computer
     */
    public String getName()
    {
        return name ;
    }
    
}
