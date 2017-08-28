package com.yuanx.dao;

import java.util.List;

import com.yuanx.model.Student;

public interface StudentDao {

	int findAllStudent();

	List<Student> findAll(int startIndex, int pageSize);

}
