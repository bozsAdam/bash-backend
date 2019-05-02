package hu.adam.bash.model.game;

import hu.adam.bash.model.player.Player;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void stepOneRound(int rollValue, long playerId) {

    }

    @Override
    public boolean checkPlayersHealth() {
        return false;
    }
}
