package com.hzf;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int value = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = input.nextLine();
		String[] strs = str.split("[,|!|.| |?|0-9]", 0);
		//统计个单词出现的次数
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
