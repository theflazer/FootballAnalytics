package analytics;

import entities.*;

	public class AnalyticsCentral {
		
		private static double leagueAvgPDO;
		private static double leagueAvgTSR;
		private static double averageCounter;
		
		
		public AnalyticsCentral(){
			leagueAvgPDO=0.0;
			leagueAvgTSR=0.0;
			averageCounter=0.0;
		}
		
		public void updateLeagueAvgs(Team team, double goals, double shots, double saves, double goalsAgainst, double possesion){
			leagueAvgTSR=((leagueAvgTSR*averageCounter)+processTSR(shots ,saves, goalsAgainst)/(averageCounter+1));
			leagueAvgPDO=((leagueAvgPDO*averageCounter)+processPDO(goals ,shots ,saves, goalsAgainst)/(averageCounter+1));
		}
		
		public static double processPDO(double goals, double shots, double saves, double goalsAgainst){
			return ((goals/shots)+ (goalsAgainst/saves))*1000;
		}
		
		public static double processTSR(double shots, double saves, double goalsAgainst){
			return (shots/(saves+goalsAgainst));
		}
		
		public void updateStats(Team team, double goals, double shots, double saves, double goalsAgainst, double possesion){
			updateLeagueAvgs(team, goals, shots, saves, goalsAgainst, possesion);
			double PDO = processPDO(goals ,shots ,saves, goalsAgainst);
			double TSR = processTSR(shots ,saves, goalsAgainst);
			team.update(PDO, TSR, possesion, goals, goalsAgainst);		
			averageCounter++;
		}

		public static double getLeagueAvgPDO() {
			return leagueAvgPDO;
		}

		public static void setLeagueAvgPDO(double leagueAvgPDO) {
			AnalyticsCentral.leagueAvgPDO = leagueAvgPDO;
		}

		public static double getLeagueAvgTSR() {
			return leagueAvgTSR;
		}

		public static void setLeagueAvgTSR(double leagueAvgTSR) {
			AnalyticsCentral.leagueAvgTSR = leagueAvgTSR;
		}

		public static double getAverageCounter() {
			return averageCounter;
		}

		public static void setAverageCounter(double averageCounter) {
			AnalyticsCentral.averageCounter = averageCounter;
		}
	
}
