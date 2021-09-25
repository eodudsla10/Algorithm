package com.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JUN11866_요세푸스문제0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		int count =1;
		//queue에 넣기
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		sb.append("<");
		while(true) {
			if(count == n)
				break;
			for (int i = 0; i < k -1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
			count++;
		}
		sb.append(queue.poll()).append('>');
		System.out.println(sb);
	}
}