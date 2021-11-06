package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN2178_미로탐색 {

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int N,M;
	static int[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M];
		//입력
		for (int i = 0; i <map.length; i++) {
			String s = br.readLine();
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		//System.out.println(Arrays.deepToString(map));
		
		//탐색
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				if(map[i][j] == 1 && !visited[i][j])
//					bfs(i,j);
//			}
//		}
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N - 1][M - 1]);
	}
	
	private static void bfs(int i, int j) {
		Queue<node> q = new LinkedList<>();
		q.offer(new node(i,j));
		visited[i][j] = true;
		
		while(!q.isEmpty()) {
			node current = q.poll();
			
			for (int k = 0; k < 4; k++) {
				int nx = current.x + dx[k];
				int ny = current.y + dy[k];
				
				//범위 밖을 벗어날때
				if(nx <0 || ny<0 || nx >= N || ny >= M)
					continue;
				
				if(map[nx][ny]==1 && !visited[nx][ny]) {
					q.offer(new node(nx, ny));
					visited[nx][ny] = true;
					
					//따로 count를 쓰지 않고 해당좌표에 1을 더한다
					map[nx][ny] = map[current.x][current.y] + 1;
					//System.out.print(nx+" ");
					//System.out.println(ny);
				}
			}
		}
		
	}

	public static class node{
		int x;
		int y;
		
		public node(int x, int y) {
			this.x = x;
			this.y =y;
		}
	}
}
