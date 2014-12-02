package analytics;

import java.util.LinkedList;
import entities.*;

public class PredictiveAnalysis {
	
	
	public static void predictedTable(Team[] teams, double TSR, double PDO){
		for(Team t : teams){
			applyAnalytic(t, TSR, PDO);
		}
	}

	public static double applyAnalytic(Team team, double avgTSR, double avgPDO){
		double prediction = team.getPoints();
		prediction = prediction*((team.getTSR()-avgTSR)/avgTSR);
		prediction = prediction*((team.getPDO()-avgPDO)/avgPDO);
		return Math.round(prediction);
	}
	
	public static double trendingFactor(LinkedList<Double> results){
		double trending = 0.0;
		for(int i=0; i< results.size(); i++)
			trending+=results.get(i);
			
		return trending;
	}
	
	public static double momentumFactor(LinkedList<Double> results){
		double momentum = 0.0;
		for(int i=0; i< results.size(); i++)
			momentum+=results.get(i);
		
		return momentum;
	}
}
