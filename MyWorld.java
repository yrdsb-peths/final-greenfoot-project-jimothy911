import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int score = 0;
    private Label scoreLabel;
    Cover titleWorld; 
    public int x = 0;
    
    public MyWorld(Cover titleWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Character character = new Character();
        addObject(character, 50, 200);
        this.titleWorld = titleWorld;
        scoreLabel = new Label(score,30);
        
        showText("Score :", 50,50);
        spawnWaveOne();
        spawnWaveTwo();
        spawnFinalBoss();
        addObject(scoreLabel, 100, 50);
        spawnBomb();
    }
    public void spawnWaveTwo(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        WaveTwo waveTwo = new WaveTwo();
        addObject(waveTwo, x, y);
    }
    public void spawnFinalBoss(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        FinalBoss finalboss = new FinalBoss();
        addObject(finalboss, x, y);
    }
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 90);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
    }
    public void increaseScoreTwo() {
        score = score + 2;
        scoreLabel.setValue(score);
    }
    public void increaseScoreThree() {
        score = score + 3;
        scoreLabel.setValue(score);
    }
    public void decreaseScore(){
        score = score/2;
        scoreLabel.setValue(score);
    }
    public void spawnWaveOne(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        WaveOne waveOne = new WaveOne();
        addObject(waveOne, x, y);
    }
    public void spawnBomb(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        Friend bomb = new Friend();
        addObject(bomb, x, y);
    }
}
