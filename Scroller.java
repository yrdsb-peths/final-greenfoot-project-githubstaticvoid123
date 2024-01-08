import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scroller extends Actor
{
    /**
     * Act - do whatever the Scroller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World world; // view window world
    private GreenfootImage scrollImage; // scrolling image
    private boolean limited;
    private int scrolledX = 0; 
    private int scrolledY = 2;
    private int wide = 400;
    private int high = 800; 
    

    
    
    public Scroller(World viewWorld, GreenfootImage image)
    {
        world = viewWorld;
        scrollImage = image;
        if (image != null)
        {
            wide = image.getWidth();
            high = image.getHeight();
        }
        scroll(0, 0); // sets initial background image
    }
    
    public void scroll(int dsx, int dsy)
    {
        // adjust scroll amounts and scroll background image
        if (limited)
        {
            // calculate limits of scrolling
            int maxX = wide-world.getWidth();
            int maxY = high-world.getHeight();
            // apply limits to distances to scroll
            if (scrolledX+dsx < 0) dsx = scrolledX;
            if (scrolledX+dsx >= maxX) dsx = maxX+scrolledX;
            if (scrolledY+dsy < 0) dsy = scrolledY;
            if (scrolledY+dsy >= maxY) dsy = maxY+scrolledY;
            // update scroll positions
            scrolledX += dsx;
            scrolledY += dsy;
            // scroll background image
            if (scrollImage != null)
            {
                world.getBackground().drawImage
                (   
                    scrollImage,
                    -scrolledX*world.getCellSize(),
                    -scrolledY*world.getCellSize()
                );
            }
        }
        else // unlimited image wrapping
        {
            // update scroll positions
            scrolledX -= dsx;
            scrolledY -= dsy;
            // scroll background image
            if (scrollImage != null)
            {
                // create working variables of scroll positions
                int imageX = scrolledX*world.getCellSize();
                int imageY = scrolledY*world.getCellSize();
                // get near-zero starting positions for drawing 'scrollImage'
                imageX = imageX%wide;
                imageY = imageY%high;
                // adjust negative values as needed
                if (imageX < 0) imageX += wide;
                if (imageY < 0) imageY += high;
                // create image of appropriate size and tile fill 'scrollImage' onto it
                GreenfootImage hold = new GreenfootImage(scrollImage);
                hold.drawImage(scrollImage, -imageX, -imageY);
                if (imageX > 0) hold.drawImage(scrollImage, wide-imageX, -imageY);
                if (imageY > 0) hold.drawImage(scrollImage, -imageX, high-imageY);
                if (imageX > 0 && imageY > 0)
                    hold.drawImage(scrollImage, wide-imageX, high-imageY);
                // set image to background of 'world'
                world.setBackground(hold);
            }
        }
    }
    
    /**
     * getter method for the current total scrolled distance horizontally
     *
     * @return the current total offset of horizontal scrolling
     */
    public int getScrolledX()
    {
        return scrolledX;
    }
     
    /**
     * getter method for the current total scrolled distance vertically
     *
     * @return the current total offset of vertical scrolling
     */
    public int getScrolledY()
    {
        return scrolledY;
    }
}
