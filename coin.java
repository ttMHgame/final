import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coinicon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends gameAssets
{
    /**
     * Act - do whatever the coinicon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
        // Add your action code here.
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
    if(isTouching(man.class)){
            game Game = (game) getWorld();
            getWorld().removeObject(this);
            Game.update();
        }

}
}    