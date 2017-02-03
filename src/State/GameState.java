package State;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class GameState {
        Curs cursor;
        public void GameState(Curs cursor){
            this.cursor=cursor;
        }
        public void execute(){
            cursor.add(1);
        };

}
