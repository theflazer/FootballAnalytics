package test.unittests;

import analytics.AnalyticsCentral;
import entities.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnalyticsCentralTest {

    public String teamName;
    public Team team;
    public String teamName2;
    public Team team2;

    @Before
    public void setUp()
    {
        teamName = "Testing from Analytics Central";
        team = new Team(teamName);
        teamName2 = "Testing from Analytics Central 2";
        team2 = new Team(teamName2);
    }

    @Test
    public void testWithOne()
    {
        AnalyticsCentral analyticsCentral = new AnalyticsCentral();
        analyticsCentral.updateLeagueAvgs(team,5,10,5,2,49);
//        System.out.println(analyticsCentral.getLeagueAvgPDO());
//        System.out.println(analyticsCentral.getAverageCounter());
//        System.out.println(analyticsCentral.getLeagueAvgTSR());
        double resultAverage = Math.round(analyticsCentral.getAverageCounter() * 100.0) / 100.0;
        double resultTSR = Math.round(analyticsCentral.getLeagueAvgTSR() * 100.0) / 100.0;
        double resultPDO = Math.round(analyticsCentral.getLeagueAvgPDO() * 100.0) / 100.0;
        assertEquals(resultPDO,900.0,0.1);
        assertEquals(resultAverage,0.0,0.1);
        assertEquals(resultTSR,1.42,0.1);

    }

    @Test
    public void testWithTwo()
    {
        AnalyticsCentral analyticsCentral = new AnalyticsCentral();
        analyticsCentral.updateLeagueAvgs(team,5,10,5,2,49);
        analyticsCentral.updateLeagueAvgs(team2,3,9,2,4,22);
//        System.out.println(analyticsCentral.getLeagueAvgPDO());
//        System.out.println(analyticsCentral.getAverageCounter());
//        System.out.println(analyticsCentral.getLeagueAvgTSR());
        double resultAverage = Math.round(analyticsCentral.getAverageCounter() * 100.0) / 100.0;
        double resultTSR = Math.round(analyticsCentral.getLeagueAvgTSR() * 100.0) / 100.0;
        double resultPDO = Math.round(analyticsCentral.getLeagueAvgPDO() * 100.0) / 100.0;
        assertEquals(resultPDO,2333.33,0.1);
        assertEquals(resultAverage,0.0,0.1);
        assertEquals(resultTSR,1.5,0.1);
    }

}
