package com.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SW1984_중간평균값구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			int max =0;
			for (int i = 0; i < 10; i++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			list.remove(list.size()-1);
			list.remove(0);
			for (int i = 0; i < list.size(); i++) {
				max += list.get(i);
//				System.out.println(max);
			}
			System.out.println("#"+tc+" "+Math.round(max/8));
		}
	}

}
