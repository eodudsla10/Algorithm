package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW2068_최대수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T + 1][10];
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 10; i++) {
				arr[tc][i] = Integer.parseInt(st.nextToken());
			}
		}

		for (int tc = 1; tc <= T; tc++) {
			int max = 0;
			for (int i = 0; i < 10; i++) {
				if (max < arr[tc][i])
					max = arr[tc][i];
			}
			sb.append("#").append(tc).append(" ").append(max).append("\n");
		}
		System.out.println(sb);

	}

}
