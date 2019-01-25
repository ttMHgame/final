import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends storymodeAssets
{

    /**
     * Constructor for objects of class start.
     * 
     */
    public start()
    {
        GreenfootImage b = new GreenfootImage(200,50);
        GreenfootImage bt = new GreenfootImage("Start",25,Color.RED,null);
                  
        
        b.setColor(Color.PINK);
        
        b.fillRect(0, 0, 200, 50);
        b.setColor(Color.BLACK);
        bt.drawString("start", 100, 25);
        
        b.drawRect(0, 0, 200, 50);
        setImage(bt);
        
        
        
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new level());
        }
        
        
        
    }
}
