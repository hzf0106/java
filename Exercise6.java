package com.hzf;

import java.util.HashMap;
import java.util.Scanner;
public class Exercise6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = input.nextLine();
		HashMap<String, Integer> hm = cutOut(str);
		hm = count(hm, str);
		for(java.util.Map.Entry<String, Integer> entry : hm.entrySet()){
		    System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
		}
	}
	//求各子串
	private static HashMap<String, Integer> cutOut(String str) {
		HashMap<String, Integer> hM = new HashMap<String, Integer>();
		int i = 0, j = 0;
		for(i = 1; i <= str.length(); i++) {
			for(j = 0; j < str.length(); j++) {
				if(j+i <= str.length()) {
					hM.put(str.substring(j, i+j), 0);
				}
			}
		}
		return hM;
	}
	//统计各子串在字符串中出现的字数
	private static HashMap<String, Integer> count(HashMap<String, Integer> hm, String str) {
		int value = 0, n = 0, s = 0;
		String key="";
		 for(java.util.Map.Entry<String, Integer> entry : hm.entrySet()){
			 n = 0;
			 while(true) {
	        	key = entry.getKey();
	        	value = entry.getValue();
	        	s = str.indexOf(key, n);
	        	if(s != -1 ) {
	        		hm.put(key, ++value);
	        		n = s + 1;
	        	}
	        	else
	        		break;
			 }
	     }
		return hm;
	}
}
