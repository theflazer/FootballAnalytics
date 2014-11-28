package io;

import commands.*;


public class EventHandler {
private static EventHandler eventHandler = new EventHandler();
private Command c;
	
	private EventHandler(){
	}
	
	public static EventHandler getEventHandler(){
		return eventHandler;
	}
	
	public void process(String line){
		String input[] = line.split(",");
		String command = input[0];
		String values[] = new String[input.length - 1];
		for(int i=1; i<input.length; i++){
			values[i-1]=input[i];
		}
		if (command.equals("match"))
		{
			c = new MatchCommand();
			c.process(values);
		}
		else if (command.equals("start"))
		{
			c = new StartCommand();
			c.process(values);
		}
		else if(command.equals("stop"))
		{
			c = new StopCommand();
			c.process(values);
		}
	}

}
