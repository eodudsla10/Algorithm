package com.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN10870_피보나치수5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(find(n));
	}

	private static int find(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return find(n-1) + find(n-2);
		
	}

}
