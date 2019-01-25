import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends gameAssets
{
    int gravity;
    boolean g = false;
    boolean clicked = true;
    int count=0;
  
    
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        keys();
        
        
        if(clicked == true){
            setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
            gravity = Greenfoot.getMouseInfo().getY();
        }
        if(Greenfoot.mouseClicked(this)){
            clicked = false;
            g = true;
        }
        if(g == true){
             setLocation(getX(),gravity );
             
            count++;
            if(count > 5){
                gravity = gravity+5;
                
                count = 0;
            }
       
           
            
        }
        if(isTouching(block.class)){
            g = false;
     
if (isTouching(platformLeft.class)){
    setLocation(getX()+4, getY());
}
if (isTouching(platformRight.class)){
    setLocation(getX()-4, getY());
}
        }
        if(isTouching(block.class) == false){
            g = true;
        }
        if(isAtEdge() == true){
            getWorld().removeObject(this);
        }
        
    }
    public void keys(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,gravity );
    }
      if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,gravity );
    }
    if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-4);
            setLocation(getX(),getY()-4 );
            setLocation(getX(),getY()-4 );
            setLocation(getX(),getY()-4 );
            setLocation(getX(),getY()-4);
            setLocation(getX(),getY()-4 );
            gravity = gravity - 4;
    }
}
}
