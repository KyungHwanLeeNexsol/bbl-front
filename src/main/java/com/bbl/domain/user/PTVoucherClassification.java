package com.bbl.domain.user;

public enum PTVoucherClassification {
	ONE("1"),
	TEN("2"),
	FIFTY("3");

	private String voucher;

	PTVoucherClassification(String voucher) {
		this.voucher = voucher;
	}

	public String getVoucher() {
		return voucher;
	}
}
