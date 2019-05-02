package hu.adam.bash.model.game;

import hu.adam.bash.model.player.Player;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BashGame implements Game {

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
