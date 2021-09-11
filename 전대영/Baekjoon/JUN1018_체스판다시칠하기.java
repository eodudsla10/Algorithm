package practice.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN1018_체스판다시칠하기 {

	static boolean[][] map;
	static int min = 64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new boolean[n][m];
		
		//입력받기
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					map[i][j] = true;		// W일 때는 true 
				} else {
					map[i][j] = false;		// B일 때는 false
				}
			}
		}
		
		//탐색
		int N_row = n - 7;
		int M_col = m - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
 
		boolean TF = map[x][y];	// 첫 번째 칸의 색 
 
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				// 올바른 색이 아닐경우 count 1 증가 
				if (map[i][j] != TF) {	
					count++;
				}
				
				/* 
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false 라면 true 로
				 * 값을 변경한다.
				 */
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);
		
	}

}
