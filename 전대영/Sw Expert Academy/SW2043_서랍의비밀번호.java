package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2043_서랍의비밀번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int num = P-K+1;
		System.out.println(num);
	}

}
