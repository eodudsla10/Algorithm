package com.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1986_지그재그숫자 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int max = 0;
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i <= n; i++) {
				if(i == 1) {
					max +=i;
					continue;
				}else if(i%2 == 0) {
					max -=i;
					continue;
				}else{
					max +=i;
					continue;
				}
			}
			System.out.println("#" +tc+ " "+max);
		}
	}

}
