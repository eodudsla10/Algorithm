package practice.for1;

import java.util.Scanner;

public class JUN10950_연산 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println(sum);
		}
	}

}
