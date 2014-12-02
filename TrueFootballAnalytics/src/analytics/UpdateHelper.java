package analytics;

import entities.*;

public class UpdateHelper {
	public static void updateStats(Match m){
		double homeGoals = (double)m.gethomeGoals();
		double awayGoals = (double)m.getawayGoals();
		double homeShots= (double)m.gethomeShots();
		double homeSaves = (double)m.gethomeSaves();
		double awayShots= (double)m.getawayGoals();
		double awaySaves = (double)m.getawayGoals();
		double homePossesion = (double)m.gethomeP();
		double awayPossesion= (double)m.getawayP();
		
		League.getCurrentSeason().getAnalyticsClass().updateStats(m.getHomeTeam(), homeGoals, homeShots, homeSaves, awayGoals, homePossesion);
		League.getCurrentSeason().getAnalyticsClass().updateStats(m.getAwayTeam(), awayGoals, awayShots, awaySaves, homeGoals, awayPossesion);
	}
}
