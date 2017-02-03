package Controller.Controllers;

import Controller.Controller;
import State.GameState;
import Utilties.Settings;
import Controller.Listener;
import javax.swing.*;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class GameController extends Controller{
    GameState stateManager;
    JFrame jFrame;
    public GameController(GameState stateManager, JFrame jFrame) {
        super(jFrame);
        this.stateManager = stateManager;
        //this.state=state;
        this.jFrame=jFrame;
        getKeyMapping().put(Settings.UP,()->stateManager.execute());
        getKeyMapping().put(Settings.DOWN,()->stateManager.execute());
        //getKeyMapping().put(Settings.ENTER,()->state.enter());
        //getKeyMapping().put(Settings.ESCAPE,()->state.escape());

        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        //getBindings().add(new Listener(Settings.ENTER, getKeyMapping().get(Settings.ENTER)));
        //getBindings().add(new Listener(Settings.ESCAPE, getKeyMapping().get(Settings.ESCAPE)));
    }
    public void init() { }


    public void addJFrame(JFrame jFrame) {

    }


    public void update() {

    }
}
