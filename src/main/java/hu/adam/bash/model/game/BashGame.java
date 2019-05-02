package hu.adam.bash.model.game;

import hu.adam.bash.model.player.Player;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class BashGame implements Game {

    BashGame(){
        this.gamePhase = Phase.OPEN;
    }

    public BashGame(List<Player> players, long id, int currentRound, int currentHighest, long currentPlayerId) {
        this.players = players;
        this.id = id;
        this.currentRound = currentRound;
        this.currentHighest = currentHighest;
        this.currentPlayerId = currentPlayerId;
        this.gamePhase = Phase.OPEN;
    }

    @Singular
    private List<Player> players = new ArrayList<>();

    private long id;
    private int currentRound;
    private int currentHighest;
    private long currentPlayerId;
    private Phase gamePhase;

    @Override
    public void stepOneRound(int rollValue, long playerId) {

    }

    @Override
    public boolean isEveryoneDead() {
        int alivePlayerCount = (int) players.stream()
                .filter(player -> player.getHealth() > 0)
                .count();

        return alivePlayerCount == 0;
    }

    @Override
    public void startGame() {

    }

    @Override
    public void endGame() {

    }
}
