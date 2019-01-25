import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class addhome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class addhome extends World
{
    public String num = "";
    public boolean timer = false;
    public int i = 0;

    /**
     * Constructor for objects of class addhome.
     * 
     */
    public addhome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    public void act(){
        if(Greenfoot.mousePressed(this)){
             timer = true;
            
            num = JOptionPane.showInputDialog( "type the number you would want to add", null );
           
           
        }
        if(timer == true){
            if(i == 1000){
            Greenfoot.setWorld(new messageHome());
        }
        i++;
    }
    }
}
