package com.zyntelligent.model;

public class DepartmentsModel {
	private char deptNo;
	private String deptName;

	public DepartmentsModel(char deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(char deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentsModel [deptNo=" + deptNo + ", deptName=" + deptName + ", getDeptNo()=" + getDeptNo()
				+ ", getDeptName()=" + getDeptName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
