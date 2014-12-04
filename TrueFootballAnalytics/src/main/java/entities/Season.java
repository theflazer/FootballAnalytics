package entities;
import io.Printer;

import java.util.ArrayList;

import analytics.*;


public class Season implements SeasonInterface{
	private int year;
	private ArrayList<MatchInterface> matchList;
	private ArrayList<TeamInterface> teamList;
	private static double leagueAvgPDO;
	private static double leagueAvgTSR;
	private static double averageCounter;
	
	public Season(int y) {
		year=y;
		matchList = new ArrayList<MatchInterface>();
		teamList = new ArrayList<TeamInterface>();
		leagueAvgPDO=0.0;
		leagueAvgTSR=0.0;
		averageCounter=0.0;
	}


	public void newMatch(String[] matchStats){

		TeamInterface hTeam = findTeam(matchStats[0]);
		TeamInterface aTeam = findTeam(matchStats[1]);
		int hGoals = Integer.parseInt(matchStats[2]);
		int aGoals = Integer.parseInt(matchStats[3]);
		int hShots = Integer.parseInt(matchStats[4]);
		int aShots = Integer.parseInt(matchStats[5]);
		int hSaves = Integer.parseInt(matchStats[6]);
		int aSaves = Integer.parseInt(matchStats[7]);
		int hP = Integer.parseInt(matchStats[8]);
		int aP = Integer.parseInt(matchStats[9]);
		
		MatchInterface m = new Match(hTeam, aTeam, hGoals, aGoals, hShots, aShots, hSaves, aSaves, hP, aP);
		matchList.add(m);
		updateStats(hTeam,(double)hGoals,(double)hShots,(double)hSaves,(double)aGoals,(double)hP);
		updateStats(aTeam,(double)aGoals,(double)aShots,(double)aSaves,(double)hGoals,(double)aP);
		UpdateHelper.updateTeam(m, hTeam, aTeam);
		
		
	}
	
	private TeamInterface findTeam(String name){
		for(TeamInterface t : teamList){
			if(t.getName().equals(name))
				return t;
		}
		TeamInterface t=new Team(name);
		teamList.add(t);
		return t;
	}

	public void archive() {
		// TODO Auto-generated method stub
		Printer.PrintToFile(teamList, Integer.toString(year));
		System.out.println("Season has been archived");
		System.out.println("League Table");
		Printer.PrintToConsole(teamList, Integer.toString(year));
	}
	
	public ArrayList<TeamInterface> getTeamList() {
		return teamList;
	}


	public void setTeamList(ArrayList<TeamInterface> teamList) {
		this.teamList = teamList;
	}
	

	public void updateTSR(double matchTSR){
		leagueAvgTSR=(leagueAvgTSR*averageCounter + matchTSR)/(averageCounter+1);
	}
	
	public void updatePDO(double matchPDO){
		leagueAvgPDO=(leagueAvgPDO*averageCounter + matchPDO)/(averageCounter+1);
	}
	
	public void updateStats(TeamInterface team, double goals, double shots, double saves, double goalsAgainst, double possesion){
		//updateLeagueAvgs(team, goals, shots, saves, goalsAgainst, possesion);
		double PDO = AnalyticsCentral.processPDO(goals ,shots ,saves, goalsAgainst);
		team.updatePDO(PDO);
		updatePDO(PDO);
		double TSR = AnalyticsCentral.processTSR(shots ,saves, goalsAgainst);
		team.updateTSR(TSR);
		updateTSR(TSR);	
		averageCounter++;
	}
	public double getLeagueAvgPDO() {
		return this.leagueAvgPDO;
	}

	public void setLeagueAvgPDO(double leagueAvgPDO) {
		this.leagueAvgPDO = leagueAvgPDO;
	}

	public  double getLeagueAvgTSR() {
		return this.leagueAvgTSR;
	}

	public void setLeagueAvgTSR(double leagueAvgTSR) {
		this.leagueAvgTSR = leagueAvgTSR;
	}
	
	public void updateLeagueAvgs(TeamInterface team, double goals, double shots, double saves, double goalsAgainst, double possesion){
		//leagueAvgTSR=((leagueAvgTSR*averageCounter)+processTSR(shots ,saves, goalsAgainst)/(averageCounter+1));
		//leagueAvgPDO=((leagueAvgPDO*averageCounter)+processPDO(goals ,shots ,saves, goalsAgainst)/(averageCounter+1));
	}
	
	
	
}
