package entities;

import java.util.LinkedList;
import analytics.*;

public class Team {
	private String name;
	private double PDO;
	private double TSR;
	private double possesionAvg;
	private double matchesPlayed;
	private double points;
	private double win;
	private double loss;
	private double draw;
	private double totalGoals;
	private double totalConceded;
	private double[] results;
	LinkedList result;// = new LinkedList();
	
	public Team(String n){
		name = n;
		matchesPlayed = 0.0;
		PDO = 0.0;
		TSR = 0.0;
		possesionAvg = 0.0;
		points = 0.0;
		win = 0.0;
		draw = 0.0;
		totalGoals = 0.0;
		totalConceded = 0.0;
		loss = 0.0;
		LinkedList<Double> result = new LinkedList<Double>();
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	
	public double getPDO(){
		return PDO;
	}
	
	public double getTSR(){
		return TSR;
	}
	
	public double getPossession(){
		return possesionAvg;
	}
	
	public double getMatches(){
		return matchesPlayed;
	}
	
	public void update(double PDO, double TSR, double possesion, double goalsScored, double goalsAgainst){
		updatePDO(PDO);
		updateTSR(TSR);
		updatepossesion(possesion);
		updatematches();
		updateTableStats(goalsScored, goalsAgainst);
		updateFormGuide(goalsScored, goalsAgainst);
	}
	
	private void updateFormGuide(double goalsScored, double goalsAgainst) {
		if(matchesPlayed<6)
			result.add((double)goalsScored-goalsAgainst);
		else{
			result.add((double)goalsScored-goalsAgainst);
			result.removeFirst();
		}
	}
	public void updatePDO(double matchPDO){
		PDO=(PDO*matchesPlayed + matchPDO)/(matchesPlayed+1);
	}
	
	public void updateTableStats(double goalsScored, double goalsAgainst){
		if(goalsScored>goalsAgainst){
			win++;
			points+=3;
		}
		else if(goalsAgainst>goalsScored){
			loss++;
		}
		else{
			draw++;
			points++;
		}
	}
	
	public void updateTSR(double matchTSR){
		TSR=(TSR*matchesPlayed + matchTSR)/(matchesPlayed+1);
	}

	public void updatepossesion(double possesion){
		possesionAvg=(possesionAvg*matchesPlayed + possesion)/(matchesPlayed+1);
	}

	public void updatematches(){
	matchesPlayed++;
	}
	
	public double getPoints(){
		return points;
	}
}
