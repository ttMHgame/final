import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{
    private boolean playedSound = false;
    int lr = 0;
    int countToBoss = 10;

    /**
     * Constructor for objects of class level.
     * 
     */
    public level()
    {
        super(1056, 672, 1); 
        addObject(new you(),564,516);

        
    }

    public void act(){
        lr = Greenfoot.getRandomNumber(2)+1;
        if(countToBoss >= 1){
        if(Greenfoot.getRandomNumber(101) > 100-1){
            if(lr == 1){
            addObject(new bat(), getWidth(), getHeight()/2);
            countToBoss--;
        } 
        if(lr == 2){
            addObject(new bat(), 0, getHeight()/2);
            countToBoss--;
        }
        }
        if(playedSound == false){
            Greenfoot.playSound("Battle-ricercare.mp3");
            playedSound = true;
            
        }
     }
    if(countToBoss == 0){
        addObject(new Boss1(), getWidth()-10, 300);
        countToBoss--;
    }
 }

    
}
