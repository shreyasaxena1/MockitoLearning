package assertions;

import assertions.Player;

public class PlayerStatistics {
    private Player player;
    private int goals;
    private int games;

    public PlayerStatistics(Player player,int games,int goals){
        this.player=player;
        this.games=games;
        this.goals=goals;
    }

    public double gamesPerGoal(){
        return (double)this.games/(double)this.goals;
    }

    public double goalsPerGame(){
        return (double)this.goals/(double)this.games;
    }

    public boolean underThirty(){
        return player.getAge() < 30;
    }
    public Double[] createCsvRecord(){
        if(this.games==0) {
            return null;
        }
        else{
            return new Double[]{goalsPerGame(),gamesPerGoal()};
        }
    }

    public static Player getYoungerPlayer(Player player1,Player player2){
      return player1.getAge()>player2.getAge() ? player2:player1;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }
}
