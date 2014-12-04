package commands;

import analytics.PredictiveAnalysis;
import entities.ContextInterface;
import entities.League;

public class StopCommand implements Command{

	String[] input;
	ContextInterface context;
	
	public StopCommand(ContextInterface c, String[] values) {
		input=values;
		context=c;
	}

	@Override
	public void execute() {
		PredictiveAnalysis.generateAnalyticTable(context.getLeague(input[0]).getCurrentSeason());
		context.stopSeason(input);
	}

}
