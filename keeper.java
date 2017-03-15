import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keeper extends Actor
{
    int min_x = 157;
int max_x = 844;
 
int x = Greenfoot.getRandomNumber(max_x - min_x) + min_x;
    
 int speed;
    public keeper(int n){
        speed=n;
    }
    public void act() 
    {
        
   if(getX() == x)
        x = Greenfoot.getRandomNumber(max_x - min_x) + min_x;
    if(x >= getX()+speed)
        setLocation(getX()+speed, getY());
else if(x <= getX()-speed)
        setLocation(getX()-speed, getY());
    else if(x > getX() || x < getX())
        setLocation(x, getY());
        
    save();
    }    
public void save(){
    Actor ball = getOneIntersectingObject(ball.class);

    if (ball != null) {
        getWorld().removeObject(ball);
        Life.life--;
  
    
     
    }
    
    }
}
  
