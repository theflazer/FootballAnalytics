package commands;

import entities.League;

public class StartCommand implements Command {

	String [] inputs;
	public StartCommand(String[] inputs){
		this.inputs=inputs;
	}
	
	@Override
	public void execute() {
		League.startSeason(inputs);
	}

}
