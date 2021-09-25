package com.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {	//배열 -1로 초기화
			arr[i]=-1;
		}
		
		for (int i = 0; i < N.length(); i++) {
			char ch = N.charAt(i);	//문자열 한개씩 분리
			
			if(arr[ch - 'a'] == -1)	// 해당 arr 인덱스가 -1일 경우
				arr[ch - 'a'] = i;	//i를 넣는다 (문자열의 순서)
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
	}

}
