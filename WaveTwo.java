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
     * "Wave Two" moves at a speed of 2 to the left
     * actor is removed if he reaches the left side of the game
     * adds 1 to  variable x
     * every wave/balloon adds 1 to x when they cross the left side
     * once every balloon has crossed and x = 3, game  over
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
