import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowTo.
     * 
     */
public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 626, 1); 
        addObject(new home(),945,48);
    }
}
