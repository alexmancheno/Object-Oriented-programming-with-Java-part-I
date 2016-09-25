
import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers;
    private int maxSize = 16;

    public Team(String teamName) {
        this.teamName = teamName;
        this.teamPlayers = new ArrayList<Player>();
    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (teamPlayers.size() < maxSize) {
            teamPlayers.add(player);
        }
    }

    public int size() {
        return teamPlayers.size();
    }

    public void printPlayers() {
        for (Player players : teamPlayers) {
            System.out.println(players);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int goals () {
        int totalGoals = 0;
        for (Player players : teamPlayers) {
            totalGoals += players.goals();
        }
        return totalGoals;
    }
}
