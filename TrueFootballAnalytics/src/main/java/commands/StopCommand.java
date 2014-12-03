package commands;

import analytics.PredictiveAnalysis;
import entities.League;

public class StopCommand implements Command{

	String[] inputs;
	public StopCommand(String[] inputs){
		this.inputs=inputs;
	}
	@Override
	public void execute() {
		PredictiveAnalysis.printAnalyticTable(League.getCurrentSeason().getTeamList());
		League.stopSeason();
	}

}
