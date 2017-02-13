package State;

import View.Views.GameView;

import java.awt.*;

/**
 * Created by Dartyx on 2/3/2017.
 */
public class GameState {
        Curs p1,p2;
        GameView gameView;
        Graphics g;
        public GameState(){
            this.p1=new Curs(0);
            this.p2 = new Curs(0);
            gameView = new GameView(p1,p2);
        }
        public void execute(int player, int direction){
            //cursor.add(1);
            if(player == 1){
               switch(direction){
                   case 1:
                       p1.up();
                       break;
                   case 2:
                       p1.right();
                       break;
                   case 3:
                       p1.down();
                       break;
                   case 4:
                       p1.left();
                       break;
               }
            }
            else {
                switch(direction){
                    case 1:
                        p2.up();
                        break;
                    case 2:
                        p2.right();
                        break;
                    case 3:
                        p2.down();
                        break;
                    case 4:
                        p2.left();
                        break;
                }
            }

        };
        public void tick(){

        }
        public void render( Graphics g){
            gameView.render(g);
        }
}
