package analytics;

import io.Printer;
import entities.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import entities.*;

public class PredictiveAnalysis {
	
	public static Map<Team, Double> predictedTable(ArrayList<Team> teams, double TSR, double PDO){
		Map <Team, Double> predictions = new HashMap<Team, Double>();
		for(Team t : teams){
			predictions.put(t, applyAnalytic(t, TSR, PDO));
		}
		return predictions;
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
	
	public static void printAnalyticTable(ArrayList<Team> team){
		Map <Team, Double> predictions = new HashMap<Team, Double>();
		predictions = predictedTable(team, League.getCurrentSeason().getAnalyticsClass().getLeagueAvgTSR(), League.getCurrentSeason().getAnalyticsClass().getLeagueAvgPDO());
		ValueComparator ordered =  new ValueComparator(predictions);
		//TreeMap<Team,Double> results = new TreeMap<Team,Double>();
		//results.putAll(predictions);
		System.out.println("Results:" + predictions);
	}
}