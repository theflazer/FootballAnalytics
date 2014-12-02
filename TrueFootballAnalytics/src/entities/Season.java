package entities;
import java.util.ArrayList;

import analytics.*;

public class Season {
	private int year;
	private static ArrayList<Match> matchList;
	private static ArrayList<Team> teamList;
	AnalyticsCentral Analytics;
	
	public Season(int y) {
		year=y;
		matchList = new ArrayList<Match>();
		teamList = new ArrayList<Team>();
		Analytics = new AnalyticsCentral();
	}


	public void newMatch(String[] matchStats){

		Team hTeam = findTeam(matchStats[0]);
		Team aTeam = findTeam(matchStats[1]);
		int hGoals = Integer.parseInt(matchStats[2]);
		int aGoals = Integer.parseInt(matchStats[3]);
		int hShots = Integer.parseInt(matchStats[4]);
		int aShots = Integer.parseInt(matchStats[5]);
		int hSaves = Integer.parseInt(matchStats[6]);
		int aSaves = Integer.parseInt(matchStats[7]);
		int hP = Integer.parseInt(matchStats[8]);
		int aP = Integer.parseInt(matchStats[9]);
		
		Match m = new Match(hTeam, aTeam, hGoals, aGoals, hShots, aShots, hSaves, aSaves, hP, aP);
		m.displayString();
		matchList.add(m);
	}
	
	private Team findTeam(String name){
		for(Team t : teamList){
			if(t.getName().equals(name))
				return t;
		}
		Team t=new Team(name);
		teamList.add(t);
		return t;
	}

	public void archive() {
		// TODO Auto-generated method stub
		System.out.println("End of "+year+" season");
	}
	
	public AnalyticsCentral getAnalyticsClass(){
		return Analytics;
	}
	
}
