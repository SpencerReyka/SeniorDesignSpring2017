package Utilties;

/**
 * Created by Dartyx on 2/2/2017.
 */
public class Settings {
    public static int GAMEWIDTH = 800;
    public static int GAMEHEIGHT = 600;

    //MAP WIDTH AND HEIGHT CAN CHANGE, SHOULD BE STATIC
    public static int TILEWIDTH = 64 * 2;
    public static int TILEHEIGHT = 56 * 2;
    public static int PLAYERWIDTH = TILEWIDTH / 2;
    public static int PLAYERHEIGHT = TILEHEIGHT / 2;


    public static int NORTH = 90;
    public static int NE = 45;
    public static int SE = 315;
    public static int SOUTH = 270;
    public static int SW = 225;
    public static int NW = 135;
    public static int West = 135;
    public static int East = 135;
    // adjustable keys
    public static int UP = 119;
    public static int DOWN = 115;

    // end adjustable keys

    public static int TAB = 0x09;
    public static int ENTER = 10;
    public static int ESC = 0x1B;


    public static String TITLE = "Game";

}
