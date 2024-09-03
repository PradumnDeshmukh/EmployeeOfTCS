package com.Dao;

//import java.util.Arrays;
//import java.util.Comparator;

import com.Entitye.Employee;

public class EmployeeDao {

	Employee e1 = new Employee(1, "pavan Kumar", "maneger", 59444);
	Employee e2 = new Employee(4, "krushna pawar", "Hr", 8786);
	Employee e3 = new Employee(3, "Rohit sharma", "Tester", 46545);
	Employee e4 = new Employee(5, "amit patil", "maneger", 98076);
	Employee e5 = new Employee(6, "Devener sing", "Automation", 54643);
	Employee e6 = new Employee(2, "gill solanke", "Hr", 56565656);
	Employee e7 = new Employee(26, "pratik kadam", "Tester", 232234);
	Employee e8 = new Employee(65, "ram solanke", "maneger", 89697);
	Employee e9 = new Employee(63, "om kshirsagar", "HR", 75875);
	Employee e10 = new Employee(89, "gaurav c", "tester", 67666);

	Employee[] Emp = new Employee[10];
	// private com.Entitye.Employee Employee;

	public Employee EmployeeShowID(int id) {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		int index = id - 1;
		return Emp[index];
	}

	public Employee[] EmployeeShowAll() {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		return Emp;

	}

	public void EmployeeShowRoll(String role) {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;

		for (Employee employee : Emp) {
			if (employee.getRoll().equalsIgnoreCase(role)) {
				System.out.println(employee);

			}

		}
		System.out.println("-----------------------------------------------");
	}

	public void EmployeeShowmaxsal() {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		// Employee a=Emp [0];
		Employee max = Emp[0];
		for (Employee e : Emp) {
			if (e.getSalari() > max.getId()) {
				max = e;
				// a=e;
			}
			// System.out.println(a);

		}
		System.out.println("max Salari of" + max.getSalari());
	}

	public void EmployeeShowmMinsal() {

		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Emp[9] = e10;
		Employee min = Emp[0];
		for (Employee t : Emp) {
			if (t.getSalari() < min.getSalari()) {
				min = t;
			}

		}
		System.out.println("min salari of :" + min.getSalari());
	}

	public Employee Assending() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Employee temp = Emp[0];

		for (int i = 0; i < Emp.length; ++i) {
			for (int j = i + 1; j < Emp.length; j++) {
				if (Emp[i].getId() > Emp[j].getId()) {

					temp = Emp[i];
					Emp[i] = Emp[j];
					Emp[j] = temp;
				}
			}
		}

		for (Employee employee : Emp) {
			System.out.println(employee);

		}
		return temp;
	}

	public Employee desending() {
		Emp[0] = e1;
		Emp[1] = e2;
		Emp[2] = e3;
		Emp[3] = e4;
		Emp[4] = e5;
		Emp[5] = e6;
		Emp[6] = e7;
		Emp[7] = e8;
		Emp[8] = e9;
		Employee temp = Emp[0];

		for (int i = 0; i < Emp.length; ++i) {
			for (int j = i + 1; j < Emp.length; j++) {
				if (Emp[i].getId() < Emp[j].getId()) {

					temp = Emp[i];
					Emp[i] = Emp[j];
					Emp[j] = temp;
				}
			}
		}

		for (Employee employee : Emp) {
			System.out.println(employee);
		}
		return temp;
	}
}