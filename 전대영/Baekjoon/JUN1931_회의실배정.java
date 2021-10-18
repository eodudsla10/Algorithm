package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JUN1931_회의실배정 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count =0;
		int [][] lecture = new int[num][2];
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				lecture[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(lecture, (num1,num2) ->{
			return Integer.compare(num1[1], num2[1]);
		});
		
//		System.out.println(Arrays.deepToString(lecture));

		int end =0;
		for (int i = 0; i < num; i++) {
			if(end <= lecture[i][0]) {
				end = lecture[i][1];
//				System.out.print(start+" ");
//				System.out.println(end);
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
