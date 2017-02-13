import Controller.Controllers.GameController;
import Model.ModelThread;
import Model.ModelThread2;
import State.GameState;
import View.GameScreen;
import View.ViewThread;

import javax.swing.*;
import javax.swing.text.View;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class Main {
    public static void main(String[] args){
        Thread.currentThread().setName("Main Thread");

        JFrame jFrame = new JFrame();

        //create gamestate
        GameState gameState = new GameState();
        GameScreen gameScreen = new GameScreen();
        gameScreen.init();

        //create ViewThread
        ViewThread viewThread = new ViewThread(gameScreen,gameState);
        //create ModelThread
        ModelThread modelThread = new ModelThread();
        GameController gameController = new GameController(gameState,viewThread);
        viewThread.startVisibility();
        //start threads
        modelThread.start();
        viewThread.start();

    }

    public void setUp(){
        //maybe come back later

    }
    //figure out proxy patter/ pattern that holds 1 instance w/ static or something
    //command shit
}
