package test.unittests;

import entities.League;
import entities.Match;
import entities.Season;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SeasonTest {

    private static Season season;
    private static String matchString;
    private static String[] matchStats;


    @BeforeClass
    public static void setUp()
    {
        String[] startCommand = new String[1];
        startCommand[0]="2012";
        League.startSeason(startCommand);
        season = League.getCurrentSeason();
        matchStats = new String[10];
        matchString = "";
    }

    @Before
    public void getLatestSeason()
    {
        season=League.getCurrentSeason();
    }

    @Test
    public void testFirstMatchCreation()
    {

        matchString="";
        matchStats[0] = "Manchester United";
        matchStats[1] = "Chelsea";
        matchStats[2] = "1";
        matchStats[3] = "1";
        matchStats[4] = "7";
        matchStats[5] = "9";
        matchStats[6] = "6";
        matchStats[7] = "6";
        matchStats[8] = "48";
        matchStats[9] = "52";

        for (int i=0;i<=9;i++)
        {
            if (i!=9)
                matchString=matchString+matchStats[i]+" ";
            else
                matchString=matchString+matchStats[i];
        }

        season.newMatch(matchStats);

        ArrayList<String> matches= new ArrayList<String>();
        for (Match match:season.getMatchList())
            matches.add(match.toString());

        assertEquals(matches.contains(matchString),true);
    }

    @Test
    public void testCreateAnotherSimilarMatch()
    {
        matchString="";
        matchStats[0] = "Manchester United";
        matchStats[1] = "Liverpool";
        matchStats[2] = "2";
        matchStats[3] = "1";
        matchStats[4] = "11";
        matchStats[5] = "6";
        matchStats[6] = "4";
        matchStats[7] = "6";
        matchStats[8] = "58";
        matchStats[9] = "42";
        for (int i=0;i<=9;i++)
        {
            if (i!=9)
                matchString=matchString+matchStats[i]+" ";
            else
                matchString=matchString+matchStats[i];
        }

        season.newMatch(matchStats);
        ArrayList<String> matches= new ArrayList<String>();
        for (Match match:season.getMatchList())
            matches.add(match.toString());

        assertEquals(matches.contains(matchString),true);

    }

}
