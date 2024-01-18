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
     * "Wave One" moves at a speed of 1 to the left
     * actor is removed if he reaches the left side of the game
     * adds 1 to  variable x
     * every wave/balloon adds 1 to x when they cross the left side
     * once every balloon has crossed and x = 3, game  over
     */
    public void act()
    {
        move(-1);
        
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
