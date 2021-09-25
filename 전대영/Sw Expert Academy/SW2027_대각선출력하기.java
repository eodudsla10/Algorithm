package com.day14;

public class SW2027_대각선출력하기 {

	public static void main(String[] args) {
		String[][] arr = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] ="+";
			}
		}
		int num =0;
		for (int i = 0; i < 5; i++) {
				arr[i][num] ="#";
				num++;
				continue;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
