package com.bbl.domain;

public enum ApprovalStatusCode {

	APPLIED("1"),
	RECEIVED("2"),
	ONGOINGAPPROVAL("3"),
	HOLD("4"),
	APPROVED("5"),
	DENIED("6"),
	CANCELLED("7");

	private String code;

	ApprovalStatusCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}

