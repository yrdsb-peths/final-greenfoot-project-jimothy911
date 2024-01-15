import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
    int speed=4;
    move(speed);
    if(isAtEdge()){
            getWorld().removeObject(this);
    }
    else{
        checkIfHit();
        checkIfHitTwo();
        checkIfHitBoss();
    }   
   }
   private void checkIfHit(){
        if(isTouching(WaveOne.class)) {
            removeTouching(WaveOne.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnWaveOne();
            world.increaseScore();
        }
    }
    private void checkIfHitTwo(){
        if(isTouching(WaveTwo.class)) {
            removeTouching(WaveTwo.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnWaveTwo();
            world.increaseScore();
        }
    }
    private void checkIfHitBoss(){
        if(isTouching(FinalBoss.class)) {
            removeTouching(FinalBoss.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnFinalBoss();
            world.increaseScore();
        }
    }
}