package com.day14;

import java.util.Scanner;

public class SW1541_거꾸로출력해보아요 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = a; i >= 0; i--) {
			System.out.print(i+" ");
		}
	}

}
