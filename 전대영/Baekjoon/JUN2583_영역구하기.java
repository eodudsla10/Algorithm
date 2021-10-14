package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN2583_영역구하기 {

	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int M,N,K;
	static int[][] map;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[M][N];
		visited = new boolean[M][N];
		
		//도형 표시하기
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int lx = Integer.parseInt(st.nextToken()); //왼쪽 위
			int ly = Integer.parseInt(st.nextToken());
			int rx = Integer.parseInt(st.nextToken()); //오른쪽 아래
			int ry = Integer.parseInt(st.nextToken());
			
			for (int y = ly; y < ry; y++) {
				for (int x = lx; x < rx; x++) {
					map[y][x] =1;
					
				}
			}
		}
		
		int count =0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(!visited[i][j] && map[i][j] == 0) {
					int data = bfs(i,j);
					list.add(data);
					count++;
				}
			}
		}
		System.out.println(count);
		Collections.sort(list);
		for (int a : list) {
			System.out.print(a +" ");
		}
	}
	
	private static int bfs(int i, int j) {
		Queue<node> q = new LinkedList<>();
		q.offer(new node(i,j));
		visited[i][j] = true;
		int cnt =1;
		while(!q.isEmpty()) {
			node current = q.poll();
			
			for (int k = 0; k < 4; k++) {
				int nx = current.x + dx[k];
				int ny = current.y + dy[k];
				
				if(nx < 0 || ny < 0 || nx>= M || ny >= N)
					continue;
				
				if(!visited[nx][ny] && map[nx][ny]==0) {
					visited[nx][ny] = true;
					q.offer(new node(nx,ny));
					cnt++;
				}
					
			}
		}
		return cnt;
	}
	

	public static class node{
		int x;
		int y;
		
		public node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
