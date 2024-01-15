import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] death = new GreenfootImage[5];

    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1); 
        Actor Laser = getOneIntersectingObject(Laser.class); 
        MyWorld World = (MyWorld) getWorld();
        
        if(Laser!=null)
            { 
                
                removeTouching(Laser.class); 
                getWorld().addObject(new Boom(), getX(), getY()); 
                getWorld().removeObject(this);
                return;        
            }
        
            if(getY() == 600)
            {
        
                getWorld().removeObject(this); 
                
                
            }
    }
    
    public void Destroy2()
    { 
        
    }
}
