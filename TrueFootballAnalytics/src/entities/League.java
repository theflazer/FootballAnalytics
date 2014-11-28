package entities;


public class League {
	private static Season currentSeason;
	public static Season getCurrentSeason() {
		return currentSeason;
	}
	
	public static void startSeason(int year){
		if(currentSeason==null)
			currentSeason=new Season(year);
	}

	public static void stopSeason() {
		if(currentSeason!=null)
			currentSeason.archive();
		currentSeason=null;
	}
}
