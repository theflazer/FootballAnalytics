package commands;

import entities.League;

public class StopCommand implements Command{

	@Override
	public void process(String[] input) {
		League.stopSeason();
	}

}
