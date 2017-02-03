package Controller;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class Controller {
    private Map<Integer, Action> keyMapping;
    private ArrayList<KeyListener> bindings;
    JFrame jFrame;
    public Controller(JFrame jFrame) {
        this.jFrame=jFrame;
        keyMapping=new HashMap<>();
        bindings=new ArrayList<>();
    }


    public void addToJframe(){
        for(KeyListener bind: bindings){
            jFrame.addKeyListener(bind);
        }
    }
    public void removeFromJframe(){
        for(KeyListener bind: bindings){
            jFrame.removeKeyListener(bind);
        }
    }
    public Map<Integer, Action> getKeyMapping() {
        return keyMapping;
    }

    public void setKeyMapping(Map<Integer, Action> keyMapping) {
        this.keyMapping = keyMapping;
    }

    public ArrayList<KeyListener> getBindings() {
        return bindings;
    }

    public void setBindings(ArrayList<KeyListener> bindings) {
        this.bindings = bindings;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }
}
