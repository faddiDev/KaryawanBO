package com.faddi.KaryawanBO.service.dao;

import java.util.List;

import com.faddi.KaryawanBO.dto.EmployeeDto;
import com.faddi.KaryawanBO.service.model.Employee;
import com.faddi.KaryawanBO.service.model.EmployeeJoin;

public interface EmployeeDao {

	public List<EmployeeJoin> getListForPagination(int page, int limit);
	public EmployeeJoin getById(int id);
	public Employee insert(EmployeeDto employee);
	public Employee update(EmployeeDto employee);
	public Employee delete(EmployeeDto employee);
	
	public Number countAll();
	
}
