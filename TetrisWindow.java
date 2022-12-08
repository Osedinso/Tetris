/*
 *Tetris Part 3
 * Purpose:Implementing a Tetris game  
 * Author:Kamsi Uwah && Jeremy Richard Ikediashi
 * Date Modified: November 28 2022.
 */



import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class TetrisWindow extends JFrame
{
    TetrisGame game;
    TetrisDisplay display;
   
    private int win_width = 400;
    private int win_height= 600;
    private int game_rows = 20;
    private int game_cols= 10;
    
    public TetrisWindow()
    {
        this.setTitle("My Tetris Project");
        this.setSize(win_width,win_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocation(10,200);
        
        game =new TetrisGame(game_rows,game_cols);
        display = new TetrisDisplay(game);
        this.add(display);
        initMenus();
        
        this.setVisible(true);
    }

    public void initMenus()
    {
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);
        
        JMenuItem saveGame = new JMenuItem("Save");
        gameMenu.add(saveGame); 
        
        JMenuItem retrieveGame = new JMenuItem("Retrieve");
        gameMenu.add(retrieveGame); 
        
        JMenuItem newGame = new JMenuItem("New");
        gameMenu.add(newGame); 
        
        JMenu score = new JMenu("Score");
        menuBar.add(score);
        
        JMenuItem highScore = new JMenuItem("High Score");
        score.add(highScore); 
        
        JMenuItem clearScore = new JMenuItem("Clear Score");
        score.add(clearScore); 
        
        newGame.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       game.newGame();
                    }
                });
        saveGame.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       String file_name = JOptionPane.showInputDialog("Please enter"
                               + " the name of the file you would like to save to");
                       game.saveToFile(file_name+".dat");
                       return;
                    }
                });
        retrieveGame.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                       game.retrieveFromFile();
                       return;
                    }
                });
        highScore.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null,game.scoreBoard(game.scores_file));
            }
        });
        clearScore.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                game.removeScores();
            }
        });
        this.setJMenuBar(menuBar);    
        
    }
    
    public static void main(String[] args) 
    {
        TetrisWindow myWindow = new TetrisWindow();
        
    }
}
