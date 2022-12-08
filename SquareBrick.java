/*
 *Tetris Part 3
 * Purpose:Implementing a Tetris game  
 * Author:Kamsi Uwah && Jeremy Richard Ikediashi
 * Date Modified: November 28 2022.
 */


public class SquareBrick extends TetrisBrick
{
    public SquareBrick(int col, int numSeg ,int clrNum)
    {
        super(numSeg,clrNum);
        initPosition(col);

    }
    
    public void initPosition(int col)
    {
        int startCol = 5;
        int startRow = 0;
        
     
            position = new int [][]{   {col ,0},
                                {col, 1},
                                {col+1 ,0},
                                {col+1, 1}
                                     
        };       
    }
    
    public void rotate()
    {    
    }
    
    public void unrotate()
    {
        
    }
    
}
