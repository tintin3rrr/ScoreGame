import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound lo = new  GreenfootSound("Intro.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
         addObject(new mode1(),111,832);
        addObject(new mode2(),299,832);
        addObject(new mode3(),492,832);
        addObject(new howto(),132,731);
        addObject(new logo(),402,318);
        
    }
    public void started(){
    lo.play();
    }
    public void st(){
           lo.stop();
    }
}
