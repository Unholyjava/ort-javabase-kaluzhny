package ua.dp.ort.OOP_16;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * This class has user's settings for XML SAXparser.
 * Class StudentsHandler extends class DefaultHandler 
 * and override some methods of class DefaultHandler.
 * This class save information about element of XML-file in fields,
 * and direct result (list of students) save in field _studentArray.
 * @author Kaluzhniy
 *
 */
public class StudentsHandler extends DefaultHandler{
	private List<Student> _studentArray = new ArrayList<>();
	private Student _studentTemp;
	private Address _adressTemp;
	private String _nameElement;
	private Attributes _attributes;
			
	
	@Override
	/**
	 * Method startDocument receive notification 
	 * of the beginning of the document.
	 * Method throws SAXException
	 */
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("Start parsing");
	}
		
	@Override
	/**
	 * Method endDocument receive notification 
	 * of the end of the document.
	 * Method throws SAXException
	 */
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("End parsing");
	}

	@Override
	/**
	 * Method startElement receive notification 
	 * of the start of an element, 
	 * set element name and element attributes in corresponding fields. 
	 */
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		super.startElement(arg0, arg1, arg2, arg3);
		
		setNameElement(arg2);
		setAttributes(arg3);
	}
	
	@Override
	/**
	 * Method endElement receive notification 
	 * of the end of an element, set element name as empty string.
	 */
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		
		setNameElement("");
	}

	@Override
	/**
	 * Method characters receive notification 
	 * of character data inside an element,
	 * has user's settings for correctly parser from XML-file.
	 * Element names and attributes are save in corresponding fields,
	 * direct result (list of students) save in field _studentArray.
	 */
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
				
		if (getNameElement().equals("student")) {
			setStudentTemp(new Student());
			getStudentTemp().setLogin(getAttributes().getValue("login"));
			getStudentTemp().setFaculty(getAttributes().getValue("faculty"));
			//System.out.println(getStudentTemp().getLogin());
			//System.out.println(getStudentTemp().getFaculty());
		}
		
		if (getNameElement().equals("name")) {
			getStudentTemp().setName(new String (ch, start, length));
			//System.out.println(getStudentTemp().getName());
		}
		if (getNameElement().equals("phone")) {
			getStudentTemp().setPhone(Long.valueOf(new String (ch, start, length)));
			//System.out.println(getStudentTemp().getPhone());
		}
		
		if (getNameElement().equals("country")) {
			setAdressTemp(new Address());
			getAdressTemp().setCountry(new String (ch, start, length));
			//System.out.println(getAdressTemp().getCountry());
		}
		if (getNameElement().equals("city")) {
			getAdressTemp().setCity(new String (ch, start, length));
			//System.out.println(getAdressTemp().getCity());
		}
		if (getNameElement().equals("street")) {
			getAdressTemp().setStreet(new String (ch, start, length));
			//System.out.println(getAdressTemp().getStreet());
			getStudentTemp().setAddress(getAdressTemp());
			getStudentArray().add(getStudentTemp());
		}
		
	}
	
	
	private String getNameElement() {
		return _nameElement;
	}

	
	private void setNameElement(String nameElement) {
		_nameElement = nameElement;
	}

	
	private Attributes getAttributes() {
		return _attributes;
	}

	
	private void setAttributes(Attributes attributes) {
		_attributes = attributes;
	}

	private Student getStudentTemp() {
		return _studentTemp;
	}

	private void setStudentTemp(Student studentTemp) {
		_studentTemp = studentTemp;
	}

	
	private Address getAdressTemp() {
		return _adressTemp;
	}

	
	private void setAdressTemp(Address adressTemp) {
		_adressTemp = adressTemp;
	}

	/**
	 * Getter-method for return list of students - parsing result 
	 * @return studentArray
	 */
	public List<Student> getStudentArray() {
		return _studentArray;
	}
	
}

