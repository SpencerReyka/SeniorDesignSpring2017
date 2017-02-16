package Model;

/**
 * Created by Dartyx on 12/25/2016.
 */
//can probably delete all of this, ayy lmao was just to make sure i wasnt crazy
public class ModelThread2 implements Runnable {
    private Thread thread;
    private String title;
    private int width;
    private int height;
    private boolean running = false;


    boolean alive;

    // Initializes the game
    private void init(){
        // System.out.print("Game; init game");
//        stateManager = StateManager.getInstance();
        //System.out.println("Game; Current state: " + stateManager.getCurrentState());
    }

    private void tick(){
        int fps = 60;
        double perTick = 1000000000 / fps;
        double delta = 0;
        long now,then;
        then = System.nanoTime();
        long time = 0;
        int tick = 0;
        now = System.nanoTime();
        delta += (now - then) / perTick;
        time += now - then;
        then = now;

        if( delta>=1 ){System.out.println("tick");
            try{

            }catch(Exception e){

            }
            tick++;
            delta--;
        }

        //currentstateTick

        //catch
        //System.out.println("tick"+tick);
        if(time>1000000000){
            tick = 0;
            time = 0;
        }
    }


    public void run(){
        // Initialize the game
        init();
        int count=0;
        // Game loop
        while(running){
            tick();
            count++;
            // call current state tick
            System.out.println("tick"+count);
            if(count>60)count=0;
        }

        // Stop the thread
        stop();
    }

    public synchronized void start(){
        // If the game is already running, return
        if (running){
            return;
        } else {
            // Set running to true
            running = true;

            // Starts a game thread
            thread = new Thread(this);
            thread.start();
        }

    }

    public synchronized void stop(){
        // If game is already stopped, return
        if (!running){
            return;
        }

        // Set running to false
        running = false;

        // Safely stop the thread
        try{
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
