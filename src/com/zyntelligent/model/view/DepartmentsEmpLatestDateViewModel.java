package com.zyntelligent.model.view;

import java.util.Date;

public class DepartmentsEmpLatestDateViewModel {
	private int empNo;
	private Date fromDate;
	private Date toDate;

	public DepartmentsEmpLatestDateViewModel(int empNo, Date fromDate, Date toDate) {
		super();
		this.empNo = empNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
		return "DepartmentsEmpLatestDateViewModel [empNo=" + empNo + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", getEmpNo()=" + getEmpNo() + ", getFromDate()=" + getFromDate() + ", getToDate()=" + getToDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
