package in.co.sandi.gameobject;

import java.util.List;

public class Player {
    private String playerName;
    private List<TargetLocation> targetLocations;
    private final List<Ship> ships;

    private Grid ownField;
    private Grid oppnentField;

    public Player(List<Ship> ships) {
        this.ships = ships;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<TargetLocation> getTargetLocations() {
        return targetLocations;
    }

    public void setTargetLocations(List<TargetLocation> targetLocations) {
        this.targetLocations = targetLocations;
    }

    public Grid getOwnField() {
        return ownField;
    }

    public void setOwnField(Grid ownField) {
        this.ownField = ownField;
    }

    public Grid getOppnentField() {
        return oppnentField;
    }

    public void setOppnentField(Grid oppnentField) {
        this.oppnentField = oppnentField;
    }
}
