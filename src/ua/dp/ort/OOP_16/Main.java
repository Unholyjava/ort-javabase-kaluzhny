package ua.dp.ort.OOP_16;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

import ua.dp.ort.OOP_19_Adv_Ep3_1.ReadWriteFileCalculator;
  
/**
 * This class run SAXParser, which is read and parse data from XML-file,
 * then run method to print parse data.
 * Class catch follow exception:
 * - ParserConfigurationException;
 * - SAXException;
 * - IOException.
 * @author Kaluzhniy
 *
 */
public class Main {
	public static void main(String[] args) {
		StudentsHandler studentsHandler = new StudentsHandler();
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {
			SAXParser sp = spf.newSAXParser();
			sp.parse(new File
				(Main.class.getResource("_01_students.xml").toURI()), studentsHandler);
		
		} catch (ParserConfigurationException | URISyntaxException e) {
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		} 
		PrintStudentToConsol.printStudentArray(studentsHandler.getStudentArray());
	}
	
}

