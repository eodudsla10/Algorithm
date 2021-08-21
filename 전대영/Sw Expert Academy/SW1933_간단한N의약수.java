package com.day14;

import java.util.Scanner;

public class SW1933_간단한N의약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			if((a%i)==0)
				System.out.print(i+" ");
		}
	}

}
