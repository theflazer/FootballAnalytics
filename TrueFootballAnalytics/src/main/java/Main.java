

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import io.EventHandler;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EventHandler e = EventHandler.getEventHandler();
		File file = new File("input_file_TFA.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
		   e.process(line);
		}
		br.close();
	}

}
