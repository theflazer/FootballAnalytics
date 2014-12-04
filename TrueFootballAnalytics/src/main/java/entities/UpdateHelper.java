package entities;

import entities.*;

public class UpdateHelper {
	public static void updateTeam(MatchInterface m, TeamInterface hTeam, TeamInterface aTeam){
		int homeGoals = m.gethomeGoals();
		int awayGoals = m.getawayGoals();
		int homeShots= m.gethomeShots();
		int homeSaves = m.gethomeSaves();
		int awayShots= m.getawayShots();
		int awaySaves = m.getawaySaves();
		double homePossesion = (double)m.gethomeP();
		double awayPossesion= (double)m.getawayP();
		
		hTeam.update(homePossesion, homeGoals, awayGoals);
		aTeam.update(awayPossesion,awayGoals,homeGoals);
		
		//League.getCurrentSeason().updateTeam(m.getHomeTeam(), homeGoals, homeShots, homeSaves, awayGoals, homePossesion);
		//League.getCurrentSeason().updateTeam(m.getAwayTeam(), awayGoals, awayShots, awaySaves, homeGoals, awayPossesion);
		
	}

}
