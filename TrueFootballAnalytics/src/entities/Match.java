package entities;


public class Match {
	private Team homeTeamName;
	private Team awayTeamName;
	private int homeGoals;
	private int awayGoals;
	private int homeShots;
	private int awayShots;
	private int homeSaves;
	private int awaySaves;
	private int homeP;
	private int awayP;
	
	
	public Match(Team hTeam, Team aTeam, int hGoals, int aGoals, int hShots, int aShots, int hSaves, int aSaves, int hP, int aP){
		homeTeamName = hTeam;
		awayTeamName = aTeam;
		homeGoals = hGoals;
		awayGoals = aGoals;
		homeShots = hShots;
		awayShots = aShots;
		homeSaves = hSaves;
		awaySaves = aSaves;
		homeP = hP;
		awayP = aP;
		hTeam.updateHomeStats(this);
		aTeam.updateAwayStats(this);
	}
	
	public void displayString(){
		System.out.println(homeTeamName.getName() + " " + awayTeamName.getName() + " " + homeGoals + " " + awayGoals + " " +homeShots + " "+ awayShots + " " + homeSaves +" " + awaySaves + " " + homeP + " " + awayP); 
	}

}
