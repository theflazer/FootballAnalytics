package analytics;

	public class AnalyticsCentral{
		
		public static double processPDO(double goals, double shots, double saves, double goalsAgainst){
			return ((goals/shots)+ (goalsAgainst/saves))*1000;
		}
		
		public static double processTSR(double shots, double saves, double goalsAgainst){
			return (shots/(saves+goalsAgainst));
		}
		
		
}
