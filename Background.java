import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Actor
{
    private int imageWidth;
    private int offset = 120;
    private Background otherBackground;
    private int speed = 5;
    
    public Background() {
        imageWidth = getImage().getWidth();    
    }
    public void setOtherBackground(Background otherBackground) {
        this.otherBackground = otherBackground;
    }
    public void increaseSpeed() {
        speed += 2;
    }
    public void act()
    {
        if(getX() < -imageWidth + offset) {
            int newX = otherBackground.getX() + imageWidth;
            setLocation(newX, getY());
        }
        move(-speed);
    }
}