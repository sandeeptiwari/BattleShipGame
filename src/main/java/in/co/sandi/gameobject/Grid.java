package in.co.sandi.gameobject;

import in.co.sandi.utils.AppUtils;

import java.util.List;

public class Grid {

    private Cell[][] cell;
    private final int WIDTH;

    public Grid(int width, char height){
        WIDTH = width;
        cell = new Cell[width + 1][AppUtils.mapVerticalIndex(height) + 1];
    }

    public void init(List<Ship> ships) {
        placedShipIntoGrid(ships);
    }

    public void placedShipIntoGrid(List<Ship> ships){
        //.filter(ele -> AppUtils.isInsideGrid(WIDTH, ele.getxPos(), ele.getyPos()))
       ships.stream().forEach(ele -> {
           int x = ele.getxPos();
           int y = AppUtils.mapVerticalIndex(ele.getyPos());
           int width = x + ele.getWidth();
           int height = y + ele.getHeight();

           for (int i = x; i < width; i++) {
               for (int j = y; j < height; j++) {
                    Cell c = new Cell();
                    c.setShip(ele);
                    c.setHasShip(true);
                    c.setxPos(i);
                    c.setyPos(j);
                    cell[i][j] = c;
               }
           }
       });
    }
}
