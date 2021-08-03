package com.day2;

import java.util.Scanner;

/* 출발점-> 도착점: 첫 행의 모든 시작 가능한 지점을 모두 체크해야 됨
 * So, 거꾸로 도착점에서부터 ~시작점 (첫행에 있는)까지 오는 경로 추적 
 * 이동순서에 있어 기준이 되는 한 지점에서 좌우가 상하보다 우선 순위가 높음.
 * --> 좌우 이동 가능한지 체크 후 상하로 이동할 것
 * */
public class SW1210_Ladder {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			sc.nextLine();// tc no. no need!
			String[][] ladder = new String[100][100];

			for (int i = 0; i < 100; i++)// 입력
				ladder[i] = sc.nextLine().split(" ");
			//입력확인

			// 거꾸로 올라갈 거라서 도착점 찾아놓기(열 값)
			int end = 0;
			for (int j = 0; j < 100; j++) {
				if (ladder[99][j].equals("2")) {// destination position.도착점의 열위치
					end = j;
					break;
				}
			}

			// X: 행, Y :열. x = 99인 맨아래 행에서부터 시작
			int x = 99, y = end;// 도착점 좌표. 여기서부터 시작해서 위로 올라갈 거임.

			while (x > 0) {// 맨아래에서부터 맨위 행-1까지, 맨 위 첫번째 행은 안해도 됨(첫행에서 좌우로 움직이지는 않으니까)
				// x = 99인 맨아래 행에서부터 시작.좌우로 이동 가능여부 체크.이동할 좌표가 배열 안 유효값이고 그 칸 값이 1이면 갈 수 있음.
				
				//1. 오른쪽으로 갈수 있는지 -> 계속 오른쪽으로 이동
				if ((y + 1 < 100) && ladder[x][y + 1].equals("1")) {
					do {
						y++;//가능할때까지 계속 오른쪽으로 이동
					} while ((y + 1 < 100) && ladder[x][y + 1].equals("1"));
					
				//2.왼쪽으로 갈수 있는지-> 계속 왼쪽으로 이동
				} else if ((y - 1 >= 0) && ladder[x][y - 1].equals("1")) {// 왼쪽으로 갈 수 있는지
					do {
						y--;// 가능할때까지 계속 왼쪽으로 이동
					} while ((y - 1 >= 0) && ladder[x][y - 1].equals("1"));
				}

				//3. 좌우가 더이상 이동 안되면 위로
				x--;
			}//WHILE

			System.out.println("#" + tc + " " + y);
		}

	}
}