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
    public Cover()  
    {    
        super(600, 400, 1); 
        addObject(new BackgroundTwo(), 300, 200);
        Label titleLabel = new Label("Balloon Popper", 80);
        Label titleLabelTwo = new Label("'Click Mouse to Start'", 30);
        Label titleLabelThree = new Label(" ' Click Space for Rules ' ", 25);
        addObject(titleLabel, getWidth()/2, getHeight()/3);
        addObject(titleLabelTwo, getWidth()/2, getHeight()/2 -1);
        addObject(new Character(), 150, 100);
        addObject(titleLabelThree, 300, 300);
    }
    public void act() {
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld(this);
            Greenfoot.setWorld(world);
        }
    }
}
