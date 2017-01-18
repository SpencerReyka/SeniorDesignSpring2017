import Model.ModelThread;
import Model.ModelThread2;
import View.ViewThread;

/**
 * Created by Dartyx on 12/25/2016.
 */
public class Main {
    public static void main(String[] args){
        Thread.currentThread().setName("Main Thread");

        //create ViewThread
        ViewThread viewThread = new ViewThread();
        //create ModelThread
        ModelThread modelThread = new ModelThread();


        //start threads
        modelThread.start();

    }

}
