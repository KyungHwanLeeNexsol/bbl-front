package com.bbl.domain;

public enum IdType {

	USER("1"),
	STORE("2"),
	TRAINER("3"),
	BBL_MANAGER("4");

	private String type;

	IdType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
