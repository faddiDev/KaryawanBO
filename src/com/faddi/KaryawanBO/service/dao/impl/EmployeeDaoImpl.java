package com.faddi.KaryawanBO.service.dao.impl;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.el.parser.ParseException;
import org.hibernate.Session;

import com.faddi.KaryawanBO.dto.EmployeeDto;
import com.faddi.KaryawanBO.hibernate.HibernateUtils;
import com.faddi.KaryawanBO.service.dao.EmployeeDao;
import com.faddi.KaryawanBO.service.model.Employee;
import com.faddi.KaryawanBO.service.model.EmployeeJoin;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<EmployeeJoin> getListForPagination(int page, int limit) {
		Session session = HibernateUtils.session().getCurrentSession();
    	session.beginTransaction();
    	List<EmployeeJoin> getListForPagination = session.createQuery("FROM EmployeeJoin e WHERE e.isDelete=0")
    			.setFirstResult(calculateOffset(page, limit))
    			.setMaxResults(limit)
    			.list();
    	session.getTransaction().commit();
    	return getListForPagination;
	}
	
	private int calculateOffset(int page, int limit) {
		return ((limit*page) - limit);
	}
	
	public EmployeeJoin getById(int id) {
		Session session = HibernateUtils.session().getCurrentSession();
    	session.beginTransaction();
    	EmployeeJoin getById = (EmployeeJoin) session.createQuery("FROM EmployeeJoin e WHERE e.id=:id").setParameter("id", id).uniqueResult();
    	session.getTransaction().commit();
    	return getById;
	}
	
	public Employee getByIdCustom(int id) {
		Session session = HibernateUtils.session().getCurrentSession();
    	session.beginTransaction();
    	Employee getById = (Employee) session.createQuery("FROM Employee e WHERE e.id=:id").setParameter("id", id).uniqueResult();
    	session.getTransaction().commit();
    	return getById;
	}
	
	public Employee insert(EmployeeDto employee) {
		Session session = HibernateUtils.session().getCurrentSession();
    	session.beginTransaction();
    	Employee e = new Employee();
		try {
	    	Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(employee.getBirthDate());
			e.setName(employee.getName());
			e.setBirthDate(birthDate);
			e.setPositionId(employee.getPositionId());
			e.setIdNumber(employee.getIdNumber());
			e.setGender(employee.getGender());
			e.setIsDelete(employee.getIsDelete());
		} catch(Exception ex) {
			System.out.println("Error " + ex.getMessage());
		}
		session.save(e);
		session.getTransaction().commit();
		return e;
	}
	
	public Employee update(EmployeeDto employee) {
		Session session = HibernateUtils.session().openSession();
    	session.beginTransaction();
		Employee e = this.getByIdCustom(employee.getId());
		try {
			Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(employee.getBirthDate());
			e.setName(employee.getName());
			e.setBirthDate(birthDate);
			e.setPositionId(employee.getPositionId());
			e.setIdNumber(employee.getIdNumber());
			e.setGender(employee.getGender());
		} catch(Exception ex) {
			System.out.println("Error " + ex.getMessage());
		}
		session.update(e);
		session.getTransaction().commit();
		return e;
	}
	
	public Employee delete(EmployeeDto employee) {
		Session session = HibernateUtils.session().openSession();
    	session.beginTransaction();
		Employee e = this.getByIdCustom(employee.getId());
		e.setIsDelete(employee.getIsDelete());
		session.update(e);
		session.getTransaction().commit();
		return e;
	}
	
}
