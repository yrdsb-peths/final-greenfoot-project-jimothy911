import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmoothMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class SmoothMover extends Actor
{
    private double exactX;
    private double exactY;
    /**
     * Act - do whatever the SmoothMover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void move(int distance)
    {
        move((double)distance);
    }
    public void move(double distance){
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians)*distance;
        double dy = Math.sin(radians)*distance;
        setLocation(exactX + dx, exactY + dy);
    }
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
     public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }
}
