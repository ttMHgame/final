import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;


/**
 * Write a description of class messageHome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class messageHome extends World
{
   private boolean num12 = false;
   public String k;
    

   
    /**
     * Constructor for objects of class messageHome.
     * 
     */
    public messageHome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new add(), 100, 25);
       
        
        addObject(new add(), 300, 25);
        k= "e";
        addObject(new back(), 500, 25);
        for(int i = 75;i<getHeight();i=i+50){
            addObject(new blank(), 300, i);
        }
          for(int i = 75;i<getHeight();i=i+50){
            addObject(new blank(), 100, i);
        }  
        for(int i = 75;i<getHeight();i=i+50){
            addObject(new blank(), 500, i);
        }
        
    }
    public void act(){
        
        showText(k, 50, 75);
        
        
           
            
        
    }
    public void booleans(){
         
        
    }
    
    
    
}
