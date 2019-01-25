import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bat extends Actor
{
    int counter = 0;
    /**
     * Act - do whatever the bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       getImage().scale(50, 50);
        // Add your action code here.
        counter++;
        if(counter == 10){
            setImage("tile000.png");
            getImage().mirrorVertically();
        }
        if(counter == 15){
            setImage("tile001.png");
            getImage().mirrorVertically();
        }
      
        if(counter == 20){
            setImage("tile002.png");
            getImage().mirrorVertically();
        }
        if(counter == 21){
            counter = 0;
        }
        move(1);
        Actor you = (Actor)getWorld().getObjects(you.class).get(0);
        turnTowards(you.getX(), you.getY());
    if(isTouching(bullet.class)){
            getWorld().removeObject(getOneIntersectingObject(bullet.class));
            getWorld().removeObject(this);
        }
        
        
    }    
}
