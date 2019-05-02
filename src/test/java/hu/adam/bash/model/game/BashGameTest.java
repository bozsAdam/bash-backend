package hu.adam.bash.model.game;

import hu.adam.bash.model.player.Player;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BashGameTest {

    private BashGame bashGame;

    @BeforeEach
    void initializeGame(){
        this.bashGame = new BashGame();
    }


    @Test
    void stepOneRoundTooMuchRollValue() {
        assertThrows(RuntimeException.class,() -> bashGame.stepOneRound(88,1));
    }

    @Test
    void stepOneRoundRollValueMinus() {
        assertThrows(RuntimeException.class,() -> bashGame.stepOneRound(-1,1));
    }

    @Test
    void checkPlayersHealthWithoutPlayers() {
        assertThrows(RuntimeException.class,() -> bashGame.checkPlayersHealth());
    }

    @Test
    void checkHealthWhenEveryoneDead(){

        Player player = Player.builder()
                        .health(0)
                        .name("Test")
                        .build();

        Player player1 = Player.builder()
                .health(0)
                .name("Mock")
                .build();

        Player player2 = Player.builder()
                .health(0)
                .name("MockTest")
                .build();

        bashGame.setPlayers(Arrays.asList(player,player1,player2));

        assertTrue(bashGame.checkPlayersHealth());
    }

    @Test
    void checkHealthWhenThereIsAWinner(){

        Player player = Player.builder()
                .health(0)
                .name("Test")
                .build();

        Player player1 = Player.builder()
                .health(0)
                .name("Mock")
                .build();

        Player player2 = Player.builder()
                .health(1)
                .name("MockTest")
                .build();

        bashGame.setPlayers(Arrays.asList(player,player1,player2));

        assertTrue(bashGame.checkPlayersHealth());
    }

    @Test
    void checkHealthWhenNoOneIsDead(){

        Player player = Player.builder()
                .health(2)
                .name("Test")
                .build();

        Player player1 = Player.builder()
                .health(0)
                .name("Mock")
                .build();

        Player player2 = Player.builder()
                .health(1)
                .name("MockTest")
                .build();

        bashGame.setPlayers(Arrays.asList(player,player1,player2));

        assertFalse(bashGame.checkPlayersHealth());
    }

}