import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Friend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Friend extends Actor
{
    /**
     * Act - do whatever the Friend wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);        
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0){
            world.removeObject(this);
            world.spawnBomb();
        }
    }
}
