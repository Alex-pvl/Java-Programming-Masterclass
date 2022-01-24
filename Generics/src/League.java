import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<U extends Player, T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in " + this.getName());
            return false;
        } else {
            System.out.println(team.getName() + " was added to " + this.getName());
            league.add(team);
            return true;
        }
    }

    public void printTeams() {
        System.out.println("\nRanking");
        Collections.sort(league);
        int i = 1;
        for (Team t : league) {
            System.out.println(i + ") " + t.getName() + ": " + t.ranking());
            i++;
        }
    }


}
