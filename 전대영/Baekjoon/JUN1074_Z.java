package com.day11;

import java.util.Scanner;

//N: 1~15(POW(2,1) ~ POW(2,15)
public class JUN1074_Z {	
	static int N, R, C, cnt;//cnt:몇번째 방문한 값인지 체크해주는 변수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2 3 1
		N = sc.nextInt();//2
		R = sc.nextInt();//3
		C = sc.nextInt();//1
		
		search((int)Math.pow(2, N), 0, 0);//배열의 가로세로 크기, 방문을 시작하려는 x, y좌표
	}

	//가로세로 크기가 n인 사각형에의 x,y좌표에서 방문 시작
	private static void search(int n, int x, int y) {
		if(x == R && y == C) {//원하는 위치에 도착
			System.out.println(cnt);
			return;
		}
		
		//x <= R && y <= C: 현재위치보다 방문하려는 값이 더 뒤쪽에 있고-> 방문 가능
		//R < (x + n) && C < (y + n): 탐색하는 영역안에 원하는 R,C가 들어 있다면
		if(x <= R && y <= C && R < (x + n) && C < (y + n)) {
			//영역 나누기
			int half = n/2;
			
			search(half, x, y); //1사분면
			search(half, x, y + half); //2사분면
			search(half, x + half, y); //3사분면
			search(half, x + half, y + half); //4사분면
			
		}else {//찾는 값이 탐색하려는 영역안에 없는 경우->다른 사분면 안에 있는 경우
			cnt += n * n;//n:현재 위치에서 탐색해야 되는 크기를 구해 더해줌			
		}				
	}
}