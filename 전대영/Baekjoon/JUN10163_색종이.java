package com.day16;

import java.util.Scanner;

//N장의 종이 놓을 때 종이 번호를 이용해서 표시를 해놓자
//모든 종이를 다 놓은 후에 종이 번호를 COUNT
public class JUN10163_색종이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 4 3 2
		int N = sc.nextInt(); // 색종이의 장 수 2
		int[][] map = new int[1001][1001]; // 전체 맵
		int[] paper = new int[N + 1]; // 각 색종이 별 면적 저장하는 배열 //반복문을 1부터 시작 했기 때문에 N + 1이다
		int no = 1; // 색종이 번호

		for (int i = 1; i <= N; i++) { // 색종이 장 수 만큼 반복
			int x = sc.nextInt(); // 1 행
			int y = sc.nextInt(); // 4 열
			int width = sc.nextInt(); // 3 가로
			int height = sc.nextInt(); // 2 세로

			// 색종이 면접 계산해서 채우기
			// 1,4 -> 2,4 -> 3,4(한 행)
			// 1,5 -> 2,5 -> 3,5(한 행)
			for (int h = y; h < y + height; h++) { // 행
				for (int w = x; w < x + width; w++) { // 열
					map[w][h] = no; // 1,4 - 2,4 - 3,4 //1,5 2,5 3,5
				}
			} // 종이 한장 처리 끝
			no++;
		} // 모든 종이 처리 끝

		// 색종이 별로 카운팅
		for (int i = 1; i <= N; i++) {// 종이 장 수만큼
			for (int j = 0; j < 1001; j++) {
				for (int k = 0; k < 1001; k++) {
					if (map[j][k] == i)
						paper[i]++;
				}
			}
		} // 모든 색종이 영역 계산 끝

		// 색종이 별로 면적 출력
		for (int i = 1; i <= N; i++) {
			System.out.println(paper[i]);
		}
	}

}
