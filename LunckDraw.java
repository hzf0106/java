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
			System.out.println("������һ��������0��������ʼ�齱:");
			int num = new Scanner(System.in).nextInt();
			if(num != 0) {
				num = num + new Random().nextInt(20);
				num = num % 10;
				int a = new Random().nextInt(num);
				if(count == 0) {
					System.out.println("��Ʒ�Ѿ�������");
					break;
				}
				else if (a < 4 && b[a] == 1) {
					b[a] = 0;
					System.out.println("��ϲ��鵽��һ̨" + prize[a] + "!");
					count--;
				}
				else {
					System.out.println("��Ǹ��û�鵽��Ʒ��");
				}
				System.out.println("����y�����齱��������n�˳���");
				if( new Scanner(System.in).nextLine().equals("n")) {
					n = false;
				}
			}
		}
	}
}

