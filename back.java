import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor
{

    /**
     * Constructor for objects of class back.
     * 
     */
    public back()
    {
        GreenfootImage b = new GreenfootImage(200,50);
        GreenfootImage bt = new GreenfootImage("h",25,Color.BLACK,Color.BLACK);
        
        
        b.setColor(Color.PINK);
        
        b.fillRect(0, 0, 200, 50);
        b.setColor(Color.BLACK);
        b.drawString("back", 100, 25);
        
        b.drawRect(0, 0, 200, 50);
        setImage(b);
        
        
        
    }
    public void act(){
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new background());
        }
        
        
    }
}
