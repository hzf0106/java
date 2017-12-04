package com.hzf;

import java.util.Scanner;

public class Exercise5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Count[] list = new Count[2000];
		int n = 0, a = 0, j = 0;
		//初始化
		for(int i = 0; i < 2000; i++) {
			list[i]= new Count(0, 0);
		}
		//统计输入整数出现的次数
		System.out.println("请输入一组以0输入结束的整数：");
		while(true) {
			a = input.nextInt();
			if(a == 0) {
				break;
			}
			for(j = 0; j < n; j++) {
				if(a == list[j].number) {
					list[j].count++;
					break;
				}
			}
			if(j == n) {
				list[n].number = a;
				list[n].count++;
			}
			n++;
		}
		list = sort(list, n);
		int c = list[0].count;
		System.out.println("出现次数最高的整数和次数分别是:");
		for(j = 0; j < n; j++) {
			if(c == list[j].count) {
				System.out.println(list[j].number+", "+list[j].count);
			}
		}

	}
	private static Count[] sort(Count[] list, int n) {
		int i = 0, j = 0;
		for( ; i < n - 1; i++) {
			for(j = 0; j < n - 1 -i; j++) {
				if(list[j].count < list[j+1].count) {
					Count b = list[j];
					list[j] = list[j+1];
					list[j+1] = b;
				}
			}
		}
		return list;
	}

}

class Count {
	int number;
	int count;
	Count(int number, int count) {
		this.number = number;
		this.count = count;
	}
}