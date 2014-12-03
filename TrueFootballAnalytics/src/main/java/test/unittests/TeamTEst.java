package test.unittests;


import entities.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {

    public Team team;
    public String teamName;

    @Before
    public void setUp()
    {
        teamName="Testing Team 1";
        team = new Team(teamName);
    }

    @Test
    public void updateTest()
    {
        team.update(600,2, 47, 5, 2);
        String output = String.format("%-18s%-3d%-3d%-3d%-3d%-3d",teamName,1,1,0,0,3);
        assertEquals(output,team.toString());
    }


}
