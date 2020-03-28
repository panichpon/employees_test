package com.zyntelligent.model.view;

import java.util.Date;

public class CurrentDeptEmpViewModel {
	private int empNo;
	private char deptNo;
	private Date fromDate;
	private Date toDate;

	public CurrentDeptEmpViewModel(int empNo, char deptNo, Date fromDate, Date toDate) {
		super();
		this.empNo = empNo;
		this.deptNo = deptNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public char getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(char deptNo) {
		this.deptNo = deptNo;
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
		return "CurrentDeptEmpViewModel [empNo=" + empNo + ", deptNo=" + deptNo + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", getEmpNo()=" + getEmpNo() + ", getDeptNo()=" + getDeptNo() + ", getFromDate()="
				+ getFromDate() + ", getToDate()=" + getToDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
