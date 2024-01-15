import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends MyWorld
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {
        Bullet enemyBullet1 = new Bullet(); 
        addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet2 = new Bullet(); 
        addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet3 = new Bullet(); 
        addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet4 = new Bullet(); 
        addObject(enemyBullet4, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet5 = new Bullet(); 
        addObject(enemyBullet5, Greenfoot.getRandomNumber(400), 0);
        Bullet enemyBullet6 = new Bullet(); 
        addObject(enemyBullet6, Greenfoot.getRandomNumber(400), 0);
        fastBullet enemyBullet7 = new fastBullet(); 
        addObject(enemyBullet7, Greenfoot.getRandomNumber(400), 0); 
        LeftBullet enemyBullet8 = new LeftBullet(); 
        addObject(enemyBullet8, Greenfoot.getRandomNumber(200)+200, 0);
        RightBullet enemyBullet9 = new RightBullet(); 
        addObject(enemyBullet9, Greenfoot.getRandomNumber(200), 0); 
        fastBullet enemyBullet10 = new fastBullet(); 
        addObject(enemyBullet10, Greenfoot.getRandomNumber(400), 0); 
        LeftBullet enemyBullet11 = new LeftBullet(); 
        addObject(enemyBullet11, Greenfoot.getRandomNumber(200)+200, 0);
        RightBullet enemyBullet12 = new RightBullet(); 
        addObject(enemyBullet12, Greenfoot.getRandomNumber(200), 0); 
        
         
        
    }
}
