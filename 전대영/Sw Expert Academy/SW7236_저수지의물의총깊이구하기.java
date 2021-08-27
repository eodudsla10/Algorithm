package com.day17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW7236_저수지의물의총깊이구하기 {
	//8방 탐색-상,하,좌,우, 좌하, 우하, 좌상, 우상
	static int[] dx = {-1, 1,  0, 0,  1, 1, -1,-1};
	static int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1};
	static char[][] map;
	static int max;//저수지 최고 깊이
	static int N;//배열 크기	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); //"3" -> 3
	
		for (int tc = 1; tc <= T; tc++) {
			//1.준비-배열 생성, max 초기화
			 max = Integer.MIN_VALUE;//-21억...
			 
			 N = Integer.parseInt(br.readLine());//"6" -> 6
			 map = new char[N][N];
			 
			//2.입력 받기
			 for (int i = 0; i < N; i++) {//행
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");//G W G G W W
				for (int j = 0; j < N; j++) {//열
					map[i][j] = st.nextToken().charAt(0);//STRING -> char
				}
			}
			
			//3.배열안의 값을 하나씩 조사하면서 'W'를 만날때마다 물 깊이 조사
			 for (int i = 0; i < N; i++) {
				 for (int j = 0; j < N; j++) {
					if(map[i][j] == 'W')//물이니까 8방 조사하러 감
						search(i, j);//현재 w가 발견된 위치					 
				}				
			}
						
			//5.출력
			System.out.println("#" + tc + " " + max);
		}
	}

	//4.조사한 결과와 기존의 최고 깊이값(max)을 비교해서   진짜 최고값 정하기
	//i,j위치를 중심으로 주변의 물깊이를 조사해서 그 결과를 가지고 최고 깊이 결정
	private static void search(int i, int j) {
		//현재 위치: i,j
		int wCnt = 0;//(i,j)주변에서 발견된 W 갯수
		
		for (int k = 0; k < 8; k++) {//주변 8방
			int nx = i + dx[k];
			int ny = j + dy[k];
			
			if(nx < 0 || ny < 0 || nx >= N || ny >= N)
				continue;//다른 방향 조사하러 고고
			
			if(map[nx][ny] == 'W')
				wCnt++;			
		}//8방 탐색
		
		if(wCnt == 0)
			wCnt = 1;
		
		//최고값 비교해서 결정
		max = Math.max(wCnt, max);		
	}
}