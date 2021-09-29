package com.day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1979_어디에단어가들어갈수있을까 {

	static int N, M;
	static int[][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new int[N][N];

			// 입력
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int count = 0;
			// 탐색
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 0)
						continue;

					if (i == 0 || map[i - 1][j] == 0) {
						if (i + M <= N) {
							if (checkcols(i, j)) {
								count += 1;
							}
						}
					}
					if (j == 0 || map[i][j - 1] == 0) { // 첫번째 칸이거나 바로 앞에 칸이 0
						if (j + M <= N) { // 범위를 넘어가지 않는 경우에만 검사
							if (checkrows(i, j)) {
								count += 1;
							}
						}
					}
				}
			}
			System.out.println("#"+tc+" "+count);
		}
	}

	public static boolean checkrows(int x, int y) {
		boolean flag = true;
		int n = y + M;
		for (int j = y; j < n; j++) {
			if (map[x][j] == 0) {
				flag = false; // 하나라도 0값이 있으면 false (단어를 넣을 수 없으면)
				break;
			}
		}
		if (n < N) {
			if (map[x][n] == 1)
				flag = false; // 넣을 단어보다 칸이 길면 false
		}

		return flag;
	}

	public static boolean checkcols(int i, int j) {
		boolean flag = true;
		int n = i + M;
		for (int k = i; k < n; k++) {
			if (map[k][j] == 0) {
				flag = false;
				break;
			}
		}
		if (n < N) {
			if (map[n][j] == 1)
				flag = false;
		}

		return flag;
	}
}
