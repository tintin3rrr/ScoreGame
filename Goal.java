import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goal extends Actor
{
    /**
     * Act - do whatever the Goal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        goal();
    }    
    public void goal(){
    Actor ball = getOneIntersectingObject(ball.class);

    if (ball != null) {
        getWorld().removeObject(ball);
        Score.score++;
Greenfoot.playSound("cheer.wav");
  
    
     
    }
        
        
    }

    }
