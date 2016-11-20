package ua.dp.ort.OOP_02;

public class Student {
	private String name;
	private String secondName;
	private String surName;
	private int numberGroup;
	final static int numRating = 5; 
	private int[] rating;
	private int grant;
	Student(String sName, String sSecondName, String sSurName, 
			int sNumberGroup, int[] sRating) {
		setName(sName);
		setSecondName(sSecondName);
		setSurName(sSurName);
		setNumberGroup(sNumberGroup);
		setRating(sRating);
		
	}
	public void setName(String sName) {
		name = sName;
	}
	public void setSecondName(String sSecondName) {
		secondName = sSecondName;
	}
	public void setSurName(String sSurName) {
		surName = sSurName;
	}
	public void setNumberGroup(int sNumberGroup) {
		numberGroup = sNumberGroup;
	}
	public void setRating(int[] sRating) {
		rating = sRating;
	}
	public void setGrant(int sGrant) {
		grant = sGrant;
	}
	public String getName() {
		return name;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getSurName() {
		return surName;
	}
	public int getNumberGroup() {
		return numberGroup;
	}
	public int[] getRating() {
		return rating;
	}
	public int getGrant() {
		return grant;
	}
	
}
