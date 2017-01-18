package Model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class ModelThread implements Runnable{
    //private ModelTicker
    private Thread modelThread;
    private final long milliTick=16;//dont remember why but this is important to make it 60 fps i think
    private long start=0;
    private int count=0;
    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new OneSec(), 0, 1000);
        while(true){
            startTick();
            //ModelTicker.tick()
            System.out.println(count);
            endTick();
            count++;
            if (count>60)count=0;
        }
    }
    private class OneSec extends TimerTask {
        public void run() {
            System.out.println("***********");
        }
    }
    public void startTick(){
        this.start = System.currentTimeMillis();
    }
    public void endTick(){
        long delta = System.currentTimeMillis() - start;
        if(delta < milliTick) {
            try{
                Thread.sleep(milliTick-delta);
            }catch( Exception e ){
                System.out.println("lmao");
            }
        }
        //else
    };


    public void start(){
        if(modelThread ==null){
            modelThread = new Thread(this);
            modelThread.setName("Model Thread");
            modelThread.start();
        }

    }
}
