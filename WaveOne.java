import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaveOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaveOne extends Actor
{
    /**
     * Act - do whatever the WaveOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0){
            world.gameOver();
            world.removeObject(this);
        }
    }   
}
