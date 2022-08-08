package com.bbl.domain;

public enum CitizenType {

	KOREAN("1"),
	FOREIGNER("2");

	private String citizen;

	CitizenType(String citizen) {
		this.citizen = citizen;
	}

	public String getCitizen() {
		return citizen;
	}
}
