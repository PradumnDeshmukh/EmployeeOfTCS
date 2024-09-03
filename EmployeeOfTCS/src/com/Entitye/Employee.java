package com.Entitye;

public class Employee {
	private int id;
	private String name;
	private String roll;
	private int Salari;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String roll, int salari) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.Salari = salari;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getSalari() {
		return Salari;
	}

	public void setSalari(int salari) {
		Salari = salari;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roll=" + roll + ", Salari=" + Salari + "]";
	}

//	public int compareTo(Employee employee) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
