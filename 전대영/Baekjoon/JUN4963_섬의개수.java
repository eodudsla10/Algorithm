package com.day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN4963_섬의개수 {

	static int[][] map;
	static boolean[][] flag;
	static int w, h, cnt;
	static int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			map = new int[h][w];
			flag = new boolean[h][w];
			cnt = 0;
			// 종료조건
			if (w == 0 && h == 0) {
				break;
			}

			// 입력
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !flag[i][j]) {
						//dfs(i, j);
						bfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}

	private static void bfs(int i, int j) {
		Queue<find> q = new LinkedList<>();
		q.add(new find(i, j));
		flag[i][j] = true;

		while (!q.isEmpty()) {
			find p = q.poll();

			for (int d = 0; d < 8; d++) {
				int nx = p.i + dx[d];
				int ny = p.j + dy[d];
				
				if (nx < 0 || ny < 0 || nx >= h || ny >= w)
					continue;
				
				if (map[nx][ny] == 1 && !flag[nx][ny]) {
					q.add(new find(nx,ny));
					flag[nx][ny]= true;
				}
			}
		}
	}

//	private static void dfs(int i, int j) {
//		flag[i][j] = true;
//		for (int d = 0; d < 8; d++) {
//			int nx = i + dx[d];
//			int ny = j + dy[d];
//
//			// 조건
//			if (nx < 0 || ny < 0 || nx >= h || ny >= w)
//				continue;
//
//			if (map[nx][ny] == 1 && !flag[nx][ny]) {
//				dfs(nx, ny);
//			}
//
//		}
//	}

}

class find {
	int i, j;

	public find(int i, int j) {
		this.i = i;
		this.j = j;
	}

}
