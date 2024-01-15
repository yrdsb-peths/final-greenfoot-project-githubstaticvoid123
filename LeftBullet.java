import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zigzagLeftBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftBullet extends Actor
{
    /**
     * Act - do whatever the zigzagLeftBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-1, getY()+2); 
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
                
                Destroy3(); 
            }
            
            if(getX() == 0)
            {
                
                Destroy3(); 
            }

    }
    public void Destroy3()
    {
        MyWorld World = (MyWorld) getWorld(); 
        World.respawnLeftBullet();
        World.removeObject(this); 
        return; 
        
    }
}
