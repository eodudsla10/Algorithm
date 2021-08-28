package com.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2563_색종이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[100][100]; // 전체 도화지 크기
		int[] paper = new int[N + 1];	// 도화지에 있는 색종이를 담는 배열(겹치는것도 따로)
//		int x =0;
//		int y =0;
		int no = 1; // 검은색 칠해진 면적 구하기
		for (int i = 1; i <= N; i++) {
			// 길이 입력받기
			st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());

			// 해당되는 면적 다 색칠하기 -> 겹치는 부분도 만든다
			for (int j = height; j < height + 10; j++) {
				for (int t = width; t < width + 10; t++) {
					map[t][j] = no;
				}
			}
			no++;
		}
		
		// 면적들의 값 배열에 넣기
		for (int i = 1; i < paper.length; i++) {
			for (int t = 0; t < 100; t++) {
				for (int j = 0; j < 100; j++) {
					if (map[t][j] == i)
						paper[i]++;
				}
			}
		}
		int sum = 0; // 해당되는 면적의 값
		// 넓이를 출력한다
		for (int i = 1; i < paper.length; i++) {
			sum += paper[i];
		}
		System.out.println(sum);
	}

}
