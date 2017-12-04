package com.hzf;

import java.util.Scanner;

public class test1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0, n = 0, s = 0;
		System.out.println("ÇëÊäÈëstr1×Ö·û£º");
		String str1 = input.nextLine();
		System.out.println("ÇëÊäÈëstr2×Ö·û£º");
		String str2 = input.nextLine();
		while(true) {
			s = str1.indexOf(str2, n);
			if( s!=-1) {
				count++;
				n = s + 1;
			}
			else
				break;
		}
		System.out.println(count);

	}

}
