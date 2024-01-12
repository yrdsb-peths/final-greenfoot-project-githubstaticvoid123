import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public gameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        Label deadLabel = new Label("GAME OVER", 70);
        addObject(deadLabel, 300, 100); 
        
        Label restartLabel = new Label ("Press f to restart", 70); 
        addObject(restartLabel, 300, 200); 
        
        Label highscoreLabel =  new Label ("Your score was:" , 70); 
        addObject(restartLabel, 300, 300); 
        
    }
    
    public void act()  
    {
        if(Greenfoot.isKeyDown("f"))
        {
            TitleScreen act = new TitleScreen(); 
            Greenfoot.setWorld(act); 
        }
    }
}
