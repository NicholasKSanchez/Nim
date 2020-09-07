/*
 * Programmer: Nicholas Sanchez
 * Purpose: To conduct the game of Nim
 * File Name: Nim.java
 */
package HonorableGameOfNim;

/**
 * Conducts the game of Nim being played by two players
 */
public class Nim {
    
    private Pile pile ;
    private Player first ;
    private Player second ;
    private int move ;
    
    /**
     * Constructs a Nim object
     * @param first the player going first
     * @param second the player going second
     */
    public Nim(Player first, Player second)
    {
        pile = new Pile() ;
        this.first = first ;
        this.second = second ;
    }
    
    /**
     * Allows the two players to play the game
     */
    public String play()
    {
        
        //Keeps the loop running until the pile amount is 1
        while(pile.getAmount() != 1)
        {
            //prints the amount in the pile
            System.out.println("Pile size is: " + pile.getAmount());
            System.out.println("What is your move " + first.getName() + " ?");
            
            move = first.move(pile.getAmount()) ;//player ones move
            pile.maintain(move) ;//deduct player ones move from the pile
            
            //if pile is not equal to one ask player two for their move
            if(pile.getAmount() != 1)
            {
                System.out.println("Pile size is: " + pile.getAmount());
                System.out.println("What is your move " + second.getName() 
                                   + " ?");
                move = second.move(pile.getAmount()) ;//player twos move
                pile.maintain(move) ;//deduct player twos move from the pile
            } else //player one wins
            {
                return first.getName() ; //return player ones name
            }
        }
        return second.getName() ; //player two wins return their name
    }
}
