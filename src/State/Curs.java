package State;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class Curs {
    int cursor;
    public Curs(int x){
        cursor = x;
    }
    public void add(int x){
       cursor+=x;
    }
    public int getCursor(){
        return cursor;
    }
}
