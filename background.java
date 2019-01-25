import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       
        addObject(new messaging(), 500, 350);
        addObject(new cunapp(), 100, 200);
        addObject(new CopyOfcunapp(), 250, 200);
        
    }
}
