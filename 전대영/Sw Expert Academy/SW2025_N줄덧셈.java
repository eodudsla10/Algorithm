package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2025_N줄덧셈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i <= T; i++) {
			
			sum += i;
			
		}
		sb.append(sum);
		System.out.println(sb);
	}

}
