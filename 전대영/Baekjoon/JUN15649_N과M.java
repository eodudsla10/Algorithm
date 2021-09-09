package com.day19;

import java.util.Arrays;
import java.util.Scanner;

public class JUN15649_N과M {
	static int[] numbers;
	static boolean[] isSelected;
	static int n, m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		numbers = new int[m];
		isSelected = new boolean[n+1];
		permu(0);

		

	}

	private static void permu(int cnt) {
		if(cnt == m) {
			for (int val : numbers) {
				System.out.print(val +" ");
			}
			System.out.println();
			return;
		}
		
		//가능한 모든 수 시도
				for (int i = 1; i <= n; i++) {
					if(isSelected[i])
						continue;	//사용중인 수이면 다음 수로 넘김.
					numbers[cnt] =i;
					isSelected[i] = true;
					
					//다음 자리순열 뽑으러 gogo
					permu(cnt+1);
					isSelected[i] = false;
					
				}
		
		
	}

}
