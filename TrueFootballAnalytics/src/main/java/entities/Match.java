package entities;

public class Match implements MatchInterface {
	private TeamInterface homeTeam;
	private TeamInterface awayTeam;
	private int homeGoals;
	private int awayGoals;
	private int homeShots;
	private int awayShots;
	private int homeSaves;
	private int awaySaves;
	private int homeP;
	private int awayP;
	
	
	public Match(TeamInterface hTeam, TeamInterface aTeam, int hGoals, int aGoals, int hShots, int aShots, int hSaves, int aSaves, int hP, int aP){
		homeTeam = hTeam;
		awayTeam = aTeam;
		homeGoals = hGoals;
		awayGoals = aGoals;
		homeShots = hShots;
		awayShots = aShots;
		homeSaves = hSaves;
		awaySaves = aSaves;
		homeP = hP;
		awayP = aP;
	}
//	TODO:Get rid of Team Getters if not needed
	public TeamInterface getHomeTeam(){
		return homeTeam;
	}
	
	public TeamInterface getAwayTeam(){
		return awayTeam;
	}
	public int getHomeGoals(){
		return homeGoals;
	}
	
	public int getAwayGoals(){
		return awayGoals;
	}
	
	public int getHomeShots(){
		return homeShots;
	}
	
	public int getAwayShots(){
		return awayShots;
	}
	
	public int getHomeSaves(){
		return homeSaves;
	}
	
	public int getAwaySaves(){
		return awaySaves;
	}
	
	public int getHomeP(){
		return homeP;
	}
	
	public int getAwayP(){
		return awayP;
	}
	
	@Override
    public String toString(){
		return homeTeam.getName() + " " + awayTeam.getName() + " " + getHomeGoals() + " " + getAwayGoals() + " " + getHomeShots() + " "+ getAwayShots() + " " + getHomeSaves() +" " + getAwaySaves() + " " + getHomeP() + " " + getAwayP();
	}

}
