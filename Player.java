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
    GreenfootImage[] death = new GreenfootImage[5]; 
    public Player()
    {
        for(int i = 0; i < idle.length; i++) 
        {
            idle[i] = new GreenfootImage("images/playerShip2/tile00" + i + ".png"); 
        }
        setImage(idle[0]); 
    }
    
    int imageIndex = 0; 
    GreenfootSound Deathsound = new GreenfootSound ("mixkit-arcade-space-shooter-dead-notification-272.mp3");
    private static int COOLDOWN_MAX = 20; 
    private int cannonCooldown = 0; 
    
    public void act()
    {
        //  your action code here.
        if(isTouching(Bullet.class))
            {
                MyWorld World = (MyWorld) getWorld(); 
                
                for(int i = 0; i < death.length; i++)
                {
                    death[i] = new GreenfootImage("images/gameOver/tile00" + i + ".png"); 
                }
                setImage(death[0]); 
                setImage(death[1]); 
                setImage(death[2]); 
                setImage(death[3]); 
                setImage(death[4]);
                Deathsound.play(); 
                World.gameOver(); 
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
            
            if (cannonCooldown > 0) {
                cannonCooldown--; 
            } 
            else if (Greenfoot.isKeyDown("space")) {

            World myWorld2 = getWorld(); 
            Laser heroLaser2 = new Laser();
            getWorld().addObject(heroLaser2, getX(), getY());
            heroLaser2.setRotation(getRotation()); 
            cannonCooldown = COOLDOWN_MAX;
            }
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
    
    
    
    
    public void animateShip()
    {
        setImage(idle[imageIndex]); 
        imageIndex = (imageIndex + 1) % idle.length; 
    }
}
