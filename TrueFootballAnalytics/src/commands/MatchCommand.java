package commands;

import entities.*;


public class MatchCommand implements Command{
		private Season season = League.getCurrentSeason();
	public void process(String[] matchStats){
		season.newMatch(matchStats);
	}

}
