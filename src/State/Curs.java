package State;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class Curs {
    int x;
    int y;
    public Curs(int x){
        x=0;
        y=0;
    }
    //public void add(int x){
       //cursor+=x;
    //}
    public void up(){
        if(y-1>0)y--;
    }
    public void down(){
        if(y+1<10)y++;
    }
    public void left(){
        if(x-1>0)x--;
    }
    public void right(){
        if(x+1<10)x++;
    }
    public boolean check(int x, int y){
        if(this.x == x && this.y == y)return true;
        else return false;
    }
    //public int getCursor(){
        //return cursor;
    //}
}
