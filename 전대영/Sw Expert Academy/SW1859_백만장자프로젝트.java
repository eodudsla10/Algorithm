package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1859_백만장자프로젝트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			String[] input = br.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
			
			long ans =0;
			int max = arr[N-1];
			
			for (int i = N-2; i >= 0; i--) {
				if(arr[i] < max)
					ans += max - arr[i];
				else
					max = arr[i];
			}

			sb.append("#").append(tc).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);
	}

}
