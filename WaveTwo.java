import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaveTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaveTwo extends Actor
{
    /**
     * Act - do whatever the WaveTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0){
            world.removeObject(this);
            world.x += 1;
            if(world.x==3){
                world.gameOver();
            }
        }
    }
}
