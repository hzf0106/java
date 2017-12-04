package com.hzf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Student> stu = new ArrayList<Student>();
		Student[] students = new Student[4];
		students[0] = new Student("wjf", 19, "ÄĞ");
		students[1] = new Student("hzf", 22, "ÄĞ");
		students[2] = new Student("ydt", 21, "Å®");
		students[3] = new Student("qyr", 18, "Å®");
		Arrays.sort(students);
		for(int i = 0; i < students.length; i++) {
			stu.add(students[i]);
		}
		Class1 class1 = new Class1("Èí¼ş1601", stu);
		stu = class1.getStudents();
		for(Student s: stu) {
			System.out.println(s.toString());
		}
	}

}
