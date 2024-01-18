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
     * Adding all the images and Labels
     * Makes up the cover Page
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
        addObject(new CoverOne(), 400, 100);
        addObject(new CoverTwo(), 450, 100);
        addObject(new CoverThree(), 500, 100);
    }
    /**
     * Allowing you to either go from cover page to rules or into the game
     * Rules page is part of cover so you can enter game from the rules page
     */
    public void act() {
        if(Greenfoot.mouseClicked(null)){
            MyWorld world = new MyWorld(this);
            Greenfoot.setWorld(world);
        }
        if(Greenfoot.isKeyDown("space")){
            removeObjects(getObjects(null));
            Rules rulePage =  new Rules();
            addObject(rulePage, 300, 200);
            Label start = new Label(" 'Left Click Mouse to Start' ", 23);
            addObject(start, 300, 40);
            Label ruleOne = new Label(" 1.Use 'W','A','S','D', to move  Character Around", 25);
            addObject(ruleOne, 300, 75);
            Label ruleTwo = new Label(" 2, Left Click Mouse button to shoot directly to the right of the character", 20);
            addObject(ruleTwo, 300, 110);
            Label ruleThree = new Label("3. Balloons and Bombs Come from the right of the screen" , 25);
            addObject(ruleThree, 300, 145);
            Label ruleFour = new Label("4.Shoot Balloon, NOT BOMBS!! ", 25);
            addObject(ruleFour, 300, 180);
            Label ruleFive = new Label("5.Yellow Balloons are Worth 3 Points", 25);
            addObject(ruleFive, 300, 215);
            Label ruleSix = new Label("6.Blue Balloons are Worth 2 Points", 25);
            addObject(ruleSix, 300, 250);
            Label ruleSeven = new Label("7.Red Balloons Is Worth 1 Point", 25);
            addObject(ruleSeven, 300, 285);
            Label ruleEight = new Label("8.Bombs will explode HALF of your Gained Points! ", 25);
            addObject(ruleEight, 300, 320);
            Label ruleNine = new Label("9. YOU LOSE WHEN ALL 3 BALLOONS CROSS THE LEFT BORDER", 23);
            addObject(ruleNine, 300, 365);
        }
    }
}
