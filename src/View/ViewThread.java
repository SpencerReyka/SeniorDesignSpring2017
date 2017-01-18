package View;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class ViewThread implements Runnable {

    //private ViewRender
    private Thread viewThread;

    @Override
    public void run() {

    }

    public void start(){
        if(viewThread==null){
            viewThread = new Thread(this);
            viewThread.setName("View Thread");
            viewThread.start();
        }

    }
}
