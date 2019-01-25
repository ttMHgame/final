import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class manicon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manicon extends selector
{
    /**
     * Act - do whatever the manicon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
           getImage().scale(25, 25);
         if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new man(), getX(), getY());
    }
    }    
}
