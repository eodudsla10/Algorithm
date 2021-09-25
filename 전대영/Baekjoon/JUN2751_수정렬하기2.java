package com.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class JUN2751_수정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < T; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		//정렬
		Collections.sort(list);
		for (int integer : list) {
			sb.append(integer).append('\n');
		}
		System.out.println(sb);
	}

}
