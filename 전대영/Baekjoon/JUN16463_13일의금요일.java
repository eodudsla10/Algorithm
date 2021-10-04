package com.day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN16463_13일의금요일 {

	static int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int answer = 0, date = 13;
		for (int i = 2019; i <= n; i++) {
			for (int j = 1; j <= 12; j++) {
				// 13일이 금요일인지 확인
				if (date % 7 == 4)
					answer++;
				date += month[j];
				if (j == 2 && ((i % 4 == 0) && (i % 100 != 0)) || i % 400 == 0)
					date++;
			}
		}
		System.out.println(answer);
	}

}
