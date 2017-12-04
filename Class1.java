package com.hzf;

import java.util.List;

public class Class1 {
	private String name;
	private List<Student> students;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Class1(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Class1 [name=" + name + ", students=" + students + "]";
	}
	public Class1() {
		super();
	}


}
