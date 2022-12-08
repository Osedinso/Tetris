/*
 *Tetris Part 3
 * Purpose:Implementing a Tetris game  
 * Author:Kamsi Uwah && Jeremy Richard Ikediashi
 * Date Modified: November 28 2022.
 */


import java.awt.*;
import java.awt.event.*;
import java.util.*;

public abstract class TetrisBrick 
{
    protected int [][] position;   
    protected int orientation;
    protected int numSegments = 4;
    public int colorNum;
    
 

    public TetrisBrick( int numSeg ,int clrNum)
    {
        
        colorNum = clrNum;
        this.numSegments = numSeg;
        
        
    }
    
    public abstract void initPosition(int mid);
    
    public boolean moveDown()
    {
        for (int seg =0; seg<numSegments; seg++){
            position[seg][1]++;
        }
        return true;
    }
    
    public boolean moveUp()
    {
        
        for (int seg = 0; seg < numSegments; seg++)
        {
            position [seg] [1]--;
        }
        return true;
    }   
    
    public boolean moveRight()
    {
        for (int seg =0; seg <numSegments; seg++)
        {
            position [seg] [0]++;
        }
        return true;
    } 
    
    public boolean moveLeft()
    {
        for (int seg =0; seg <numSegments; seg++)
        {
            position [seg] [0]--;
        }
        return true;
    }
    
    public int getPosition(int row, int col) { 
        for(int seg = 0; seg< numSegments; seg++)
        {
            if(position[seg][1]==row && position[seg][0]==col)
            {
                return 1;
            }
        }return 0;
    }

    public int getColorNum() {
        return colorNum;
    }
    
    public int getSegRows(int row) {
        return position[row][1];
    }

    public int getSegCols(int col) {
       return position[col][0];
    }
   public int getNumSegments()
   {
       return numSegments;
   }
   public abstract void rotate();
   
   public abstract void unrotate();
   
}
