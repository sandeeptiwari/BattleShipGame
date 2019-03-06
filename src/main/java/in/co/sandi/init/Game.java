package in.co.sandi.init;


import in.co.sandi.gameobject.Grid;
import in.co.sandi.gameobject.Player;
import in.co.sandi.gameobject.Ship;
import in.co.sandi.gameobject.TargetLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int gridWidth;
    private char gridHeight;
    private int totalShips;
    private Scanner scanner;


    public Game(Scanner scanner){
        this.scanner = scanner;
    }

    public void setUp(String widthHeightofBattleArea, String numberOfBattleShips) {
        String[] boardWidthHeights = widthHeightofBattleArea.split(" ");
        List<Ship> playerOneShips = new ArrayList<>();
        List<Ship> playerTwoShips = new ArrayList<>();

        gridWidth = parseInt(boardWidthHeights[0]);
        gridHeight = boardWidthHeights[1].charAt(0);

        totalShips = parseInt(numberOfBattleShips);

        while(totalShips > 0){
            String input = scanner.nextLine();
            String shipDetails[] = input.split(" ");
            String shipType = shipDetails[0];
            int width = parseInt(shipDetails[1]);
            int height = parseInt(shipDetails[2]);

            int xPosOfPlayer1 = parseInt(shipDetails[4]);
            char yPosOfPlayer1 = shipDetails[3].charAt(0);

            int xPosOfPlayer2 = parseInt(shipDetails[6]);
            char yPosOfPlayer2 = shipDetails[5].charAt(0);


            Ship ship = new Ship(Ship.ShipType.valueOf(shipType), width, height);
            constructShip(ship, xPosOfPlayer1, yPosOfPlayer1);
            playerOneShips.add(ship);

            constructShip(ship, xPosOfPlayer2, yPosOfPlayer2);
            playerTwoShips.add(ship);

            totalShips--;
        }

        String playerOneTragetLocations = scanner.nextLine();
        List<TargetLocation> playerOneTragetlocations = constructTragetLocation(playerOneTragetLocations);

        String playerTwoTragetLocations = scanner.nextLine();
        List<TargetLocation> playerTwoTragetlocations = constructTragetLocation(playerTwoTragetLocations);

        Grid p1Grid = new Grid(gridWidth, gridHeight);
        p1Grid.init(playerOneShips);

        Grid p2Grid = new Grid(gridWidth, gridHeight);
        p2Grid.init(playerTwoShips);

        Player jhon = constructPlayer(playerOneShips, playerOneTragetlocations, p1Grid, p2Grid);
        Player bob = constructPlayer(playerTwoShips, playerTwoTragetlocations, p2Grid, p1Grid);


    }

    private Player constructPlayer(List<Ship> ships, List<TargetLocation> playerOneTragetlocations, Grid grid, Grid oppGrid){
        Player player = new Player(ships);
        player.setTargetLocations(playerOneTragetlocations);
        player.setOwnField(grid);
        player.setOppnentField(oppGrid);
        return player;
    }

    private List<TargetLocation> constructTragetLocation(String tragetLocations) {
        List<TargetLocation> locations = new ArrayList<>();

        String p1Locations[] = tragetLocations.split(" ");

        for (int i = 0; i < p1Locations.length; i = i+2) {
            TargetLocation location = new TargetLocation();
            location.setyPos(p1Locations[i].charAt(0));
            location.setxPos(parseInt(p1Locations[i+1]));
            locations.add(location);
        }

        return locations;
    }

    private void constructShip(Ship ship, int xPos, char yPos) {
        ship.setxPos(xPos);
        ship.setyPos(yPos);
    }


    public int parseInt(String num) {
        return Integer.parseInt(num);
    }


}
