package com.bbl.domain.user;

public enum CertificationType {

	PASSWORD("10"),
	KAKAO("20"),
	NAVER("30"),
	GOOGLE("40"),
	APPLE("50"),
	FACEBOOK("60")
	;

	private String type;
	CertificationType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
