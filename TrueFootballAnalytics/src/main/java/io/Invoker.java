package io;

import commands.Command;

public class Invoker {
	
	public static void call(Command c){
		c.execute();
	}
}