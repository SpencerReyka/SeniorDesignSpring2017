package View;

import Utilties.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by Dartyx on 2/13/2017.
 */
public class GameScreen  {
    int width = Settings.GAMEWIDTH;
    int height = Settings.GAMEHEIGHT;
    public Canvas canvas;// = new Canvas();//set this to a global access

    public Canvas getCanvas() {
        return canvas;
    }

    public JFrame getFrame() {
        return frame;
    }

    JFrame frame;
    public GameScreen(){
        //frame = new JFrame();
        //Canvas canvas;
        frame = new JFrame("game");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(true);
        frame.setFocusable(true);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(true);
        frame.add(canvas);
        //frame.getRootPane().add(canvas, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
        /*setTitle("GameScreen");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);



        */
    }
    public void init(){Dimension dimensions = new Dimension(width,height);
        /*setMinimumSize(dimensions);

        canvas = new Canvas();
        canvas.setPreferredSize(dimensions);
        canvas.setMinimumSize(dimensions);
        canvas.setFocusable(true);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(canvas, BorderLayout.CENTER);
        pack();

        this.getRootPane().addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Settings.GAMEHEIGHT = height = getHeight();
                Settings.GAMEWIDTH = width = getWidth();

                canvas.setPreferredSize(new Dimension(width,height));
                setFocusable(true);
                repaint();
            }
        });}
        */}
}
