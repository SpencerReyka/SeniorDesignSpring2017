package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class ViewThread extends JFrame implements Runnable {

    //private ViewRender
    private Thread viewThread;

    @Override
    public void run() {
        JFrame frame = new JFrame("thisFrame");

    }

    public void start(){
        if(viewThread==null){
            viewThread = new Thread(this);
            viewThread.setName("View Thread");
            viewThread.start();
        }

    }
}
