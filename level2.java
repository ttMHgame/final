import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    private boolean playedSound = false;
    int lr = 0;
    int countToBoss = 5;

    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {
        super(1056, 672, 1); 
        

        prepare();
    }

    public void act(){
        lr = Greenfoot.getRandomNumber(2)+1;
        if(countToBoss >= 1){
            if(Greenfoot.getRandomNumber(101) > 100-1){
                if(lr == 1){
                    addObject(new blueSkull(), getWidth(), getHeight()/2);
                    countToBoss--;
                } 
                if(lr == 2){
                    addObject(new blueSkull(), 0, getHeight()/2);
                    countToBoss--;
                }
            }
            if(playedSound == false){
                Greenfoot.playSound("Battle-ricercare.mp3");
                playedSound = true;

            }
        }
        if(countToBoss == 0){
            addObject(new Boss2(), getWidth()-10, 300);
            countToBoss--;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        you you = new you();
        addObject(you,564,516);
    }
}
