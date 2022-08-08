package com.bbl.domain;

public enum DayClassification {
	WEEKDAY("1"),
	SATURDAY("2"),
	SUNDAY("3"),
	HOLIDAY("4");

	private String day;

	DayClassification(String day) {
		this.day = day;
	}

	public String getDay() {
		return day;
	}


}
