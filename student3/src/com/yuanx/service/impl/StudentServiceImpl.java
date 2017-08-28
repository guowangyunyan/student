package com.yuanx.service.impl;

import com.yuanx.dao.StudentDao;
import com.yuanx.dao.impl.StudentDaoImpl;
import com.yuanx.model.PageBean;
import com.yuanx.model.Student;
import com.yuanx.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public StudentServiceImpl() {
		studentDao = new StudentDaoImpl();
	}

	@Override
	public PageBean<Student> findAllStudentWithPage(int pageNum, int pageSize) {
		int totalRecord = studentDao.findAllStudent();
		PageBean<Student> pb = new PageBean<Student>(pageNum, pageSize, totalRecord);
		int startIndex = pb.getStartIndex();
		pb.setList(studentDao.findAll(startIndex, pageSize));
		return pb;
	}

}
