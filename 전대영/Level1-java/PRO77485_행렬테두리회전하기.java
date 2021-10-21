package com.pro;

import java.util.Arrays;

public class PRO77485_행렬테두리회전하기 {
	static int[][] map;
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;
		int[][] queries = {{1,1,2,2}};
		//System.out.println(solution(rows,columns,queries));
	}

	 public static int[] solution(int rows, int columns, int[][] queries) {
	     map = new int[rows][columns];
	     int[] answer = new int[queries.length];
	     
	     int cnt =1;
	     //map 생성
		 for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				map[i][j] = cnt;
				cnt++;
			}
		}
		 for (int i = 0; i < queries.length; i++) {
			answer[i] = spin(queries[i]);
		}
		 
		 
	        return answer;
	    }

	private static int spin(int[] query) {
		int r1 = query[0]-1;
		int c1 = query[1]-1;
		int r2 = query[2]-1;
		int c2 = query[3]-1;
		
		int start = map[r1][c1]; //시작위치 값 임시로 놓기
		int min = start;
		for (int i = r1; i < r2; i++) { //회전 : 좌측
			map[i][c1] = map[i+1][c1];
			if(min > map[i][c1])
				min = map[i][c1];
		}
		
//		System.out.println(Arrays.deepToString(map));
//		System.out.println();
		for (int i = c1; i < c2; i++) { //회전 : 하단
			map[r2][i] = map[r2][i+1];
			if(min > map[r2][i])
				min = map[r2][i];
		}
//		System.out.println(Arrays.deepToString(map));
//		System.out.println();
		for (int i = r2; i > r1; i--) { //회전 : 우측
			map[i][c2] = map[i-1][c2];
			if(min > map[i][c2])
				min = map[i][c2];
		}
//		System.out.println(Arrays.deepToString(map));
//		System.out.println();
		for (int i = c2; i > c1; i--) { //회전 : 상단
			map[r1][i] = map[r1][i-1];
			if(min > map[r1][i])
				min = map[r1][i];
		}
	

//		System.out.println(Arrays.deepToString(map));
//		System.out.println();
		

		
		map[r1][c1+1] = start;
//		System.out.println(Arrays.deepToString(map));
		
		return min;
	}
}
