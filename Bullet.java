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
        checkIfHitBomb();
    }   
   }
   /**
    * removes "wave one" if the bullet touches the actor
    * also plays a balloon popping sound
    * repspawns a new "wave one"
    * increases score by 1
    */
   private void checkIfHit(){
        if(isTouching(WaveOne.class)) {
            removeTouching(WaveOne.class);
            Greenfoot.playSound("popsound.mp3");
            MyWorld world = (MyWorld) getWorld();
            world.spawnWaveOne();
            world.increaseScore();
        }
    }
    /**
    * removes "wave two" if the bullet touches the actor
    * plays a balloon popping sound
    * repspawns a new "wave two"
    * increases score by 2
    */
    private void checkIfHitTwo(){
        if(isTouching(WaveTwo.class)) {
            removeTouching(WaveTwo.class);
            Greenfoot.playSound("popsound.mp3");
            MyWorld world = (MyWorld) getWorld();
            world.spawnWaveTwo();
            world.increaseScoreTwo();
        }
    }
    /**
    * removes "wave three" if the bullet touches the actor
    * plays a balloon popping sound
    * repspawns a new "wave three"
    * increases score by 3
    */
    private void checkIfHitBoss(){
        if(isTouching(FinalBoss.class)) {
            removeTouching(FinalBoss.class);
            Greenfoot.playSound("popsound.mp3");
            MyWorld world = (MyWorld) getWorld();
            world.spawnFinalBoss();
            world.increaseScoreThree();
        }
    }
     /**
    * removes "bomb" if the bullet touches bomb
    * plays a "boom" sound
    * repspawns a new "bomb"
    * halves the total score
    */
    private void checkIfHitBomb(){
        if(isTouching(Friend.class)) {
            removeTouching(Friend.class);
            Greenfoot.playSound("zapsplat_explosion_big_fireball_002_89752.mp3");
            MyWorld world = (MyWorld) getWorld();
            world.spawnBomb();
            world.decreaseScore();
        }
    }
}