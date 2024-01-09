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
    }
    
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("f"))
        {
            levelOne gameWorld1 = new levelOne(); 
            Greenfoot.setWorld(gameWorld1); 
        }
        
        if(Greenfoot.isKeyDown("g"))
        {
            levelTwo gameWorld2 = new levelTwo(); 
            Greenfoot.setWorld(gameWorld2); 
        }
        
        if(Greenfoot.isKeyDown("h")) 
        {
            levelThree gameWorld3 = new levelThree(); 
            Greenfoot.setWorld(gameWorld3); 
        }
    }
    
}
