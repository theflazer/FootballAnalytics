package io;

import commands.*;
import entities.ContextInterface;


public class EventHandler {
	
	ContextInterface context;
	
	public EventHandler(ContextInterface c){
		context=c;
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
			Invoker.call(new MatchCommand(context,values));
		}
		else if (command.equals("start"))
		{
			Invoker.call(new StartCommand(context,values));
		}
		else if(command.equals("stop"))
		{
			Invoker.call(new StopCommand(context,values));
		}
	}

}