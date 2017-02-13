package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class Listener implements KeyListener {
    boolean keyPressed;
    int key;
    Action action;
    public Listener(int key, Action action) {
        this.key=key;
        this.action=action;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==key){
            //System.out.println("action 1");
            //keyPressed = true;
            System.out.println("something");
            action.execute();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //if(e.getKeyCode()==key && keyPressed){
        //    System.out.println("action 2");
        //    keyPressed = false;
        //}
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode()==key){
            //System.out.println("action pressed");
            keyPressed = true;
            action.execute();
        }
    }
}