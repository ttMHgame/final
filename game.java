import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game extends World
{
    public int point;
    public String pointShow = "";

    /**
     * Constructor for objects of class game.
     * 
     */
    public game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new  selector(), 100, 50);
    }
    public void act() {
        pointShow = Integer.toString(point);
        if(Greenfoot.isKeyDown("BACKSPACE")){   
            Greenfoot.setWorld(new background());
            
        }
        showText(pointShow, 500, 50);
         
            
        
    }
    public void update(){
        point++;
    }
}
