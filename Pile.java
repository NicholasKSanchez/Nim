/*
 * Programmer: Nicholas Sanchez
 * Purpose: To create a pile of marbles for Nim
 * File Name: Pile.java
 */
package HonorableGameOfNim;

import java.util.Random;

/**
 * A pile of marbles being used in the game of Nim
 */
public class Pile {
    
    private Random generator = new Random() ; //Random Pile Generator
    private int pile ; //amount of marbles in the pile
    
    /**
     * Creates a pile with an amount of marbles between 10 and 100
     */
    public Pile()
    {
        pile = generator.nextInt(91) + 10 ;
    }
    
    /**
     * Maintains the amount of marbles in pile after a player moves
     * @param move the amount of marbles a player takes
     * @return the new amount of marbles in the pile
     */
    public int maintain(int move)
    {
        return pile = pile - move ;
    }
    
    /**
     * Returns the amount currently in the pile
     * @return the amount in the pile
     */
    public int getAmount()
    {
        return pile ;
    }
}
