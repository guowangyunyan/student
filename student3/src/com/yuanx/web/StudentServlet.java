package com.yuanx.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanx.model.PageBean;
import com.yuanx.model.Student;
import com.yuanx.service.StudentService;
import com.yuanx.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		studentService = new StudentServiceImpl();
	}

	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String option = request.getParameter("option");
		if (option == null || option.equals("")) {
			show(request, response);
		}
	}

	private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		int pageSize = 5;
		PageBean<Student> pb = studentService.findAllStudentWithPage(pageNum, pageSize);
		request.setAttribute("pb", pb);
		request.getRequestDispatcher("students.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
