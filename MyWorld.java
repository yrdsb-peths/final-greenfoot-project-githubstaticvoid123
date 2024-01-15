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
    public static void 
     */
    public static String scrollBack = "Parallax100.png"; 
    public static double scrollSpeed = 2.5; 
    private static final int picWidth = (new GreenfootImage(scrollBack)).getWidth();
    private static final int picHeight = (new GreenfootImage(scrollBack)).getHeight();
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0; 

    private int gameScore = 0; 
    private int highScore = 0; 
    Label scoreLabel;
    Label funLabel; 
    Label hiscoreLabel; 
    Label hiscore2Label; 
    // restart here
   
    private Scroller scroller; 
    public int pause = 1; 
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 650, 1);
        //GreenfootImage background = new GreenfootImage("Parallax100.png");
        //setBackground(background);

        //bgImage = new GreenfootImage(getBackground());
        //bgBase = new GreenfootImage(picWidth, getHeight());
        //bgBase.drawImage(bgImage, 0, 0);
        Player HeroShip = new Player(); 

        //Background img0 = new Background(); 
        //addObject(img0, getWidth()/2, getHeight()/2);
        

        addObject(HeroShip, 200, 600); 
        Bullet enemyBullet = new Bullet(); 
        addObject(enemyBullet, 300, 0);
        Laser heroLaser = new Laser();
        
        funLabel = new Label ("Score:", 40);
        addObject(funLabel, 60, 80); 

        scoreLabel = new Label("0", 40); 
        addObject(scoreLabel, 120, 80);
        
        hiscoreLabel = new Label ("High Score: ", 40); 
        addObject(hiscoreLabel, 102, 130); 
        
        hiscore2Label = new Label ("0", 40); 
        addObject(hiscore2Label, 200, 130); 
        
        scroller = new Scroller(this, new GreenfootImage("Parallax100.png"));
         
        
    }

    public void act()
    {
        scroll(); 
    }
    public void increaseScore()
    {
        gameScore++; 
        scoreLabel.setValue(gameScore); 
    }
    
    public void increaseScore2()
    {
        gameScore++; 
        gameScore++; 
        scoreLabel.setValue(gameScore); 
    }
    
    public void increaseScore3() 
    {
        gameScore++; 
        gameScore++; 
        gameScore++; 
        scoreLabel.setValue(gameScore); 
    }
    
    public void setHiScore() 
    {
        if (highScore > gameScore) 
        {
        highScore = gameScore; 
        hiscoreLabel.setValue(highScore); 
        }   
    }
    
    public void gameOver() 
    {
        setHiScore(); 
        gameOver deathscreen = new gameOver(gameScore, highScore); 
        
        Greenfoot.setWorld(deathscreen); 
    }

    public void respawnBullet()
    {
        Bullet newBullet = new Bullet(); 
        int x = Greenfoot.getRandomNumber(400); 
        int y = 0; 
        addObject(newBullet, x, y); 
    }
    
    public void respawnFastBullet()
    {
        fastBullet newBullet1 = new fastBullet(); 
        int x = Greenfoot.getRandomNumber(400); 
        int y = 0; 
        addObject(newBullet1, x, y); 
    }
    
    public void respawnLeftBullet() 
    {
        System.out.println("RESPAWNING LEFT BULLET");
        LeftBullet newBullet2 = new LeftBullet(); 
        int x = Greenfoot.getRandomNumber(200)+200; 
        int y = 0; 
        addObject(newBullet2, x, y); 
    }
    
    public void respawnRightBullet() 
    {
        RightBullet newBullet3 = new RightBullet(); 
        int x = Greenfoot.getRandomNumber(200); 
        int y = 0; 
        addObject(newBullet3, x, y);
    }
        
    
    public void Destroy() 
    {
        respawnBullet();
        increaseScore(); 
    }
    
    public void makefastBullet() 
    {
        respawnFastBullet(); 
        increaseScore2(); 
    }
    
    public void makeLeftBullet()
    {
        respawnLeftBullet(); 
        increaseScore3(); 
        
    }
    
    public void makeRightBullet()
    {
        respawnRightBullet(); 
        increaseScore3(); 
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
