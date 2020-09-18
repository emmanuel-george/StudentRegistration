package com.george.service;

import java.util.List;

import com.george.entity.Scholar;


public interface StudentService {

	String saveStudent(Scholar student);

	List<Scholar> getStudentList();

	Scholar getStudentObjById(Long id);

	void deleteStudentObj(Scholar student);

}
