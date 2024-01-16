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
    private Bullet enemyBullet1; 
    private Bullet enemyBullet2; 
    private Bullet enemyBullet3; 
    private int actCounter; 
    
    public level1()
    {
        enemyBullet1 = new Bullet(); 
        //addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
        enemyBullet2 = new Bullet(); 
        //addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
        enemyBullet3 = new Bullet(); 
        //addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0);
        actCounter = 0;
    }
    
    public void act(){
        if(actCounter % 2 == 0){
             addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
             addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
             addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0);
     
         }
         actCounter++;
    }
    
    
}
