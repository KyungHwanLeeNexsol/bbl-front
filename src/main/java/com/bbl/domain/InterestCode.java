package com.bbl.domain;

public enum InterestCode {

	GYM("1"),
	BEAUTY("2"),
	PLASTICSURGERY("3"),
	TRAVEL("4");

	private String code;

	InterestCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}


}
