package com.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SW5215_햄버거다이어트 {
	static int N,L;
	static int result;
	static ArrayList<int[]> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int Q = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				list.add(new int[] { Q, K });
			}
			result = 0;
			combin(0, 0, 0);

			System.out.println("#" + tc + " " + result);
		}

	}

	private static void combin(int cnt, int Q, int K) {
		if(K > L)
			return;
		if (cnt == N) {
			result = Math.max(result, Q);
			return;
		}
		combin(cnt+1, Q+list.get(cnt)[0],K + list.get(cnt)[1]);
		combin(cnt+1, Q,K);

	}

}
