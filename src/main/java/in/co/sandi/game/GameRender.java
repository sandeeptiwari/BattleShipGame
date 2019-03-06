package in.co.sandi.game;



import in.co.sandi.gameobject.Player;
import in.co.sandi.gameobject.TargetLocation;
import in.co.sandi.init.Game;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameRender implements IGame {
    private Game game;
    Player player1, player2;

    public GameRender(Game game, Player player1, Player player2) {
        this.game = game;
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void create() {

    }

    @Override
    public void render() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);


    }

    @Override
    public void over() {

    }


    class Player1Task implements Callable<Boolean>{
        private List<TargetLocation> playerOnesTargetLocationList;
        private List<TargetLocation> playerTwosTargetLocationList;

        Player1Task(List<TargetLocation> playerOnesTargetLocationList, List<TargetLocation> playerTwosTargetLocationList){
            this.playerOnesTargetLocationList = playerOnesTargetLocationList;
            this.playerTwosTargetLocationList = playerTwosTargetLocationList;
        }

        @Override
        public Boolean call() throws Exception {
            return null;
        }
    }



}
