package unittests;

import entities.League;
import entities.Season;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeagueTest {

    private String startCommand;
    private Season season;

    @Before
    public void setUp()
    {
        startCommand = "start,2012";
    }


    @Test
    public void testNewSeason()
    {
        String input[] = startCommand.split(",");
        String command = input[0];
        String values[] = new String[input.length - 1];
        for(int i=1; i<input.length; i++){
            values[i-1]=input[i];
        }

        League.startSeason(values);
        season = League.getCurrentSeason();
        assertEquals(season.getYear(),2012);

    }

}
