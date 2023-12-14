import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Player HeroShip = new Player(); 
        addObject(HeroShip, 300, 300); 
        Bullet enemyBullet = new Bullet(); 
        addObject(enemyBullet, 300, 0);
        Laser heroLaser = new Laser(); 
    }
    
    public void respawnBullet()
    {
        Bullet newBullet = new Bullet(); 
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        addObject(newBullet, x, y); 
    }
    
    public void removeLaser() 
    {
        Laser heroLaser = new Laser(); 
         
    }
    
}
