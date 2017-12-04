package com.hzf;


import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÃû×Ö£º");
		String str1 = input.nextLine();
		String[] strs = str1.split(" ");
		Arrays.sort(strs, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
