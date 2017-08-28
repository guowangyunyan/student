package com.yuanx.service;

import com.yuanx.model.PageBean;
import com.yuanx.model.Student;

public interface StudentService {

	PageBean<Student> findAllStudentWithPage(int pageNum, int pageSize);

}
