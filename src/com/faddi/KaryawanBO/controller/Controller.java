package com.faddi.KaryawanBO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.faddi.KaryawanBO.dto.EmployeeDto;
import com.faddi.KaryawanBO.service.dao.EmployeeDao;
import com.faddi.KaryawanBO.service.dao.PositionDao;
import com.faddi.KaryawanBO.service.model.Employee;
import com.faddi.KaryawanBO.service.model.EmployeeJoin;
import com.faddi.KaryawanBO.service.model.Position;

@CrossOrigin(origins="*")
@RestController
public class Controller {

	@Autowired
	PositionDao positionDao;
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/karyawanindex")
	@ResponseBody
	private List<EmployeeJoin> karyawanindex() {
		List<EmployeeJoin> e = employeeDao.getListForPagination(0, 5);
		return e;
	}
	
	@RequestMapping("/position")
	@ResponseBody
	private List<Position> position() {
		List<Position> list = positionDao.getList();
		return list;
	}
	
	@RequestMapping("/employee/{id}")
	@ResponseBody
	private EmployeeJoin employee(@PathVariable("id") int id) {
		EmployeeJoin e = employeeDao.getById(id);
		return e;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private Employee insert(@RequestBody EmployeeDto employee) {
		Employee e = employeeDao.insert(employee);
		return e; 
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	private Employee update(@RequestBody EmployeeDto employee) {
		Employee e = employeeDao.update(employee);
		return e; 
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	private Employee delete(@RequestBody EmployeeDto employee) {
		Employee e = employeeDao.delete(employee);
		return e; 
	}
}
