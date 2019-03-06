package in.co.sandi;


import in.co.sandi.init.Game;

import java.util.Scanner;

public class BattleShipApp {

    public static void main(String...args){
        accept();
    }

    /**
     * Input:
     * The first line of the input contains the width and height of the battle area respectively.
     * The second line of the input contains the number of battleships that each player gets.
     * The third line of the input contains the type of the battleship, its dimensions (width and height) and coordinates for
     * Player-1 and Player-2.
     * The fourth line of the input contains the type of the battleship, its dimensions (width and height) and coordinates for
     * Player-2 and Player-2.
     * The fifth line contains the sequence of the target locations of missiles fired by Player-1.
     * The sixth line contains the sequence of the target locations of missiles fired by Player-2.
     */
    private static void accept(){
        Scanner sc = new Scanner(System.in);
        String widthHeightofBattleArea = sc.nextLine();
        String numberOfBattleShips = sc.nextLine();

        Game game = new Game(sc);
        game.setUp(widthHeightofBattleArea, numberOfBattleShips);


    }
}
