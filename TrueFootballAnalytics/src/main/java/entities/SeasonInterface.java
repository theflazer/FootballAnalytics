package entities;

import java.util.ArrayList;

public interface SeasonInterface {

	public void archive();

	public void newMatch(String[] matchstats);

	public ArrayList<TeamInterface> getTeamList();

	public double getLeagueAvgTSR();

	public double getLeagueAvgPDO();

}
