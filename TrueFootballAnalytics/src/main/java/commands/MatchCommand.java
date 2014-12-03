package commands;

import entities.*;


public class MatchCommand implements Command{
	
	private Season season = League.getCurrentSeason();
	String [] matchStats;
	public MatchCommand(String [] inputs){
		matchStats=inputs;
	}
	public void execute(){
		season.newMatch(matchStats);
	}

}
