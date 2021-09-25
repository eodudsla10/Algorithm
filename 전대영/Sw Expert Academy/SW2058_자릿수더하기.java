package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2058_자릿수더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num = br.readLine();
		int sum =0;
		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i)-'0';
			sum += n;
			
		}
		sb.append(sum);
		System.out.println(sb);
	}

}
