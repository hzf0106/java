package com.hzf;

import java.util.Scanner;

public class Exercise4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = 0, count = 0;
		System.out.println("������һ���ַ���");
		String string = input.nextLine();
		String[] strs = string.split("[ |,|!|.|?|0-9]", 0);
		for(int i= 0; i < strs.length; i++) {
			if(strs[i].length() != 0) {
				for(j = 0; j < i; j++) {
					if(strs[i].equals(strs[j]) == true) {//�ظ����ʲ�����
						break;
					}
				}
				if(j == i) {
					count++;
				}
			}
		}
		System.out.println("����"+count+"������");
	}
}
