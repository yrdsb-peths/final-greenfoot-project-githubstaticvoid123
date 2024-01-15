import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    GreenfootImage boom0 = new GreenfootImage("images/gameOver/tile000.png"); 
    GreenfootImage boom1 = new GreenfootImage("images/gameOver/tile001.png");
    GreenfootImage boom2 = new GreenfootImage("images/gameOver/tile002.png");
    GreenfootImage boom3 = new GreenfootImage("images/gameOver/tile003.png");
    GreenfootImage boom4 = new GreenfootImage("images/gameOver/tile004.png");
    GreenfootImage boom5 = new GreenfootImage("images/gameOver/tile005.png");
    
    public int animationCounter; 
    public int frame = 1; 
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        animationCounter = animationCounter + 1; 
        if (animationCounter % 8 == 0) 
        {
            animation(); 
        }
    }
    
    public void animation() 
    {
        if(frame == 1) 
        {
            setImage(boom0); 
            frame = 2; 
        }
        else if (frame == 2) 
        {
            setImage(boom1); 
            frame = 3; 
        }
        else if (frame == 3) 
        {
            setImage(boom2); 
            frame = 4; 
        }
        else if (frame == 4) 
        {
            setImage(boom3); 
            frame = 5; 
        }
        else if (frame == 5) 
        {
            setImage(boom4); 
            frame = 6; 
        }
        else if (frame == 6) 
        {
            setImage(boom5); 
            frame = 7; 
        }
        else if (frame == 7)
        {
            getWorld().removeObject(this); 
        }
        
    }
}
