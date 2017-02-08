package ua.dp.ort.OOP_16;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
  
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
			sp.parse(new File("src/ua/dp/ort/OOP_16/_01_students.xml"), studentsHandler);
		
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintStudentToConsol.printStudentArray(studentsHandler.getStudentArray());
	}
	
}

