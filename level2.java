import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends MyWorld
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    private Bullet enemyBullet1;
    private Bullet enemyBullet2;
    private Bullet enemyBullet3;
    private fastBullet enemyBullet4;
    private Bullet enemyBullet5;
    private Bullet enemyBullet6;
    private fastBullet enemyBullet7;
    private LeftBullet enemyBullet8;
    private RightBullet enemyBullet9;
    private int actCounter;
    
    public level2()
    {
        enemyBullet1 = new Bullet(); 
        //addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
        enemyBullet2 = new Bullet(); 
        //addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
        enemyBullet3 = new Bullet(); 
        //addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0);
        enemyBullet4 = new fastBullet(); 
        //addObject(enemyBullet4, Greenfoot.getRandomNumber(400), 0);
        enemyBullet5 = new Bullet(); 
        //addObject(enemyBullet5, Greenfoot.getRandomNumber(400), 0);
        enemyBullet6 = new Bullet(); 
        //addObject(enemyBullet6, Greenfoot.getRandomNumber(400), 0);
        enemyBullet7 = new fastBullet(); 
        //addObject(enemyBullet7, Greenfoot.getRandomNumber(400), 0); 
        enemyBullet8 = new LeftBullet(); 
        //addObject(enemyBullet8, Greenfoot.getRandomNumber(200)+200, 0);
        enemyBullet9 = new RightBullet(); 
        //addObject(enemyBullet9, Greenfoot.getRandomNumber(200), 0); 
        actCounter = 0;
    
    }
    
    public void act(){
        if(actCounter % 2 == 0){
             addObject(enemyBullet1, Greenfoot.getRandomNumber(400), 0);
             addObject(enemyBullet2, Greenfoot.getRandomNumber(400), 0);
             addObject(enemyBullet3, Greenfoot.getRandomNumber(400), 0);
             addObject(enemyBullet4, Greenfoot.getRandomNumber(400), 0); 
             addObject(enemyBullet5, Greenfoot.getRandomNumber(400), 0); 
             addObject(enemyBullet6, Greenfoot.getRandomNumber(400), 0); 
             addObject(enemyBullet7, Greenfoot.getRandomNumber(400), 0); 
             addObject(enemyBullet8, Greenfoot.getRandomNumber(200)+200, 0);
             addObject(enemyBullet9, Greenfoot.getRandomNumber(200), 0); 
         }
         actCounter++;
    }
}
