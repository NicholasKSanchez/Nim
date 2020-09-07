/*
 * Programmer: Nicholas Sanchez
 * Purpose: To implement a smart computer that plays Nim
 * File name: SmartComputer.java
 */
package HonorableGameOfNim;

/**
 * A smart computer plays the name of nim
 */
public class SmartComputer implements Player{
    
    private String name = "SmartyPants" ;
    private int take ;
    
    /**
     * The computer decides how many marbles to remove from the pile
     * @return the number of marbles to remove
     */
    public int move(int pileSize)
    {
        if(pileSize >= 64) //if pile size is greater than 64
        {
            take = pileSize - 63 ; //take the amount needed to make 63
        } else if(pileSize >= 32)  //if pile size is greater than or equal to 32
        {
            if(pileSize == 63) //check if the pile is 63
            {
                take = 31 ; //take 31
            } else //take the amount to make the pile 31
            {
                take = pileSize - 31 ;
            }
        } else if(pileSize >= 16) //if pile size is greater than or equal to 16
        {
            if(pileSize == 31) //check if pile size is 31
            {
                take = 15 ; //take 15 marbles
            }else //else take the amount needed to make the pile 15
            {
                take = pileSize - 15 ;
            }
        } else if(pileSize >= 8) //if the pile is greater than or equal to 8
        {
            if(pileSize == 15) //check if the pile is 15 
            {
                take = 7 ; // take 7
            } else // take the amount needed to make the pile 7
            {
                take = pileSize - 7 ;
            }
        } else if(pileSize >= 4) // if the pile size is greater than 4
        {
            if(pileSize == 7) // check if the pile size is 7
            {
                take = 3 ; // take 3
            } else // take the amount needed to make the pile size 3
            {
                take = pileSize - 3 ;
            }
        } else //the pile size is either 3 or 2 so it has to take 1
        {
            take = 1 ;
        }
        System.out.println(take);
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
