package com.csdj.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class Employee {

	private int empNo;
	
	private String empName;
	
	private int empSex;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hireDate;
	
	private int sal;
	
	private int deptNo;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSex() {
		return empSex;
	}

	public void setEmpSex(int empSex) {
		this.empSex = empSex;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
	
}
