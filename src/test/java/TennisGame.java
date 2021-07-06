public class TennisGame {
    public String score;
    public void wonPoint(String winner) {
        if(winner.equals("player1")) {
            score = "15-0";
        }else{
            score = "0-15";
        }
    }

    public String getScore() {
        return score;
    }
}
