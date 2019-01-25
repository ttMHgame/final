import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Actor
{
    int counter = 0;
    int health = 100;
    int delay = 0;
    private boolean moveRight = false; 
    /**
     * Act - do whatever the Boss2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
       
       
        // Add your action code here.
        counter++;
        delay++;
        imageCycle();
        damage();
        move();
    }
    public void imageCycle(){
        if(counter == 15){
            setImage("blue1.png");
            getImage().scale(200, 200);
        }
        if(counter == 20){
            setImage("blue2.png");
            getImage().scale(200, 200);
        }
      
        if(counter == 25){
            setImage("blue3.png");
            getImage().scale(200, 200);
        }
        if(counter == 30){
            setImage("blue4.png");
            getImage().scale(200, 200);
        }
        if(counter == 35){
            setImage("blue5.png");
            getImage().scale(200, 200);
        }
      
        if(counter == 40){
            setImage("blue6.png");
            getImage().scale(200, 200);
        }
        if(counter == 45){
            setImage("blue7.png");
            getImage().scale(200, 200);
        }
        if(counter == 50){
            setImage("blue8.png");
            getImage().scale(200, 200);
        }
      
        if(counter == 55){
            setImage("blue9.png");
            getImage().scale(200, 200);
        }
        if(counter == 60){
            setImage("blue10.png");
            getImage().scale(200, 200);
        }
        if(counter == 65){
            setImage("blue11.png");
            getImage().scale(200, 200);
        }
      
        if(counter == 70){
            setImage("blue12.png");
            getImage().scale(200, 200);
        }
        if(counter == 75){
            setImage("blue13.png");
            getImage().scale(200, 200);
        }
        if(counter == 80){
            setImage("blue14.png");
            getImage().scale(200, 200);
        }
      
        if(counter == 85){
            setImage("blue15.png");
            getImage().scale(200, 200);
        }
        if(counter == 90){
            setImage("blue16.png");
            getImage().scale(200, 200);
        }
        if(counter == 91){
            counter = 0;
        }
    }
    public void move(){
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
    }
    public void damage(){
    if(isTouching(bullet.class)){
            getWorld().removeObject(getOneIntersectingObject(bullet.class));
            health--;
        }
        if(health <= 0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new background());
    }
     if(delay >= 150){
            getWorld().addObject(new blueSkull(),getX(), getY());
            delay =0;
    }
    }
    }    

