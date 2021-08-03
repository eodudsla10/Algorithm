package com.day2;

import java.util.Scanner;

public class SW1954_snail {
	// 초깃값은 max

	public static void main(String[] args) {
		int max = 0;

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = 0;
			int y = -1;
			int t = 1;
			int add = 1;
			int size = sc.nextInt();
			max = size;
			int[][] number = new int[size][size];
			recur(max, x, y, t, add,number);
			
			//출력
			System.out.println("#" + tc);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(number[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	private static void recur(int max, int x, int y, int t, int add,int[][]number) {
		if (max <= 0)
			return;
		for (int i = 0; i < max; i++) { // 행
			y += t;
			number[x][y] = add;
			add++;
		}
		max--;
		for (int i = 0; i < max; i++) { // 열
			x += t;
			number[x][y] = add;
			add++;
		}
		t *= -1;

		recur(max, x, y, t, add,number);
	}
}