package test.entitiesTest;

import entities.Match;
import entities.Team;
import entities.TeamInterface;
import org.junit.Before;
import org.junit.Test;

public class MatchTest {

    private String inputString;
    private TeamInterface teamA;
    private TeamInterface teamB;
    private String values[];

    @Before
    public void setUp()
    {
        inputString="match,Manchester United,Chelsea,1,1,7,9,6,6,48,52";
        String input[] = inputString.split(",");
        String command = input[0];
        values = new String[input.length - 1];
        for(int i=1; i<input.length; i++){
            values[i-1]=input[i];
        }
        teamA = new Team(values[0]);
        teamB = new Team(values[1]);
    }

    @Test
    public void simpleTest()
    {
        Match match = new Match(teamA,teamB,
                Integer.parseInt(values[2]),
                Integer.parseInt(values[3]),
                Integer.parseInt(values[4]),
                Integer.parseInt(values[5]),
                Integer.parseInt(values[6]),
                Integer.parseInt(values[7]),
                Integer.parseInt(values[8]),
                Integer.parseInt(values[9]));

        match.toString();
    }
}
