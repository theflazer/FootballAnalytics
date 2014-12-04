package io;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

import entities.Team;
import entities.TeamInterface;

public class Printer {
	public Printer(){
	}

	public static void PrintToFile(List<TeamInterface> teamList, String fileName) {
		// TODO Auto-generated method stub
		try{
		PrintWriter out = new PrintWriter(fileName+".txt", "UTF-8");
		out.println(String.format("%-20s%-3s%-3s%-3s%-3s%-5s%-20s%-12s%s", "Team", "P", "W", "L", "D", "PTS", "Predication", "PDO", "TSR"));
		out.println(new String(new char[72]).replace("\0", "*"));
		for ( TeamInterface t : teamList){
			out.println(t.toString());
		}
		out.close();
		}catch(Exception e){
			System.out.print("Error in saving file");
		}	
		
	}
	
	public static void PrintToConsole(List<TeamInterface> teamList, String fileName) {
		// TODO Auto-generated method stub
		try{
		System.out.println(String.format("%-20s%-3s%-3s%-3s%-3s%-5s%-20s%-12s%s", "Team", "P", "W", "L", "D", "PTS", "Predication", "PDO", "TSR"));
		System.out.println(new String(new char[72]).replace("\0", "*"));
		for ( TeamInterface t : teamList){
			System.out.println(t.toString());
		}
		System.out.close();
		}catch(Exception e){
			System.out.print("Error printing");
		}	
		
	}
	

}