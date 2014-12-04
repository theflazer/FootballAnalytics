package entities;

import java.util.ArrayList;

public interface ContextInterface {
	
	public void startSeason(String[] input);

	public static void setContext(Context context) {
		/*Context.context = context;
		Context.league= new ArrayList<League>();
		for(League l:context.getLeague()){
			Context.league.add(new League(l));
		}*/
	}
	public LeagueInterface getLeague(String string);

	public void stopSeason(String[] input);

}
