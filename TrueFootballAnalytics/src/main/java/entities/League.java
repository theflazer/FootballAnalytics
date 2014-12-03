package entities;

import entities.Season;



public class League {
	private static Season currentSeason;
	public static Season getCurrentSeason() {
		return currentSeason;
	}
	
	public static void startSeason(String [] inputs){
		int year=Integer.parseInt(inputs[0]);
		if(currentSeason==null)
			currentSeason=new Season(year);
	}

	public static void stopSeason() {
		if(currentSeason!=null)
			currentSeason.archive();
		currentSeason=null;
	}
}
