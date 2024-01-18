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
    /**
     * Initiating the game and placing Actors, background and score
     */
    public MyWorld(Cover titleWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Character character = new Character();
        addObject(character, 50, 200);
        this.titleWorld = titleWorld;
        scoreLabel = new Label(score,30);
        Label text = new Label("Score :", 25);
        addObject(text, 50, 50);
        spawnWaveOne();
        spawnWaveTwo();
        spawnFinalBoss();
        addObject(scoreLabel, 100, 50);
        spawnBomb();
    }
    /**
     * A method that removes all objects from the game
     * Then proceeds to make a game over screen which tells you your score at the end
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 90);
        Label finalScore = new Label("Score : " , 100);
        Label scoreLabelTwo = new Label(score,100);
        GameOver endPage = new GameOver();
        removeObjects(getObjects(null));
        addObject(endPage, 300, 200);
        Greenfoot.playSound("zapsplat_human_male_voice_says_game_over_004_15729.mp3");
        addObject(gameOverLabel, getWidth()/2, 75);
        addObject(finalScore, getWidth()/3, 200);
        addObject(scoreLabelTwo, 400, 200);
        addObject(new CoverThree(), 500, 275);
        addObject(new CoverThree(), 500, 300);
        addObject(new CoverThree(), 500, 325);
        addObject(scoreLabelTwo, 400, 200);
        addObject(new CoverTwo(), 90, 280);
        addObject(new CoverTwo(), 90, 320);
        addObject(new CoverTwo(), 90, 350);
        addObject(scoreLabelTwo, 400, 200);
        addObject(new CoverOne(), 275, 280);
        addObject(new CoverOne(), 325, 320);
        addObject(new CoverOne(), 300, 350);
    }
    /**
     * the score value increases by one
     */
    public void increaseScore() {
        score = score + 1;
        scoreLabel.setValue(score);
    }
    /**
     * score value increases by two
     */
    public void increaseScoreTwo() {
        score = score + 2;
        scoreLabel.setValue(score);
    }
    /**
     * score value increases by three
     */
    public void increaseScoreThree() {
        score = score + 3;
        scoreLabel.setValue(score);
    }
    /**
     * score value cuts in half
     */
    public void decreaseScore(){
        score = score/2;
        scoreLabel.setValue(score);
    }
    /**
     * method that spawns "waveOne"
     * random y value from the right of the game.
     */
    public void spawnWaveOne(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        WaveOne waveOne = new WaveOne();
        addObject(waveOne, x, y);
    }
    /**
     * Method that spawns "waveTwo" 
     * spawns from the right side of the game with a random y value
     */
    public void spawnWaveTwo(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        WaveTwo waveTwo = new WaveTwo();
        addObject(waveTwo, x, y);
    }
    /**
     * Method that spawns "FinalBoss" or in game a Balloon
     * spawns from the right side of the game with a random y value
     */
    public void spawnFinalBoss(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        FinalBoss finalboss = new FinalBoss();
        addObject(finalboss, x, y);
    }
    /**
     * spawns bomb from right side of game with random y value
     */
    public void spawnBomb(){
        int x = 600;
        int y = Greenfoot.getRandomNumber(400);
        Friend bomb = new Friend();
        addObject(bomb, x, y);
    }
}
