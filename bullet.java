import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends storymodeAssets
{
  private boolean start = true;
  public bullet(){
      getImage().scale(5, 5);
    }
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(20);
        
        if(start == true){
            turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
            start = false;
        }
        
        
        if(isAtEdge()==true){
            getWorld().removeObject(this);
        }
            
    }    
}
