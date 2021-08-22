package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2050_알파벳을숫자로변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alpa = br.readLine();
		for (int i = 0; i < alpa.length(); i++) {
			int a =(alpa.charAt(i)-'0')-16;
			System.out.print(a+" ");
		}
	}

}
