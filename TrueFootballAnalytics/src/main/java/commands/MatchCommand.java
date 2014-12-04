package commands;

import entities.*;


public class MatchCommand implements Command{
	
	ContextInterface context;
	String[] values;
	
	public MatchCommand(ContextInterface c,String[] values) {
			context=c;
			this.values=values;
		}
	public void execute(){
		LeagueInterface l=context.getLeague(values[0]);
		String [] matchstats=new String[values.length-1];
		for(int i=0;i<matchstats.length;i++)
			matchstats[i]=values[i+1];
		l.newMatch(matchstats);
	}

}
