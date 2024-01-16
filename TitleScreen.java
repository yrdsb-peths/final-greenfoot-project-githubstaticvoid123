import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     * 
     */
    private int highScore;
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        Label titleLabel = new Label("Space Shooter 4000", 50); 
        addObject(titleLabel, 300, 100); 
        
        Label startLabel = new Label("Press f to play level 1", 30); 
        addObject(startLabel, 300, 300);
        
        Label startLabel2 = new Label("Press g to play level 2", 30); 
        addObject(startLabel2, 300, 330); 
        
        Label startLabel3 = new Label("Press h to play level 3", 30); 
        addObject(startLabel3, 300, 360); 
        
        Label startLabel4 = new Label ("Press i for instructions", 25); 
        addObject(startLabel4, 150, 50); 
        
    }
    
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("f"))
        {
            level1 gameWorld1 = new level1(); 
            Greenfoot.setWorld(gameWorld1); 
            
        }
        
        if(Greenfoot.isKeyDown("g"))
        {
            level2 gameWorld2 = new level2(); 
            Greenfoot.setWorld(gameWorld2); 
        }
        
        if(Greenfoot.isKeyDown("h")) 
        {
            level3 gameWorld3 = new level3(); 
            Greenfoot.setWorld(gameWorld3); 
        }
        
        if(Greenfoot.isKeyDown("i"))
        {
            Instructions gameWorld4 = new Instructions(); 
            Greenfoot.setWorld(gameWorld4); 
        }
        
    }
    
    public void setHighScore(int highScore){
        this.highScore = highScore;
        
        Label startLabel5 = new Label("High Score:", 30); 
        addObject(startLabel5, 250, 55); 
        
        Label scoreLabel2 = new Label(highScore, 40); 
        addObject(scoreLabel2, 330, 55); 
        
    }
 
    
}
