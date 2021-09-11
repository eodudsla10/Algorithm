package com.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN10872_팩토리얼 {
	public static void main(String arg[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result =1;
		factory(n,result);
	}

	public static void factory(int n, int result) {
		if(n ==0) {
			System.out.println(result);
			return;
		}
			
		if(n == 1) {
			System.out.println(result);
			return;
		}
		result*= n;
		factory(n-1,result);
	}
}
 