import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelThree extends World
{

    /**
     * Constructor for objects of class levelThree.
     * 
     */
    public static String scrollBack = "Parallax100.png"; 
    public static double scrollSpeed = 2.5; 
    private static final int picWidth = (new GreenfootImage(scrollBack)).getWidth();
    private static final int picHeight = (new GreenfootImage(scrollBack)).getHeight();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0; 
    private int score = 0; 
    Label scoreLabel;
    // restart here
   
    private Scroller scroller; 
    public levelThree()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Player HeroShip = new Player(); 

        //Background img0 = new Background(); 
        //addObject(img0, getWidth()/2, getHeight()/2);
        
        addObject(HeroShip, 300, 300); 
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
        
        Laser heroLaser = new Laser();

        Label scoreLabel = new Label("0", 80); 
        addObject(scoreLabel, 100, 100);
        
        scroller = new Scroller(this, new GreenfootImage("Parallax100.png")); 
    }
    
    public void act()
    {
        scroll(); 
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);  
    }

    public void respawnBullet()
    {
        Bullet newBullet = new Bullet(); 
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        addObject(newBullet, x, y); 
    }

    public void gameOver() 
    {
        Label gameOverLabel = new Label("Game Over", 100); 
        addObject(gameOverLabel, 300, 200);  
        Label doOver = new Label("Press 'f' to try again", 50); 
        addObject(doOver, 300, 300);  
    }

    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgImage, 0, position);
        bg.drawImage(bgImage, 0, position - 2);
    }
    
    private void scroll()
    {
    // determine amount to scroll (dsx, dsy)
    scroller.scroll(0, 1); // have scroller scroll world
    }
}
