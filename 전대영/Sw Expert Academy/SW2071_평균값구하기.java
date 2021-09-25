package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2071_평균값구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T][10];

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 10; i++) {
				arr[tc][i] = Integer.parseInt(st.nextToken());
			}
		}
		for (int tc = 0; tc < T; tc++) {
			double avg = 0;
			for (int i = 0; i < 10; i++) {
				avg += arr[tc][i];
			}
			sb.append("#").append(tc + 1).append(" ").append(Math.round(avg / 10)).append("\n");
		}
		System.out.println(sb);
	}

}
