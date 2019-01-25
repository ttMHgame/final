import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class you here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class you extends storymodeAssets
{
    private int count = 0;
    private int counter = 0;
   private boolean start = true;
   private boolean shoot = false;
   private int shootcounter = 0;
   private boolean shootr = true;
   private boolean shoot2 = false;
    public you(){
        
      
        
    }
    /**
     * Act - do whatever the you wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        count++;
        counter++;
        checkKey();
        if(isTouching(bat.class)){
            getWorld().removeObject(getOneIntersectingObject(bat.class));
            getWorld().removeObject(this);
        }
        if(isTouching(blueSkull.class)){
            getWorld().removeObject(getOneIntersectingObject(blueSkull.class));
            getWorld().removeObject(this);
        }
        if(start == true){
        if(counter == 10){
            setImage("start1.png");
            getImage().scale(100, 100);
        }
        if(counter == 15){
            setImage("start2.png");
            getImage().scale(100, 100);
        }
        if(counter == 20){
            setImage("start3.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 25){
            setImage("start4.png");
            getImage().scale(100, 100);
        }
        if(counter == 30){
            setImage("start5.png");
            getImage().scale(100, 100);
        }
        if(counter == 35){
            setImage("start6.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 40){
            setImage("start7.png");
            getImage().scale(100, 100);
        }
        if(counter == 45){
            setImage("start8.png");
            getImage().scale(100, 100);
        }
        if(counter == 50){
            setImage("start9.png");
            getImage().scale(100, 100);
        }
      
        if(counter == 55){
            setImage("start10.png");
            getImage().scale(100, 100);
        }
        if(counter == 56){
            
            start = false;
            counter = 0;
        }
        }
        if(isTouching(enemyBullet.class)){
            getWorld().removeObject(getOneIntersectingObject(enemyBullet.class));
            getWorld().removeObject(this);
        }
    }    
    public void checkKey(){
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4, getY());
        }
        if(Greenfoot.isKeyDown("1") && count >= 50){
            shoot = true;
            
            
        }
        if(Greenfoot.isKeyDown("2") && count >= 100){
            shoot2 = true;
            
            
        }
        if(shoot == true){
            if(shootr == true){
                shootcounter++;
            } else {
                shootcounter--;
            }
                if(shootcounter == 5){
            setImage("end1.png");
            getImage().scale(100, 100);
        }
        if(shootcounter == 10){
            setImage("start2.png");
            getImage().scale(100, 100);
        }
        if(shootcounter  == 15){
            setImage("start3.png");
            getImage().scale(100, 100);
        }
        if(shootcounter == 16){
            shootr = false;
            getWorld().addObject(new bullet(), getX(), getY());
        }
        if(shootcounter == -1){
            shootr = true;
            shoot = false;
        }
                
        
         
    }
    if(shoot2 == true){
            if(shootr == true){
                shootcounter++;
            } else {
                shootcounter--;
            }
                if(shootcounter == 5){
            setImage("end1.png");
            getImage().scale(100, 100);
        }
        if(shootcounter == 10){
            setImage("start2.png");
            getImage().scale(100, 100);
        }
        if(shootcounter  == 15){
            setImage("start3.png");
            getImage().scale(100, 100);
        }
        if(shootcounter == 16){
            shootr = false;
            getWorld().addObject(new bullet(), getX(), getY());
            getWorld().addObject(new bullet(), getX(), getY());
        }
        if(shootcounter == -1){
            shootr = true;
            shoot2 = false;
        }
                
        
         
    }
    }
}

