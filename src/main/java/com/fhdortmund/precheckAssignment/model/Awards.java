package com.fhdortmund.precheckAssignment.model;

public class Awards {
	
	private String awardType;
	private int numbeOfAwards;
	
	
	public Awards (String awardType, int numberOfAwards) {
		this.awardType = awardType;
		this.numbeOfAwards = numberOfAwards;
	}
	
	public String getAwardType() {
		return awardType;
	}
	public int getNumbeOfAwards() {
		return numbeOfAwards;
	}
	
	

}
