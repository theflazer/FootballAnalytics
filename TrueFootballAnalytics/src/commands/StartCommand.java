package commands;

import entities.League;

public class StartCommand implements Command {

	@Override
	public void process(String[] input) {
		League.startSeason(Integer.parseInt(input[0]));
	}

}
