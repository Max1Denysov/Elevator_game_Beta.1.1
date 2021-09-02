import java.util.Scanner;

public class moves_mech {
    ///////////////////
    /////VARIABLES/////////
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    ///////////////////
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public int count;
    public int floors;
    public int people_inside;
    public String decition;
    public boolean game = true;
    public int goUp;
    public static Scanner sc = new Scanner(System.in);

    ///////////////////
    /////VOIDS/////////
    ///////////////////
    public void starts() {
        System.out.println(ANSI_YELLOW+"Hello\nLets build our elevator house\nHow many floors your building have?");
        floors = sc.nextInt();
        System.out.println(ANSI_YELLOW+"How many people can be inside?");
        people_inside = sc.nextInt();
        System.out.println("Okay,lets go!");


    }

    public void creation() {
        count = 1;
        System.out.println(ANSI_BLUE+"/===============\\");
        System.out.println(ANSI_BLUE+" ---------------");
        while (count < floors) {
            System.out.println(ANSI_GREEN+" | |---[ ]---| |");
            count++;
            if (count == floors) {
                break;
            }
        }
        elevatorOBJ();
        menu();

    }

    public void elevatorOBJ() {
        System.out.println(ANSI_GREEN+" | |---[x]---| |");

    }




    public void move() {
        System.out.println(ANSI_YELLOW+"On which floor?\n");
        goUp = sc.nextInt();
        count = 1;
        if (goUp>floors){
            System.out.println(ANSI_GREEN+" | ERROR YOU ON the Roof - DEAD");
            System.out.println(ANSI_GREEN+" |^^^^^[ ]^^^^^|");
            starts();
        }
        System.out.println(ANSI_BLUE+"/===============\\");
        System.out.println(ANSI_BLUE+" ---------------");
        while (count < floors - goUp) {
            System.out.println(" | |---[ ]---| |");
            count++;
            if (count == floors -goUp) {
                break;
            }
        }
        elevatorOBJ();
        count = floors - goUp;
        while (count < floors) {
            System.out.println(ANSI_GREEN+" | |---[ ]---| |");
            count++;
            if (count == floors-1) {
                break;
            }

        }


        menu();
    }
    public void menu(){
        System.out.println(ANSI_PURPLE+" ---|MOVE|---");
        decition = sc.next();
        if(decition.equals("move")){
                move();

}

    }














}