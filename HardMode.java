import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HardMode extends World
{

    /**
     * Constructor for objects of class HardMode.
     * 
     */
    public HardMode()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        addObject(new Goal(),500,154);
        addObject(new hardkeeper(),500,259);
        addObject(new rehard(),866,44);
        addObject(new home(),945,48);
        addObject(new Timer(),500,40);
        addObject(new Score(),150,40);
        addObject(new Life(),762,40);
        Life.life = 3;
        Score.score = 0;

    }
     public void act(){
         if(getObjects(ball.class).isEmpty()){
           addObject(new ball(),500,855);
           addObject(new arrow(),500,757);
           removeObjects(getObjects(wall.class));
           addObject(new wall(),Greenfoot.getRandomNumber(580)+250 ,Greenfoot.getRandomNumber(200)+280 );
   addObject(new wall(),Greenfoot.getRandomNumber(580)+250 ,Greenfoot.getRandomNumber(200)+280 );
addObject(new wall(),Greenfoot.getRandomNumber(580)+250 ,Greenfoot.getRandomNumber(200)+280 );
   addObject(new wall(),Greenfoot.getRandomNumber(580)+250 ,Greenfoot.getRandomNumber(200)+280 );
addObject(new wall(),Greenfoot.getRandomNumber(580)+250 ,Greenfoot.getRandomNumber(200)+280 );
    }
    
}
    }

