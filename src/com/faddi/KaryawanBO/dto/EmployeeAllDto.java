package com.faddi.KaryawanBO.dto;

import java.io.Serializable;
import java.util.List;

import com.faddi.KaryawanBO.service.model.EmployeeJoin;

public class EmployeeAllDto implements Serializable {

	private static final long serialVersionUID = 2256994432208926628L;
	
	List<EmployeeJoin> employeeDto;
	private int page;
	private Number count;
	
	public List<EmployeeJoin> getEmployeeDto() {
		return employeeDto;
	}
	public void setEmployeeDto(List<EmployeeJoin> employeeDto) {
		this.employeeDto = employeeDto;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Number getCount() {
		return count;
	}
	public void setCount(Number count) {
		this.count = count;
	}
}
