package com.zyntelligent.model;

import java.util.Date;

public class TitlesModel {
	private int empNo;
	private String title;
	private Date fromDate;
	private Date toDate;

	public TitlesModel(int empNo, String title, Date fromDate, Date toDate) {
		super();
		this.empNo = empNo;
		this.title = title;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "SalariesModel [empNo=" + empNo + ", title=" + title + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", getEmpNo()=" + getEmpNo() + ", getTitle()=" + getTitle() + ", getFromDate()=" + getFromDate()
				+ ", getToDate()=" + getToDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
