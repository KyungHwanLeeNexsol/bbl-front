package com.bbl.domain;

public enum StoresInfoDetailsTable {
	GYMINFODETAIL("1"),
	BEAUTYINFODETAIL("3"),
	PLASTICSURGERYDETAIL("4");
	// 2는 뭐였지?

	private String detail;

	StoresInfoDetailsTable(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}
}
