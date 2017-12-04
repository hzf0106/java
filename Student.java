package com.hzf;

public class Student implements Comparable{
	private String name;
	private int age;
	private String sex;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int compareTo(Object o) {
		int i = 0;
		Student stu = (Student)o;
		i = name.compareTo(stu.name);
		if(i == 0) {
			return age - stu.age;
		}
		else {
			return i;
		}
	}
}
