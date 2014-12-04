package analytics;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import entities.SeasonInterface;
import entities.TeamInterface;


public class PredictiveAnalysis {
	
	public static Map <TeamInterface, Double> predictedTable(ArrayList<TeamInterface> teams, double TSR, double PDO){
		Map <TeamInterface, Double> predictions = new HashMap<TeamInterface, Double>();
		for(TeamInterface t : teams){
			predictions.put(t, applyAnalytic(t, TSR, PDO));
		}
		return predictions;
	}

	public static double applyAnalytic(TeamInterface team, double avgTSR, double avgPDO){
		double finalTSR = ((team.getTSR()-avgTSR)/avgTSR);
		team.setTSR(finalTSR*100);
		double finalPDO = -((team.getPDO()-avgPDO)/avgPDO);
		team.setPDO(finalPDO*100);
		team.setIndicative(finalTSR+finalPDO);
		return (finalTSR+finalPDO);
	}
	
	public static double trendingFactor(LinkedList<Double> results){
		double trending = 0.0;
		for(int i=0; i< results.size(); i++)
			trending+=processForm(results.get(i),i);
			
		return -trending;
	}
	
	public static double momentumFactor(LinkedList<Double> results){
		double momentum = 0.0;
		for(int i=0; i< results.size(); i++)
			momentum+=processForm(results.get(i),i);
			
		return momentum;
	}
	
	private static double processForm(Double result, int i) {
		return (result*((i+1)/10.0));
	}

	public static void generateAnalyticTable(SeasonInterface s){
		double TSR=s.getLeagueAvgTSR();
		double PDO=s.getLeagueAvgPDO();
		for(TeamInterface t : s.getTeamList()){
			applyAnalytic(t, TSR, PDO);
		}
		//predictedTable(s.getTeamList(), s.getLeagueAvgTSR(), s.getLeagueAvgPDO());
		//ValueComparator ordered =  new ValueComparator(predictions);
		//TreeMap<TeamInterface,Double> results = new TreeMap<TeamInterface,Double>();
		//results.putAll(predictions);
		//System.out.println(momentumFactor(team.get(0).getResult()));
	}
}