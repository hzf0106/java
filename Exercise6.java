package com.hzf;

import java.util.HashMap;
import java.util.Scanner;
public class Exercise6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = input.nextLine();
		HashMap<String, Integer> hm = cutOut(str);
		hm = count(hm, str);
		for(java.util.Map.Entry<String, Integer> entry : hm.entrySet()){
		    System.out.println(entry.getKey()+"������"+entry.getValue()+"��");
		}
	}
	//����Ӵ�
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
	//ͳ�Ƹ��Ӵ����ַ����г��ֵ�����
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
