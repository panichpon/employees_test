package com.zyntelligent.model;

import java.util.Date;

public class EmployeesModel {

	private int empNo;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String genger;
	private Date hireDate;
	
	public EmployeesModel(int empNo, Date birthDate, String firstName, String lastName, String genger, Date hireDate) {
		super();
		this.empNo = empNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.genger = genger;
		this.hireDate = hireDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGenger() {
		return genger;
	}

	public void setGenger(String genger) {
		this.genger = genger;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeesModel [empNo=" + empNo + ", birthDate=" + birthDate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", genger=" + genger + ", hireDate=" + hireDate + ", getEmpNo()="
				+ getEmpNo() + ", getBirthDate()=" + getBirthDate() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getGenger()=" + getGenger() + ", getHireDate()="
				+ getHireDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
