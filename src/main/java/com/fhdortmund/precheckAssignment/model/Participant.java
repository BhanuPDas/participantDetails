package com.fhdortmund.precheckAssignment.model;

import java.util.List;

public class Participant {
	
	private String name;
	private String surname;
	private int age;
	private String sportType;
	private List<Awards> awards;
	
	public Participant(String name, String surname, int age, String sportType, List<Awards> awards) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sportType = sportType;
		this.awards = awards;
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public String getSportType() {
		return sportType;
	}
	public List<Awards> getAwards() {
		return awards;
	}
}
