package com.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2669_작사각형네개의합집합의면적구하기 {
	static boolean[][] map;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new boolean[100][100];
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());


			for (int j = y; j <height; j++) {
				for (int k = x; k <width; k++) {
					if (!map[j][k]) {
						map[j][k] = true;
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}

}
