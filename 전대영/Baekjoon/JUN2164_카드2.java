package com.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class JUN2164_카드2 {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<Integer>();
		//queue에 넣기
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while(true) {
			if(q.size() == 1) {
				sb.append(q.peek());
				break;
			}
			q.poll();
			q.add(q.poll());
		}
		System.out.println(sb);
	}
}