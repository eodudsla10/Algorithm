package com.day24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class JUN7576_토마토 {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
 
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
 
        int[][] arr = new int[N][M];
 
        //입력
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
 
            }
        }
        BFS(arr, N, M);
    }
 
    public static void BFS(int[][] arr, int N, int M) {
        Queue<find> q = new LinkedList<find>();
 
        //익은 토마토의 좌표를 q에 넣는다
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1)
                    q.add(new find(i, j));
            }
        }
 
        while (!q.isEmpty()) {
            //익은 토마토의 상하좌우는 다음에 익기 때문에 큐에 담아야한다.
        	find spot = q.poll();
            for (int i = 0; i < 4; i++) {
                int nX = spot.x + dx[i];
                int nY = spot.y + dy[i];
 
                //범위 밖 패스
                if (nX < 0 || nY < 0 || nX >= N || nY >= M) {
                    continue;
                }
                //다음 위치가 익지 않은 토마토가 아니면 패스
                if (arr[nX][nY] != 0) {
                    continue;
                }
                
                //최대 일수를 구하기 때문에 1로 바꾸는 것이 아니라 현재 일수 +1 을 해줘야한다.
                arr[nX][nY] = arr[spot.x][spot.y] + 1;
                q.add(new find(nX, nY));
            }
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    //토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[i][j]);
            }
        }
        //그렇지 않다면 최대값을 출력한다.
        System.out.println(max - 1);
 
    }
}

//x,y좌표 저장하는 클래스
class find {
    int x;
    int y;
 
    find(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
