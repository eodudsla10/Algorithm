package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN17836_공주님을구해라 {

	static int N, M, T;
	static int[][] map;
	static boolean[][][] visited; // 3차원 배열(그람의 유무까지 파악)
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		visited = new boolean[N][M][2]; // 0은 그람이 없을때, 1은 그람이 있을 때

		// 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 검색
		int result = bfs(0, 0);
		if (result == -1)
			System.out.println("Fail");
		else
			System.out.println(result);

	}

	private static int bfs(int i, int j) {
		Queue<node> q = new LinkedList<>();
		q.offer(new node(i, j, 0, false));
		visited[i][j][0] = true;

		while (!q.isEmpty()) {
			node current = q.poll();

			if (current.count > T)
				break;
			if (current.x == N - 1 && current.y == M - 1)
				return current.count;

			for (int k = 0; k < 4; k++) {
				int nx = current.x + dx[k];
				int ny = current.y + dy[k];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M)
					continue;

				if (!current.isGram) {
					if (!visited[nx][ny][0] && map[nx][ny] == 0) { // 그람 없을 때
						q.offer(new node(nx, ny, current.count + 1, current.isGram));
						visited[nx][ny][0] = true;
					} else if (!visited[nx][ny][0] && map[nx][ny] == 2) { // 그람있는 곳
						q.offer(new node(nx, ny, current.count + 1, true));
						visited[nx][ny][0] = true;
					}
				} else { // 그람 있을 때
					if (!visited[nx][ny][1]) {
						q.offer(new node(nx, ny, current.count + 1, current.isGram));
						visited[nx][ny][1] = true;

					}
				}
			}
		}
		return -1;
	}

	public static class node { // X좌표, Y좌표, 현재 탐색 깊이, 그람의 유무
		int x;
		int y;
		int count;
		boolean isGram;

		public node(int x, int y, int count, boolean isGram) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.isGram = isGram;
		}

	}

}
