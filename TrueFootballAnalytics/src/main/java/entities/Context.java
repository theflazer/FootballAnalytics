package entities;
import java.util.ArrayList;
import java.util.List;

public class Context implements ContextInterface{
	
	private ArrayList<LeagueInterface> league =new ArrayList<>();

	public void startSeason(String[] input){
		String n=input[0];
		int year=Integer.parseInt(input[1]);
		LeagueInterface l=startLeague(n,year);
	}
	public void stopSeason(String[] input){
		LeagueInterface l=getLeague(input[0]);
		l.stopSeason();
	}

	public LeagueInterface startLeague(String n,int year) {
		for(LeagueInterface l:league)
		{
			if(l.getName().equalsIgnoreCase(n))
				return l;
		}
		LeagueInterface l=new League(n,year);
		league.add(l);
		return l;
	}
	
	public LeagueInterface getLeague(String n) {
		for(LeagueInterface l:league)
		{
			if(l.getName().equalsIgnoreCase(n))
				return l;
		}

		return null;
	}

	
}