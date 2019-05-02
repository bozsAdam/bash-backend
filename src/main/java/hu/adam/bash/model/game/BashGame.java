package hu.adam.bash.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BashGame implements Game {

    private List<Player>

    @Override
    public void stepOneRound(int rollValue, long playerId) {

    }
}
