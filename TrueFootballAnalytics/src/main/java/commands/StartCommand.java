package commands;

import entities.ContextInterface;
import entities.League;

public class StartCommand implements Command {

	ContextInterface context;
	String[] inputs;
	
	public StartCommand(ContextInterface c, String[] inputs){
		context=c;
		this.inputs=inputs;
	}
	@Override
	public void execute() {
		context.startSeason(inputs);
	}

}
