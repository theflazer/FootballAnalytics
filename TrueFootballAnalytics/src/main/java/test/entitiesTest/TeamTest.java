package test.entitiesTest;

import entities.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    private String teamAName;
    private String teamBName;
    private Team teamA;
    private Team teamB;

    @Before
    public void setUp()
    {
        teamAName = "Testing Team 1";
        teamA = new Team(teamAName);
        teamA.update(50,2,1);

    }

    /*
    Range of PDO: 400 - 1200
    Range of TSR: Add up to 2 with one decimal point
    Range of  possession: Adds upto 100

    update (possession,goalsScored,goalsAgainst)
     */

    @Test
    public void testBasic()
    {

        assertEquals(String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", "Testing Team 1", 1, 1, 0, 0, 3, 0.000, 0.000, '%', 0.000, '%'),teamA.toString());
    }

    @Test
    public void testGoalDiffBranch2AndMoreThan6Matches()
    {

        teamA.update(20,1,2);
        teamA.update(40,5,5);
        teamA.update(30,5,6);
        teamA.update(70,2,2);
        teamA.update(80,1,1);
        assertEquals(String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", "Testing Team 1", 6, 1, 2, 3, 6, 0.000, 0.000, '%', 0.000, '%'),teamA.toString());

    }

    @Test
    public void testSettersAndUpdates()
    {

        teamA.setPDO(500);
        teamA.setTSR(1.5);
        teamA.setIndicative(10.0);
        assertEquals(String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", "Testing Team 1", 1, 1, 0, 0, 3, 10.000, 500.000, '%', 1.500, '%'), teamA.toString());
    }

    @Test
    public void testUpdaters()
    {
        teamA.updatePDO(600);
        teamA.updatepossesion(60);
        teamA.updateTableStats(1.0,2.0);
        teamA.updateTSR(1.0);
        assertEquals(String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", "Testing Team 1", 1, 1, 1, 0, 3, 0.000, 300.000, '%', 0.500, '%'),teamA.toString());


    }


}
