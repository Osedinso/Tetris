/*
 *Tetris Part 3
 * Purpose:Implementing a Tetris game  
 * Author:Kamsi Uwah && Jeremy Richard Ikediashi
 * Date Modified: November 28 2022.
 */


public class EssBrick extends TetrisBrick 
{
        int startCol = 5;
        int startRow = 0;
        

    
    public EssBrick(int col,int numSeg ,int clrNum)
    {
        super( numSeg,clrNum);
        initPosition(col);

    }
    
    public void initPosition(int col)
    {
         position = new int [][]{   {col ,0},
                                {col, 1},
                                {col+1 ,1},
                                {col +1, 2}
        };orientation = 2;      
    }
    
    public void rotate()
    {
        switch(orientation)
        {
            case 1:  position = new int [][] {  {position[0][0] ,position[0][1]-2},
                                {position[1][0]-1 ,position[1][1]-1},
                                {position[2][0], position[2][1] },
                                {position[3][0]-1 , position[3][1]+1}
               };orientation=2;
            break;
            case 2: position  =  new int[][] {  {position[0][0] ,position[0][1]+2},
                                {position[1][0]+1   ,position[1][1]+1},
                                {position[2][0], position[2][1] },
                                {position[3][0] +1 , position[3][1]-1}
               };orientation=1;
            break;
               
        }
    }
    
    public void unrotate()
    {
        rotate();
    }
    
    
}