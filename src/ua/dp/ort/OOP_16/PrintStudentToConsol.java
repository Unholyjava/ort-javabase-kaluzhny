package ua.dp.ort.OOP_16;

import java.util.List;

/**
 * This class with one method print parse data to console
 * @author Kaluzhniy
 *
 */
public class PrintStudentToConsol {
	
	/**
	 * Method print parse data to console
	 * @param arrayStudents - list of students from XML-file
	 */
	public static void printStudentArray(List<Student> arrayStudents) {
		for(Student student : arrayStudents) {
			System.out.println(student.toString());
		}
	}
}
