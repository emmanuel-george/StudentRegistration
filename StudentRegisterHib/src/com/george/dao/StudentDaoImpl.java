package com.george.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.george.entity.Scholar;



@Repository
public class StudentDaoImpl implements StudentDao {
    
	@Autowired
	SessionFactory factory;
	public String saveStudent(Scholar student) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(student);
		
		tx.commit();
		session.close();
		return "Success";
		
	}
	public List<Scholar> getStudentList() {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		List<Scholar> scholars=session.createQuery("from Scholar").getResultList();
		
		tx.commit();
		session.close();
		
		return scholars;
	}
	public Scholar getStudentObjById(Long id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	    Scholar student= session.get(Scholar.class, id);
	    tx.commit();
	    session.close();
	    return student;
		
	}
	public void deleteStudentObj(Scholar student) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	    //Scholar student= session.get(Scholar.class, id);
	    session.delete(student);
	    tx.commit();
	    session.close();
		
	}

}
