import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.Context;
import entities.ContextInterface;
import io.EventHandler;


public class Main {

	public static void main(String[] args) throws IOException, JAXBException {
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		ContextInterface c =new Context();
//		ContextInterface.setContext(c);
		EventHandler e = new EventHandler(c);
		while ((line = br.readLine()) != null) {
		   e.process(line);
		}
		br.close();
	}

}
