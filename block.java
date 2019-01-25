import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blockplace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class block extends gameAssets
{
    boolean clicked = true;
    /**
     * Act - do whatever the blockplace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
        
        if(clicked == true){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }   
    if(Greenfoot.mouseClicked(this)){
        clicked = false;
        
    }
    
}
}
