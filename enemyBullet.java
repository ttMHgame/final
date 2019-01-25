import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemyBullet extends storymodeAssets
{
  private boolean start = true;
  public enemyBullet(){
      getImage().scale(5, 5);
    }
    /**
     * Act - do whatever the enemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(20);
        
        if(start == true){
            Actor you = (Actor)getWorld().getObjects(you.class).get(0);
        turnTowards(you.getX(), you.getY());
            start = false;
        }
        
        
        if(isAtEdge()==true){
            getWorld().removeObject(this);
        }
            
    }    
}
