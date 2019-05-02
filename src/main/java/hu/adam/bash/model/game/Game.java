package hu.adam.bash.model.game;

public interface Game {

    void stepOneRound(int rollValue,long playerId);

    boolean checkPlayersHealth();

}
