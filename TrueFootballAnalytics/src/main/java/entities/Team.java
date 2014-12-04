package entities;

import java.util.LinkedList;

import analytics.*;

public class Team implements TeamInterface {
	private String name;
	private double PDO;
	private double TSR;
	private double possesionAvg;
	private int matchesPlayed;
	private int points;
	private int win;
	private int loss;
	private int draw;
	private int totalGoals;
	private int totalConceded;
	private double indicative;

	LinkedList<Double> result;
	
	public Team(String n){
		name = n;
		matchesPlayed = 0;
		PDO = 0.0;
		TSR = 0.0;
		possesionAvg = 0.0;
		points = 0;
		win = 0;
		draw = 0;
		totalGoals = 0;
		totalConceded = 0;
		loss = 0;
		indicative = 0;
		result = new LinkedList<Double>();
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
	
	public void update( double possesion, int goalsScored, int goalsAgainst){
		updatepossesion(possesion);
		updatematches();
		updateTableStats(goalsScored, goalsAgainst);
		updateFormGuide(goalsScored, goalsAgainst);
	}
	
	private void updateFormGuide(double goalsScored, double goalsAgainst) {
		if(matchesPlayed<6)
			result.add(goalsScored-goalsAgainst);
		else{
			result.add(goalsScored-goalsAgainst);
			result.removeFirst();
		}
	}
	
	public double getPoints(){
		return points;
	}

	
	public void updateTableStats(double goalsScored, double goalsAgainst){
		totalGoals+=goalsScored;
		totalConceded+=goalsAgainst;
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
	
	
	public void updatepossesion(double possesion){
		possesionAvg=(possesionAvg*matchesPlayed + possesion)/(matchesPlayed+1);
	}

	public void updatematches(){
	matchesPlayed++;
	}
	
	@Override
	public String toString(){
		String result = String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", this.name, this.matchesPlayed, this.win, this.loss, this.draw, this.points, this.indicative, this.PDO,'%', this.TSR, '%');
		return result;
		
	}
	
	public LinkedList<Double> getResult() {
		return result;
	}
	public void setResult(LinkedList<Double> result) {
		this.result = result;
	}
	
	public void setIndicative(double prediction){
		this.indicative = prediction;
	}
	
	public double getIndicative(){
		return indicative;
	}
	
	public void setPDO(double finalPDO){
		PDO = finalPDO;
	}
	
	public void setTSR(double finalTSR){
		TSR = finalTSR;
	}
	
	public void updateTSR(double matchTSR){
		TSR=(TSR*matchesPlayed + matchTSR)/(matchesPlayed+1);
	}

	public void updatePDO(double matchPDO){
		PDO=(PDO*matchesPlayed + matchPDO)/(matchesPlayed+1);
	}
	
}
