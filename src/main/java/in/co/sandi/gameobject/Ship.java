package in.co.sandi.gameobject;

public class Ship {
    public enum ShipType{
        P, Q
    }

    private ShipType type;
    private int width;
    private int height;
    private int xPos;
    private char yPos;
    private int lives;

    public Ship(ShipType type, int width, int height) {
        this.type = type;
        this.width = width;
        this.height = height;
        lives = type == ShipType.P ? 1 : 2;
    }



    public ShipType getType() {
        return type;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public char getyPos() {
        return yPos;
    }

    public void setyPos(char yPos) {
        this.yPos = yPos;
    }

    public int getLives() {
        return lives;
    }
}


