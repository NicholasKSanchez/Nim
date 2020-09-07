/*
 * Programmer: Nicholas Sanchez
 * Purpose: An interface for a Player of Nim
 * File Name: Player.java
 */
package HonorableGameOfNim;

/**
 *Describes any class that can play the game of Nim
 */
public interface Player {
    /**
     * The player chooses how many marbles to take from pile
     * @param pileSize the size of the pile
     * @return The number of marbles taken
     */
    int move(int pileSize) ;
    
    /**
     * Returns the players name
     * @return the players name
     */
    String getName() ;
}
