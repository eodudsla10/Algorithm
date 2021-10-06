package com.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN3055_탈출 {
	static Queue<Point> fire, hero;	//bfs
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	static int R,C;
	static char[][] map;
	static boolean[][] visit;
	static char[][] trace;
	static int count; //답. --> 시간
	static boolean running, possible;	//running:bfs 탐색계속 여부 possible:탈출여부
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		trace = new char[R][C];
		visit = new boolean[R][C];
		
		fire = new LinkedList<>();
		hero = new LinkedList<>();
		
		//입력 -> 용사위치 & 불의 위치 저장
		for (int i = 0; i < R; i++) {
			String s = br.readLine();
//			map[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == '*')	//불
					fire.add(new Point(i,j));
				if(map[i][j] == 'S')	//용사
					hero.add(new Point(i,j));
			}
		}//입력
		
		running = true;
		
		//둘이 bfs 탐색하게 함.	1분 간격으로 실행됨
		while(running) {
			goFire(); //불이 퍼짐
			goHero(); //용사가 이동, 도중에 집에 도착하면 끝!(running -> false, count 출력)
			
			//더이상 불이 퍼질 공간이 없고 용사가 이동할 공간이 없으면 
			if(fire.size() == 0 && hero.size() == 0)
				running = false;
		}
		
		//집에는 못갔는데 bfs 탐색을 마친 경우
		if(!possible)
			System.out.println("KAKTUS");
		
	}
	
	private static void goHero() {
		count++;
		int size = hero.size();	//현재 큐에 들어 있는 불 갯수만큼만 퍼져야 됨
		
	here:	for (int i = 0; i < size; i++) {
			Point p = hero.poll();
			
			for (int j = 0; j < 4; j++) {
				int nx = p.x + dx[j];
				int ny = p.y + dy[j];
				
				if(!inRange(nx,ny))	//범위 안쪽인지
					continue;
				if(map[nx][ny] == 'D') {	//집에 도착했다면
					System.out.println(count);
					running = false;	//동작을 멈추게 해야한다.
					possible = true;	//탈출 가능
					break here;
				}
				if(map[nx][ny] == '.' && !visit[nx][ny]) {
					//map[nx][ny] = '.';	//용사 이동 가능
					visit[nx][ny] = true;
					hero.add(new Point(nx,ny));
				}
			}
		}
	}

	private static void goFire() {
		int size = fire.size();	//현재 큐에 들어 있는 불 갯수만큼만 퍼져야 됨
		for (int i = 0; i < size; i++) {
			Point p = fire.poll();
			
			for (int j = 0; j < 4; j++) {
				int nx = p.x + dx[j];
				int ny = p.y + dy[j];
				
				if(!inRange(nx,ny))
					continue;
				if(map[nx][ny] == '.' && !visit[nx][ny]) {
					map[nx][ny] = '*';	//불붙음
					visit[nx][ny] = true;
					fire.add(new Point(nx,ny));
				}
			}
		}
	}

	private static boolean inRange(int nx, int ny) {
		return (nx >=0 && ny >= 0 && nx<R && ny < C);	//조건이 맞으면 true가 리턴된다.
	}

	//불과 용사의 위치정보 저장
	static class Point{
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		
	}
}