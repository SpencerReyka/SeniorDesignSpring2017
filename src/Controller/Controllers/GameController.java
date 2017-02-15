package Controller.Controllers;

import Controller.Controller;
import State.GameState;
import Utilties.Settings;
import Controller.Listener;
import View.ViewThread;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class GameController extends Controller{
    //gotta do command, this shit knows too much
    GameState stateManager;
    public GameController(GameState stateManager, ViewThread viewThread) {
        super(viewThread.getGameScreen().getFrame());
//        this.canvas = viewThread.getCanvas();
        this.stateManager = stateManager;
        //this.state=state;
        /*getKeyMapping().put(Settings.P1_UP,()->stateManager.execute());
        getKeyMapping().put(Settings.P1_DOWN,()->stateManager.execute());
        getKeyMapping().put(Settings.P1_LEFT,()->stateManager.execute());
        getKeyMapping().put(Settings.P1_RIGHT,()->stateManager.execute());

        getKeyMapping().put(Settings.P2_UP,()->stateManager.execute());
        getKeyMapping().put(Settings.P2_DOWN,()->stateManager.execute());
        getKeyMapping().put(Settings.P2_LEFT,()->stateManager.execute());
        getKeyMapping().put(Settings.P2_RIGHT,()->stateManager.execute());
        */
        //getKeyMapping().put(Settings.ENTER,()->state.enter());
        //getKeyMapping().put(Settings.ESCAPE,()->state.escape());
        //player 1 bindings
        getBindings().add(new Listener(Settings.P1_UP, ()->stateManager.execute(1,1)));
        getBindings().add(new Listener(Settings.P1_RIGHT, ()->stateManager.execute(1,2)));
        getBindings().add(new Listener(Settings.P1_DOWN, ()->stateManager.execute(1,3)));
        getBindings().add(new Listener(Settings.P1_LEFT, ()->stateManager.execute(1,4)));
        //getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
        //getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
        //player 2 bindings
        getBindings().add(new Listener(Settings.P2_UP, ()->stateManager.execute(2,1)));
        getBindings().add(new Listener(Settings.P2_RIGHT, ()->stateManager.execute(2,2)));
        getBindings().add(new Listener(Settings.P2_DOWN, ()->stateManager.execute(2,3)));
        getBindings().add(new Listener(Settings.P2_LEFT, ()->stateManager.execute(2,4)));
        //
    }
    public void init() { }


    public void addJFrame(JFrame jFrame) {

    }


    public void update() {

    }
}
