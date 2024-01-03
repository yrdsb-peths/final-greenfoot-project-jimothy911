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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Character character = new Character();
        addObject(character, 300, 300);
        
        spawnWaveOne();
        spawnWaveTwo();
        spawnFinalBoss();
    }
    public void spawnWaveOne() {
        int x = 400;
        int y = 150;
        WaveOne waveone = new WaveOne();
        addObject(waveone, x, y);
    }
    public void spawnWaveTwo() {
        int x = 370;
        int y = 150;
        WaveTwo wavetwo = new WaveTwo();
        addObject(wavetwo, x, y);
    }
    public void spawnFinalBoss() {
        int x = 400;
        int y = 150;
        FinalBoss finalboss = new FinalBoss();
        addObject(finalboss, x, y);
    }
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 90);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
    }
}
