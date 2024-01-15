import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends MyWorld
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {
        Bullet enemyBullet1 = new Bullet(); 
        addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet2 = new Bullet(); 
        addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet3 = new Bullet(); 
        addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0); 
    }
    
    
}
