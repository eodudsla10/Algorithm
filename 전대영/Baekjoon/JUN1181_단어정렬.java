package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class JUN1181_단어정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] s = new String[num];
		
		//입력
		for (int i = 0; i < num; i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//1. 단어 길이가 같을 경우
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return o1.length() - o2.length();
			}
		});
		System.out.println(s[0]);
		for (int i = 1; i < s.length; i++) {
			if(s[i].equals(s[i-1]))
				continue;
			System.out.println(s[i]);
		}
		
		
		
		
	}

}
