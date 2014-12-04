package test;

import commands.Command;
import commands.MatchCommand;
import commands.StartCommand;
import entities.League;
import entities.Season;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class CommandTest {

    private static ArrayList<String> commandLines;

    @BeforeClass
    public static void setUp() {
        commandLines = new ArrayList<String>();
        commandLines.add("start,2012");
        commandLines.add("match,Manchester United,Chelsea,1,1,7,9,6,6,48,52");
        commandLines.add("stop");
    }

    @Test
    public void testStartCommand()
    {
        //Simulating EventHandler Actions
        String input[] = commandLines.get(0).split(",");
        String commandString = input[0];
        String values[] = new String[input.length - 1];
        for(int i=1; i<input.length; i++){
            values[i-1]=input[i];
        }

//        Command command= new StartCommand(values);
//        command.execute();
//        Season season = League.getCurrentSeason();
//        assertEquals(season.getYear(),2012);
    }

    @Test
    public void testMatchCommand_Branch1()
    {
        String input[] = commandLines.get(1).split(",");
        String commandString = input[0];
        String values[] = new String[input.length - 1];
        for(int i=1; i<input.length; i++){
            values[i-1]=input[i];
        }

//        Command command = new MatchCommand(values);
//        command.execute();
//        Season season = League.getCurrentSeason();


    }
}
