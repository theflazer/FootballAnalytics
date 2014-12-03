package io;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import entities.Team;

public class Printer {
	public Printer(){
	}

	public static void PrintToFile(List<Team> teamList, String fileName) {
		// TODO Auto-generated method stub
		try{
		PrintWriter out = new PrintWriter(fileName+".txt", "UTF-8");
		for ( Team t : teamList){
			out.println(t.toString());
		}
		out.close();
		}catch(Exception e){
			System.out.print("Error in saving file");
		}	
		
	}
	

}