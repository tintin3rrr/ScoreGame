import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int timersec = 60;
    private int timer = 120;
    
    public void act() 
    {
        if (timersec>0){
            timersec--;
        }
        if(timersec==0){
            timer--;
            timersec=60;
        }
        if(timer==0){
         Greenfoot.setWorld(new ScoreBoard());
        }
        setImage(new GreenfootImage("Time left : " + timer, 30, Color.WHITE, null));
    }    
}
