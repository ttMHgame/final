import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platformRighticon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platformRighticon extends selector
{
    
    /**
     * Act - do whatever the platformRighticon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
              if(Greenfoot.mouseClicked(this)){
            getWorld().addObject(new platformRight(), getX(), getY());
    }
    }    
}
