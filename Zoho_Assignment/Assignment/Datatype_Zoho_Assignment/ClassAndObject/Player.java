public class Player {
    public String playerName;
    public String playerPosition;
    public int jerseyNumber;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    void playGame() {
        System.out.println("The Player has play the Game");
    }

    void train() {
        System.out.println("The Payer is in Training Now");
    }
}
