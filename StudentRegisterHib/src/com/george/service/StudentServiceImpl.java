package com.george.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.george.dao.StudentDao;
import com.george.entity.Scholar;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao dao;

	public String saveStudent(Scholar student) {
		return dao.saveStudent(student);
		
	}

	public List<Scholar> getStudentList() {
		// TODO Auto-generated method stub
		return dao.getStudentList();
	}

	public Scholar getStudentObjById(Long id) {
		
		return dao.getStudentObjById(id);
	}

	public void deleteStudentObj(Scholar student) {
		dao.deleteStudentObj(student);
		
	}

}
