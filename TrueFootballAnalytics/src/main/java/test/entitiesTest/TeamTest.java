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
        teamBName = "Testing Team 2";
        teamA = new Team(teamAName);
        teamB = new Team(teamBName);
    }

    /*
    Range of PDO: 400 - 1200
    Range of TSR: Add up to 2 with one decimal point
    Range of  possession: Adds upto 100
    update (PDO,TSR,possession,goalsScored,goalsAgainst)
    update (possession,goalsScored,goalsAgainst)
     */

    @Test
    public void testBasic()
    {
        teamA.update(50,2,1);

        assertEquals(String.format("%-20s%-3d%-3d%-3d%-3d%-7d%+9.3f%+11.3f%s%+11.3f%s", "Testing Team 1", 1, 1, 0, 0, 3, 0.000, 0.000, '%', 0.000, '%'),teamA.toString());
    }

    @Test
    public void testGoalDiffBranch2AndMoreThan6Matches()
    {
        teamA.update(50,1,1);
        teamA.update(20,1,2);
        teamA.update(40,5,5);
        teamA.update(30,5,6);
        teamA.update(70,2,2);
        teamA.update(80,1,1);

    }


}
