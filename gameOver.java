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
    private int highScore;
    public gameOver(int finalScore, int highScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        this.highScore = highScore;
        Label deadLabel = new Label("GAME OVER", 70);
        addObject(deadLabel, 300, 100); 
        
        Label restartLabel = new Label ("Press z to restart", 70); 
        addObject(restartLabel, 300, 200); 
    
        
        Label restartLabel2 = new Label(finalScore, 30); 
        addObject(restartLabel2, 400, 300); 
        
        Label highscoreLabel =  new Label ("Your score was:" , 30); 
        addObject(highscoreLabel, 260, 300); 
        
    }
    

    
    public void act()  
    {
        if(Greenfoot.isKeyDown("z"))
        {
            TitleScreen act = new TitleScreen(); 
            act.setHighScore(this.highScore);
            Greenfoot.setWorld(act); 
        }
    }
}
