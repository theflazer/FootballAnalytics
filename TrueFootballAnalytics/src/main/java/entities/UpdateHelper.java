package entities;

public class UpdateHelper {
	public static void updateTeam(MatchInterface m, TeamInterface hTeam, TeamInterface aTeam){
		int homeGoals = m.getHomeGoals();
		int awayGoals = m.getAwayGoals();
		int homeShots= m.getHomeShots();
		int homeSaves = m.getHomeSaves();
		int awayShots= m.getAwayShots();
		int awaySaves = m.getAwaySaves();
		double homePossesion = (double)m.getHomeP();
		double awayPossesion= (double)m.getAwayP();
		
		hTeam.update(homePossesion, homeGoals, awayGoals);
		aTeam.update(awayPossesion,awayGoals,homeGoals);
		
		//League.getCurrentSeason().updateTeam(m.getHomeTeam(), homeGoals, homeShots, homeSaves, awayGoals, homePossesion);
		//League.getCurrentSeason().updateTeam(m.getAwayTeam(), awayGoals, awayShots, awaySaves, homeGoals, awayPossesion);
		
	}

}
