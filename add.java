import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class add here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class add extends Actor
{
String num = "";
    /**
     * Constructor for objects of class add.
     * 
     */
    public add()
    {
        GreenfootImage b = new GreenfootImage(200,50);
        GreenfootImage bt = new GreenfootImage("h",25,Color.BLACK,Color.BLACK);
                  
        
        b.setColor(Color.PINK);
        
        b.fillRect(0, 0, 200, 50);
        b.setColor(Color.BLACK);
        b.drawString("add", 100, 25);
        
        b.drawRect(0, 0, 200, 50);
        setImage(b);
        
        
        
    }
    public void act(){
        messageHome d = (messageHome) getWorld();
        if(Greenfoot.mousePressed(this)){
            
            
            num = JOptionPane.showInputDialog( "type the number you would want to add", "i" );
           
           
        }
        
            
            d.k = num;
        
        
        
    }
}