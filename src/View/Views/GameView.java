package View.Views;

import State.*;
import Utilties.Settings;
import View.ViewRender.Render;

import java.awt.*;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class GameView implements Render {
    private String[] options = {"Create New Game", "Load Game", "Exit Game"};
    int width,height;
    Curs p1,p2;
    int dim = 10;
    int w;
    int h;
    public GameView(Curs p1, Curs p2){
        width = Settings.GAMEWIDTH;
        height = Settings.GAMEHEIGHT;
        this.p1 = p1;
        this.p2 = p2;
        w = width/(dim+1);
        h = height/(dim+1);
    }
    @Override
    public void render(Graphics g) {

        for(int i=0;i<dim;i++) {
            for(int j=0;j<dim;j++){
                if(p1.check(i,j)){
                    //paint p1
                    g.setColor(Color.RED);
                    draw(i,j,g);
                    //g.drawRect(w/dim+1,h/dim+1,h,w);
                }
                else if(p2.check(i,j)) {
                    g.setColor(Color.GREEN);
                    draw(i,j,g);
                    //paint p2
                }
                else{
                    g.setColor(Color.BLACK);
                    draw(i,j,g);
                    //paint square
                }
            }
        }
        /*g.setColor(Color.BLUE);
        g.drawRect(0,0,width,height);
        g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 65));
        FontMetrics fm = g.getFontMetrics();
        int totalWidth = (fm.stringWidth("Papa DJ's Wild Ride"));
        g.drawString("Papa DJ's Wild Ride",(width - totalWidth) / 2,height/6);


        for(int i=0;i<3;i++){
            g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
            fm = g.getFontMetrics();
            totalWidth = (fm.stringWidth(options[i]));
            int x = (width - totalWidth) / 2;
            int y = 50 + (height / 2) - 100 + 120 * i;

            if (i == cursor.getCursor()) {
                g.setColor(new Color(197, 239, 247, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(39, 49, 63));

            } else {
                g.setColor(new Color(39, 49, 63, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(197, 239, 247));
            }
            g.drawString(options[i], x, y);

        }*/


    }
    public void draw(int i, int j, Graphics g){
        g.fillRect(w/(dim+1)*(i+1)+w*i,h/(dim+1)*(j+1)+h*j,w,h);
    }
}

