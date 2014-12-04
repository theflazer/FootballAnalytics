package entities;

import entities.Season;



public class League implements LeagueInterface{
	private static SeasonInterface currentSeason;
	private String name;
	public League(String n, int year) {
		name = n;
		startSeason(year);
	}

	public SeasonInterface getCurrentSeason() {
		return currentSeason;
	}
	
	public void startSeason(int year){
		if(currentSeason==null)
			currentSeason=new Season(year);
	}

	public void stopSeason() {
		if(currentSeason!=null)
			currentSeason.archive();
		currentSeason=null;
	}

	public String getName() {
		return name;
	}

	@Override
	public void newMatch(String[] matchstats) {
		currentSeason.newMatch(matchstats);
		
	}
}
