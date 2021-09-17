package com.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SW1989_초심자의회문검사 {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			int result =0;
			//stack에 값 넣기
			for (int i = 0; i < s.length(); i++) {
				stack.add(s.charAt(i));
			}
			
			
			for (int i = 0; i < s.length(); i++) {
				sb.append(stack.pop());
			}
			if(sb.toString().equals(s))
				result =1;
			
			System.out.println("#"+tc+" "+result);
		}
	}
}
