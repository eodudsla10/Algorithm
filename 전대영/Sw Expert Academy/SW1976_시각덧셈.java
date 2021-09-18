package com.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1976_시각덧셈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour = 0;
			int min =0;
			int [] num = new int[4];
			for (int i = 0; i < 4; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			hour += (num[0]+num[2]);
			min +=(num[1]+num[3]);
			if(min >= 60) {
				hour+=(min/60);
				min = (min%60);
			}
			if(hour >12) {
				hour -=12;
			}
			System.out.println("#"+tc+" "+hour+" "+min);
		}
	}

}
