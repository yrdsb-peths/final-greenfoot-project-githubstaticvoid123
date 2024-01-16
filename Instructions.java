import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label aLabel = new Label ("Use wasd to move", 30);
        addObject(aLabel, 300, 100); 
        
        Label bLabel = new Label ("Use i to return", 30); 
        addObject(bLabel, 100, 50); 
        
        Label spaceLabel = new Label ("Use space bar to shoot", 30); 
        addObject(spaceLabel, 300, 150);
        
        Label redLabel = new Label ("Red bullets move slowly", 30); 
        addObject(redLabel, 300, 200); 
        
        Label blueLabel = new Label ("Blue bullets move quickly", 30); 
        addObject(blueLabel, 300, 250); 
        
        Label greenLabel =  new Label ("Green bullets zigzag", 30); 
        addObject(greenLabel, 300, 300); 
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("i"))
        {
            TitleScreen b = new TitleScreen();
            Greenfoot.setWorld(b); 
            
        }
    }
}
