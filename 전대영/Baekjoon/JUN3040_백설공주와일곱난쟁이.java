package com.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//조합으로 풀기
public class JUN3040_백설공주와일곱난쟁이 {

	static int[] arr;
	static int[] arr2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[9];
		arr2 = new int[7];
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		com(0,0);
	}

	private static void com(int cnt, int start) {
		if (cnt == 7) {
			int sum = 0;
			for (int i = 0; i < arr2.length; i++) {
				sum += arr2[i];
			}
			for (int i = 0; i < arr2.length; i++) {
				if (sum == 100) {
					System.out.println(arr2[i]);
				}
			}
			return;
		}
		
		for (int i = start; i < 9; i++) {
			arr2[cnt] = arr[i];
			com(cnt +1, i+1);
		}
	}

}
