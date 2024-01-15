import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fastBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fastBullet extends Actor
{
    /**
     * Act - do whatever the fastBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+2); 
        Actor Laser = getOneIntersectingObject(Laser.class); 
        if(Laser!=null)
            { 
                MyWorld World = (MyWorld) getWorld(); 
                removeTouching(Laser.class); 
                getWorld().addObject(new Boom(), getX(), getY()); 
                getWorld().removeObject(this);
                return; 
            }
        
        if(getY() == 650)
            {
        
                Destroy3(); 
            }
    }
    
    public void Destroy3()
    {
        MyWorld World = (MyWorld) getWorld(); 
        World.respawnFastBullet();
        World.removeObject(this); 
        return; 
    }
}
