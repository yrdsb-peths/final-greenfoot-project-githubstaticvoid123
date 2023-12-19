import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idle = new GreenfootImage[4]; 
    public Player()
    {
        for(int i = 0; i < idle.length; i++) 
        {
            idle[i] = new GreenfootImage("images/playerShip/tile00" + i + ".png"); 
        }
        setImage(idle[0]); 
    }
    
    int imageIndex = 0; 
    public void animateShip()
    {
        setImage(idle[imageIndex]); 
        imageIndex = (imageIndex + 1) % idle.length; 
    }
    
    public void act()
    {
        //  your action code here.
        if(isTouching(Bullet.class))
            {
                World myWorld = getWorld(); 
                myWorld.removeObject(this);
            }
        animateShip(); 
        if (Greenfoot.isKeyDown("a"))
        {
            move(-5); 
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(5); 
        }
        if (Greenfoot.isKeyDown("space"))
        {
            World myWorld = getWorld(); 
            Laser heroLaser = new Laser();
            getWorld().addObject(heroLaser, getX(), getY());
            heroLaser.setRotation(getRotation()); 
            
        }
        if(Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY() - 5); 
        }
        if(Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY() + 5); 
        }
    }
    public void playerHit()
    {
        World myWorld = getWorld();
    }
}
