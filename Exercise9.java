package com.hzf;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int value = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一组整数：");
		String str = input.nextLine();
		String[] strs = str.split(" ");
		for(int i = 0; i < strs.length; i++) {
			if(strs[i].length() != 0){
				if(hm.containsKey(strs[i]) == true) {
					value = hm.get(strs[i]);
					value++;
					hm.put(strs[i], value);
				}
				else {
					hm.put(strs[i], 1);
				}
			}
		}
		for(java.util.Map.Entry<String, Integer> entry : hm.entrySet()){
		    System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
		}
	}

}
