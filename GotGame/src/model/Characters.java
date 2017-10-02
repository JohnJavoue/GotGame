package model;

public class Characters {
	
	/**
	 * Variables
	 */
	
	private String firstName;
	private String surName;
	private String family;
	private int popularity;
	
	/**
	 * Getters and setters
	 */
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	
	/**
	 * Constructors
	 */
	
	public Characters() {
		super();
	}

}
