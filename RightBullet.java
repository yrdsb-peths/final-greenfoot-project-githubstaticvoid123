import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zigzagRightBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightBullet extends Actor
{
    /**
     * Act - do whatever the zigzagRightBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()+1, getY()+1); 
        Actor Laser = getOneIntersectingObject(Laser.class); 
        if(Laser!=null)
            { 
                
                MyWorld World = (MyWorld) getWorld(); 
                removeTouching(Laser.class); 
                getWorld().addObject(new Boom(), getX(), getY()); 
                getWorld().removeObject(this);
                return; 
            }
        
            if(getY() == 700)
            {
                Destroy4(); 
            }
            
            if(getX() == 400)
            {
                Destroy4(); 
            }
    }
    
    public void Destroy4()
    {
        MyWorld World = (MyWorld) getWorld(); 
        World.respawnRightBullet();
    }
}
