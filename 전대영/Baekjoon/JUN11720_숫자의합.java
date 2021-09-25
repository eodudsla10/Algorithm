package com.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN11720_숫자의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String num = st.nextToken();
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
//			char ch = num.charAt(i);
//			int a = Character.getNumericValue(ch);
			
			sum +=num.charAt(i)-'0';
		}

		System.out.println(sum);
		
	}

}
