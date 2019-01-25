import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfadd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blank extends Actor
{

    /**
     * Constructor for objects of class CopyOfadd.
     * 
     */
    public blank()
    {
        GreenfootImage b = new GreenfootImage(200,50);
        
        
        
        
        b.setColor(Color.BLACK);
        
        
        b.drawRect(0, 0, 200, 50);
        setImage(b);
        
        
        
    }
    public void act(){
        
        if(Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(new text());
        }
    }
}
