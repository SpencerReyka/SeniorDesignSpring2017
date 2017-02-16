package View;

import State.GameState;
import Utilties.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class ViewThread implements Runnable {

    //private ViewRender
    private Thread viewThread;
    private BufferStrategy bs;
    private Graphics g;
    JFrame jFrame;
    //private Canvas canvas;
    public GameScreen getGameScreen() {
        return gameScreen;
    }

    private GameScreen gameScreen;

    public Canvas getCanvas() {
        return canvas;
    }

    private Canvas canvas;
    private GameState gameState;//come back through and clean this shit up
    public ViewThread(GameScreen gameScreen, GameState gameState){
            this.gameScreen = gameScreen;
            this.canvas = gameScreen.getCanvas();
            this.jFrame = gameScreen.getFrame();
            //gameScreen.setVisible(true);
            this.gameState = gameState;
    }

    public void run() {

        while(true){
            long startingTime = System.currentTimeMillis();

            //currentStateRender()
            render();

            long finishingTime = System.currentTimeMillis();

            double delta = startingTime-finishingTime;
            if(delta<40){
                try {
                    Thread.sleep(((long) (40 - delta)));
                } catch(InterruptedException exception){

                }
            }
            else{
                System.out.println("oops");
            }
        }
    }
    public void render() {
        bs = canvas.getBufferStrategy();
        if (bs == null) {
            canvas.createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();
        g.clearRect(0, 0, Settings.GAMEWIDTH, Settings.GAMEHEIGHT);
        g.setColor(new Color(38, 149, 166));
        g.fillRect(0, 0, Settings.GAMEWIDTH, Settings.GAMEHEIGHT);
        if (gameState != null) {
            gameState.render(g);
        }
        bs.show();
        g.dispose();

    }
    public void load(GameScreen gameScreen){
        this.gameScreen = gameScreen;
        this.canvas = gameScreen.canvas;
    }
    public void start(){
        if(viewThread==null){
            viewThread = new Thread(this);
            viewThread.setName("View Thread");
            viewThread.start();
        }

    }
    public void startVisibility(){
        //gameScreen.setVisible(true);
    }
}
