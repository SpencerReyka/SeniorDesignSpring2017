package Model.ModelTick;

import View.ViewRender.Render;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dartyx on 2/2/2017.
 */
public class ModelTicker {
    List<Render> tickList = new ArrayList<Render>();
    Graphics g;

    public ModelTicker(Graphics g){
        this.g = g;
    }

    public void renderAll(){
        for(Render t : tickList){
            t.render(g);
            tickList.remove(t);
        }
    }
}
