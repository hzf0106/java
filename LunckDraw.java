package com.hzf;

import java.util.Random;
import java.util.Scanner;

public class LunckDraw {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] b = { 1, 1, 1, 1};
		int count = 4;
		String[] prize = {"iPhone X", "vivo20","Galaxy Note", "honorX7"};
		boolean n = true;
		while(n) {
			System.out.println("请输入一个不等于0的整数开始抽奖:");
			int num = new Scanner(System.in).nextInt();
			if(num != 0) {
				num = num + new Random().nextInt(20);
				num = num % 10;
				int a = new Random().nextInt(num);
				if(count == 0) {
					System.out.println("奖品已经抽完了");
					break;
				}
				else if (a < 4 && b[a] == 1) {
					b[a] = 0;
					System.out.println("恭喜你抽到了一台" + prize[a] + "!");
					count--;
				}
				else {
					System.out.println("抱歉，没抽到奖品！");
				}
				System.out.println("输入y继续抽奖，或输入n退出：");
				if( new Scanner(System.in).nextLine().equals("n")) {
					n = false;
				}
			}
		}
	}
}

