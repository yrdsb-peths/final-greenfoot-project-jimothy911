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
    }    
    public void atMouse(){
        if(Greenfoot.getMouseInfo() != null){
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
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
    public void fireBullets(){
        if(Greenfoot.mousePressed(null)){
            Bullet bullet = new Bullet();
            getWorld().addObject(new Bullet(), getX(), getY());
        }
    }
}
