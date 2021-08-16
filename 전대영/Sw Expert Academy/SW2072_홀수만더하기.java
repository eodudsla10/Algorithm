package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW2072_홀수만더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int num =0;
		
		for (int i = 0; i < N; i++) {
			int sum =0;
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 10; j++) {
				num = Integer.parseInt(st.nextToken());
				if(num%2!=0)
					sum += num;
			}
			sb.append("#").append(i).append(" ").append(sum).append("\n");
		}
		System.out.println(sb);
		
		
	}

}
