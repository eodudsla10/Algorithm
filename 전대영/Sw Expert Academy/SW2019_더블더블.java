package com.day14;

import java.util.Scanner;

public class SW2019_더블더블 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.print((int)Math.pow(2, i)+" ");
		}
	}

}
