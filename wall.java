import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{public void act() 
    {
        hit();
    }    
    public void hit(){
    Actor ball = getOneIntersectingObject(ball.class);

    if (ball != null) {
        getWorld().removeObject(ball);
    Life.life--;
Greenfoot.playSound("hitwall.wav");
     
    }
    
    }
}
