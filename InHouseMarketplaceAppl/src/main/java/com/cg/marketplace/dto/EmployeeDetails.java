package com.cg.marketplace.dto;

import java.util.List;

import javax.persistence.Column;

import com.cg.marketplace.entities.Proposal;

public class EmployeeDetails {
	private int empId;
	private String empName;
	private String deptName;
	private String location;
	
	public EmployeeDetails() {
		
	}
	public EmployeeDetails(int empId, String empName, String deptName, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.location = location;
		
	
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", location=" + location
				+  "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
