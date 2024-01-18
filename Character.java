import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        atMouse();
        moveThree();
        fireBullets();
    }
    /**
     * character is  pointing at mouse cursor
     */
    public void atMouse(){
        if(Greenfoot.getMouseInfo() != null){
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    /**
     * a key moves character opposite to the cursor
     * d key moves character to the cursor
     * w key moves character up
     * s key moves character down
     */
    public void moveThree(){
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 3);
        }
    }
    /**
     * left click of the mouse shoots bullets out of the character
     * bullets spawn directly on the character
     */
    public void fireBullets(){
        if(Greenfoot.mousePressed(null)){
            World world = getWorld();
                int x = (int)(this.getX());
                int y = (int)(this.getY());
            world.addObject(new Bullet(),x,y);
        }
    }
}
