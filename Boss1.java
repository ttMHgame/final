import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Actor
{
    int counter = 0;
    int health = 25;
    int delay = 0;
    private boolean moveRight = false; 
    /**
     * Act - do whatever the Boss1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       getImage().scale(200, 200);
       
        // Add your action code here.
        counter++;
        delay++;
        if(counter == 10){
            setImage("tile000.png");
            
        }
        if(counter == 15){
            setImage("tile001.png");
            
        }
      
        if(counter == 20){
            
        }
        if(counter == 21){
            counter = 0;
        }
        if(moveRight == false){
            setLocation(getX()-4, getY());
        } else {
            setLocation(getX()+4, getY());
        }
        if(getX() <= 0){
            moveRight = true;
        }
        if(getX() >= 1050){
            moveRight = false;
        }
    if(isTouching(bullet.class)){
            getWorld().removeObject(getOneIntersectingObject(bullet.class));
            health--;
        }
        if(health <= 0){
            getWorld().removeObject(this);
            
            Greenfoot.setWorld(new level2());
        }
        if(delay >= 1000){
            getWorld().addObject(new enemyBullet(),getX(), getY());
            delay =0;
        }
    }    
}
