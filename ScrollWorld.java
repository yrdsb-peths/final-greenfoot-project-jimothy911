import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollWorld extends World
{
    Background backGround1 = new Background();
    Background backGround2 = new Background();
    public ScrollWorld()
    {    
        super(600, 400, 1, false); 

        backGround1.setOtherBackground(backGround2);
        backGround2.setOtherBackground(backGround1);

        addObject(backGround1, 0, 200);
        addObject(backGround2, 1024, 200);
    }
    public void act() {
        if(Greenfoot.mouseClicked(null)){
            backGround1.increaseSpeed();
            backGround2.increaseSpeed();
        }
    }
}
