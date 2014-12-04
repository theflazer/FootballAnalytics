package entities;

import java.util.ArrayList;

public interface LeagueInterface {

	public void newMatch(String[] matchstats);

	public void stopSeason();

	public String getName();

	public SeasonInterface getCurrentSeason();

}
