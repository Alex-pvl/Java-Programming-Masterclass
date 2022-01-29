public class Main {
	public static void main(String[] args) {
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		FootballPlayer joe = new FootballPlayer("Joe");
		adelaideCrows.addPlayer(joe);

		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		FootballPlayer banks = new FootballPlayer("Banks");
		melbourne.addPlayer(banks);

		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");

		League<FootballPlayer, Team<FootballPlayer>> footballLeague = new League<>("YEFA");
		footballLeague.addTeam(adelaideCrows);
		footballLeague.addTeam(melbourne);
		footballLeague.addTeam(hawthorn);
		footballLeague.addTeam(fremantle);

		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		adelaideCrows.matchResult(fremantle, 2, 1);

		footballLeague.printTeams();
	}
}
