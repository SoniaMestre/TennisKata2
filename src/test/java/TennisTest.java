import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisTest {
    @Test
    void firstPlayerWonPoint() {
        TennisGame game = new TennisGame();
        game.wonPoint("player1");
        assertThat(game.getScore(), equalTo("15-0"));
    }
    @Test
    void secondPlayerWonPoint() {
        TennisGame game = new TennisGame();
        game.wonPoint("player2");
        assertThat(game.getScore(), equalTo("0-15"));
    }
}
