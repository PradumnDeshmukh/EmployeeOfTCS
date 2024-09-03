package com.controller;

import com.Entitye.Employee;
import com.Dao.EmployeeDao;

public class TestEmplioyee {
	public static void main(String[] args) {
		EmployeeDao e1 = new EmployeeDao();
		System.out.println("***********Employee of Id**********");
		System.out.println(e1.EmployeeShowID(6));
		System.out.println("-----*****Show All Employee*****-----------------------------------");
		Employee[] Employee = e1.EmployeeShowAll();

		for (Employee e : Employee) {
			System.out.println(e);
		}
		System.out.println("--Rolle Of Employee-------------------------");

		e1.EmployeeShowRoll("tester");
		System.out.println("********Max And Min Salari************");
		e1.EmployeeShowmaxsal();
		e1.EmployeeShowmMinsal();
		System.out.println("***********Assending Order***********");
		e1.Assending();
		System.out.println("**********DEending order*************");

		e1.desending();
	}

}
