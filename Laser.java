import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction, speed; 
    public Laser ()
    {
        speed = 15; 
    }
    
    public void act()
    {
        // Add your action code here.
        
        setLocation(getX(), getY() - 5);
        MyWorld World = (MyWorld) getWorld(); 
        if(isTouching(Bullet.class))
            {
                removeTouching(Bullet.class);
                Bullet newBullet = new Bullet(); 
                World.Destroy();
                
            }
        
        if(getY() == 0)
            {
                removeTouching(Laser.class);
                World.removeObject(this); 
            }
        
            
    }
    
    
}
