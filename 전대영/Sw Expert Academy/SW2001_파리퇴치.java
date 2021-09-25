package com.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2001_파리퇴치 {


	static int[][] map;
	static int[][] fly;
	static int n;
	static int m;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			map = new int[n][n];
			fly = new int[m][m];
			max = Integer.MIN_VALUE;
			// 배열에 값 넣기
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < n; k++) {
					map[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int j = 0; j < n; j++) {
				for (int q = 0; q < n; q++) {
					find(j,q);
				}
			}
			System.out.println("#" + i + " "+ max );
		}
	}

	public static void find(int j, int q) {
		int cnt =0;
		for (int i = 0; i < m; i++) {
			for (int k = 0; k < m; k++) {
				int nx = j+i;
				int ny = q+k;
				
				if(nx>=n || ny>=n) {
					continue;
				}
				cnt += map[nx][ny];
			}
			max = Math.max(cnt, max);
		}
	}

}
