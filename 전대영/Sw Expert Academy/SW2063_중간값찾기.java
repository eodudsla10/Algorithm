package com.day14;

import java.util.Arrays;
import java.util.Scanner;

public class SW2063_중간값찾기 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[T];
		for (int tc = 0; tc < T; tc++) {
			int tt = sc.nextInt();
			arr[tc] = tt;
		}
		Arrays.sort(arr);
		int num = arr.length/2;
		sb.append(arr[num]);
		System.out.println(sb);
	}

}
