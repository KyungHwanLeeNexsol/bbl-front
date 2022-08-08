package com.bbl.domain.admin;

public enum StoreCategory {
	GYM("1"),
	TRAINER("2"),
	BEAUTY("3"),
	PLASTICSURGERY("4");

	private String category;

	StoreCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

}
