package com.faddi.KaryawanBO.service.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.faddi.KaryawanBO.hibernate.HibernateUtils;
import com.faddi.KaryawanBO.service.dao.PositionDao;
import com.faddi.KaryawanBO.service.model.Position;

public class PositionDaoImpl implements PositionDao {

	public List<Position> getList() {
		Session session = HibernateUtils.session().getCurrentSession();
    	session.beginTransaction();
    	List<Position> getList = session.createQuery("FROM Position").list();
    	session.getTransaction().commit();
    	return getList;
	}
}
