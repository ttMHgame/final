import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blueSkull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueSkull extends Actor
{
    int counter = 0;
    int health = 2;
    /**
     * Act - do whatever the blueSkull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       
        // Add your action code here.
        counter++;
        if(counter == 15){
            setImage("blue1.png");
            getImage().scale(100, 100);
        }
        if(counter == 20){
            setImage("blue2.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 25){
            setImage("blue3.png");
            getImage().scale(100, 100);
        }
        if(counter == 30){
            setImage("blue4.png");
            getImage().scale(100, 100);
        }
        if(counter == 35){
            setImage("blue5.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 40){
            setImage("blue6.png");
            getImage().scale(100, 100);
        }
        if(counter == 45){
            setImage("blue7.png");
            getImage().scale(100, 100);
        }
        if(counter == 50){
            setImage("blue8.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 55){
            setImage("blue9.png");
            getImage().scale(100, 100);
        }
        if(counter == 60){
            setImage("blue10.png");
            getImage().scale(100, 100);
        }
        if(counter == 65){
            setImage("blue11.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 70){
            setImage("blue12.png");
            getImage().scale(100, 100);
        }
        if(counter == 75){
            setImage("blue13.png");
            getImage().scale(100, 100);
        }
        if(counter == 80){
            setImage("blue14.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 85){
            setImage("blue15.png");
            getImage().scale(100, 100);
        }
        if(counter == 90){
            setImage("blue16.png");
            getImage().scale(100, 100);
        }
        if(counter == 91){
            counter = 0;
        }
        move(2);
         Actor you = (Actor)getWorld().getObjects(you.class).get(0);
        turnTowards(you.getX(), you.getY());
    if(isTouching(bullet.class)){
            getWorld().removeObject(getOneIntersectingObject(bullet.class));
            health--;
        }
        if(health <= 0){
            getWorld().removeObject(this);
        }
    }    
}
