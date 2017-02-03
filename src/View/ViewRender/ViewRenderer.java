package View.ViewRender;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dartyx on 2/2/2017.
 */
public class ViewRenderer {
    List<Render> renderList = new ArrayList<Render>();
    Graphics g;

    ViewRenderer(Graphics g){
        this.g = g;
    }
    public void renderAll(){
        for(Render r : renderList){
            r.render(g);
            renderList.remove(r);
        }
        //Iterator<Render> iter = renderList.iterator();
    }

}
