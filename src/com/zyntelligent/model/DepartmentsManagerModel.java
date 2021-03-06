package com.zyntelligent.model;

import java.util.Date;

public class DepartmentsManagerModel {
	private int empNo;
	private int deptNo;
	private Date fromDate;
	private Date toDate;

	public DepartmentsManagerModel(int empNo, int deptNo, Date fromDate, Date toDate) {
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

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
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
		return "DepartmentsManagerModel [empNo=" + empNo + ", deptNo=" + deptNo + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", getEmpNo()=" + getEmpNo() + ", getDeptNo()=" + getDeptNo() + ", getFromDate()="
				+ getFromDate() + ", getToDate()=" + getToDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
