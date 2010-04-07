/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;

import background.Background;
import blokjes.Questionmark;
import mario.Mario;
import java.util.ArrayList;
import mario.enemy.*;

/**
 *
 * @author danny
 */
public class Game
{
    private boolean running         = false;
    private boolean paused          = false;


    private Mario mario = new Mario();
    private Goomba goomba = new Goomba(300, 512, 66, 66);
    private Background background   = new Background();
    private Questionmark Questionmark   = new Questionmark();
    private ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
    

    public Game()
    {
        gameObjects.add(background);
        gameObjects.add(mario);
        gameObjects.add(Questionmark);
        gameObjects.add(goomba);
    }

    public boolean isRunning()
    {
        return running;
    }

    public void setRunning(boolean running)
    {
        this.running = running;
    }

    public boolean isPaused()
    {
        return paused;
    }

    public void setPaused(boolean paused)
    {
        this.paused = paused;
    }
    
    public ArrayList<GameObject> getGameObjects()
    {
        return gameObjects;
    }

    public Mario getMario()
    {
        return mario;
    }

    public Goomba getGoomba()
    {
        return goomba;
    }
}
