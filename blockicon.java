import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blockicon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blockicon extends selector
{
    /**
     * Act - do whatever the blockicon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale(25, 25);
         if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new block(), getX(), getY());
    }
    }    
}
