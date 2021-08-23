package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN1157_Wordpractice{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26];	//알파벳 개수를 저장할 배열
		
		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자일 경우
				arr[s.charAt(i)-'A']++;	//인덱스값 증가
			}else
				arr[s.charAt(i)-'a']++;
		}
		
		int max = -1;
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {	//해당되지 않는 경우에는 그냥 넘어가진다.
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max)
				ch ='?';
		}
		
		System.out.println(ch);
	}

}
