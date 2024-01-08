import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class levelOne extends World
{
    /**
     * Constructor for objects of class levelOne.
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
    public levelOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1);
        //GreenfootImage background = new GreenfootImage("Parallax100.png");
        //setBackground(background);

        //bgImage = new GreenfootImage(getBackground());
        //bgBase = new GreenfootImage(picWidth, getHeight());
        //bgBase.drawImage(bgImage, 0, 0);
        Player HeroShip = new Player(); 

        //Background img0 = new Background(); 
        //addObject(img0, getWidth()/2, getHeight()/2);
        
        addObject(HeroShip, 300, 300); 
        Bullet enemyBullet1 = new Bullet(); 
        addObject(enemyBullet1, 300, 0);
        
        Bullet enemyBullet2 = new Bullet(); 
        addObject(enemyBullet2, 300, 0);
        
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
    
    private void spawnOne()
    {
        
    }
}
