package com.hzf;

import java.util.Scanner;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] students = new Student[5];
		Class1 class1 = new Class1();
		System.out.println("������༶��");
		String className = input.nextLine();
		class1.setName(className);
		System.out.println("���������ѧ������Ϣ��");
		for(int i = 0; i < 5; i++) {
			System.out.println("�������"+(i+1)+"ͬѧ����Ϣ��");
			System.out.println("������ ");
			String studentName = input.next();
			System.out.println("���䣺");
			int age = input.nextInt();
			input.nextLine();//����enter������
			System.out.println("�Ա�");
			String sex = input.nextLine();  
			students[i] = new Student(studentName, age, sex);
		}
		students = sort(students);
		class1.setStudent(students);
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString());
		}
		

	}
	private static Student[] sort(Student[] students) {
		int[] index = new int[students.length];
		for(int i = 0; i < index.length; i++) {
			index[i] = students[i].getName().charAt(0);
		}
		for(int i = 0; i < index.length - 1; i++) {
			for(int j = 0; j < index.length - 1 - i; j++) {
				if( index[j] > index[j+1]) {
					int a = index[j];
					index[j] = index[j+1];
					index[j+1] = a;
					Student n = students[j];
					students[j] = students[j+1];
					students[j+1] = n;
				}
			}
		}
		return students;
	}

}
