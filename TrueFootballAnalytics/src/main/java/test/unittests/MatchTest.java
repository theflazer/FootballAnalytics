package test.unittests;

import entities.League;
import entities.Match;
import entities.Team;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchTest {

    private static String match;
    private String[] values;
    private Team hTeam;
    private Team aTeam;
    private int hGoals, aGoals,hShots,aShots,hSaves,aSaves,hP,aP;
    private String matchString;

    @BeforeClass
    public static void startSeason()
    {
        String yearIn[] = new String[1];
        yearIn[0]="2012";
        League.startSeason(yearIn);

    }

    @Before
    public void setUp()
    {
        matchString="";
        match= "match,Manchester United,Tottenham Hotspur,1,2,9,5,2,7,60,40";
        String input[] = match.split(",");

        values = new String[input.length - 1];
        for(int i=1; i<input.length; i++){
            values[i-1]=input[i];
        }

        hTeam = new Team(values[0]);
        aTeam = new Team(values[1]);
        hGoals = Integer.parseInt(values[2]);
        aGoals = Integer.parseInt(values[3]);
        hShots = Integer.parseInt(values[4]);
        aShots = Integer.parseInt(values[5]);
        hSaves = Integer.parseInt(values[6]);
        aSaves = Integer.parseInt(values[7]);
        hP = Integer.parseInt(values[8]);
        aP = Integer.parseInt(values[9]);
    }

    @Test
    public void addMatch()
    {

        Match matchObject = new Match(hTeam,aTeam,hGoals,aGoals,hShots,aShots,hSaves,aSaves,hP,aP);
        String output = "";
        for (int i=0;i<=9;i++)
        {
            if (i!=9)
                matchString=matchString+values[i]+" ";
            else
                matchString=matchString+values[i];
        }
        assertEquals(matchString,matchObject.toString());
    }
}
