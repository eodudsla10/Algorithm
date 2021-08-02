package com.day1;

import java.util.Scanner;

public class JUN1244_switchOnOff {
	static int swichnumber, number;
	static int[] status;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		swichnumber = sc.nextInt() +1;

		status = new int[swichnumber];
		for (int i = 1; i < swichnumber; i++) {
			status[i] = sc.nextInt();
		}

		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			int sex = sc.nextInt();
			int stunumber = sc.nextInt();
			if (sex == 1) {
				for (int j = stunumber; j < swichnumber; j += stunumber) {
					status[j] ^= 1;
				}
			} else if (sex == 2) {
				int left = stunumber;
				int right = stunumber;
				status[stunumber] ^= 1;
				
				while(true) {
					left--; right ++;
					if ( left < 1 || right >= swichnumber ) break;
					if ( status[left] != status[right]) {
						break;
					}
					if(status[left] == status[right])
					{
						status[left] ^=1;
						status[right] ^=1;
					}
				}
				
				
				
//				while (true) {
//					left--;
//					right++;
//					if (left < 0 && right > swichnumber)
//						break;
//					if (status[left] == status[right]) {
//						status[left] ^= 1;
//						status[right] ^= 1;
//					} else if (status[left - 1] != status[right]) {
//						break;
//					}
//				}
			}
		}

		for (int j = 1; j < swichnumber; j++) {
			System.out.print(status[j] + " ");
			if (j % 20 == 0) {
				System.out.println();
			}
			
		}
	}

}
