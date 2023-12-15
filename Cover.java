import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cover extends World
{
    /**
     * Constructor for objects of class Cover.
     * 
     */
    public Cover(){    
        super(600, 400, 1); 
        Label titleLabel = new Label("Baby Attack!!", 80);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        
        addObject(new Hello(), 0, 0);
    }  
    public void act() {
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld(this);
            Greenfoot.setWorld(world);
        }
    }
}
