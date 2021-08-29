package com.day18;

import java.util.Arrays;
import java.util.Scanner;

public class JUN2667_단지번호붙이기 {
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};

    static int D;
    static int[][] map;
    static boolean[][] visited;
    static int[] apartment;
    static int num = 0;
    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        D = scanner.nextInt();
        map = new int[D][D];
        visited = new boolean[D][D];
        apartment = new int[D * D];

        for (int i = 0; i < map.length; i++) {
            String str = scanner.next();
            String[] tmp = str.split("");
            for (int j = 0; j < map.length; j++) {
                map[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    num++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(apartment);

        System.out.println(num);
        for (int i = 0; i < apartment.length; i++) {
            if (apartment[i] != 0) System.out.println(apartment[i]);
        }

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        apartment[num]++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < D && ny < D) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}