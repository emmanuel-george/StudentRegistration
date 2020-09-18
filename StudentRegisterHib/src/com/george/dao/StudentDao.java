package com.george.dao;

import java.util.List;

import com.george.entity.Scholar;


public interface StudentDao {

	String saveStudent(Scholar student);

	List<Scholar> getStudentList();

	Scholar getStudentObjById(Long id);

	void deleteStudentObj(Scholar student);

}
