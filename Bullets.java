import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullets extends Actor
{
    /**
     * Act - do whatever the Bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Public Bullet(){
        setImage(new GreenfootImage(14,10));
        getImage().setColor(Color.YELLOW);
        getImage().fillOval(0, 0, 10, 10);
    }
    public void act()
    {
        
    }
}
