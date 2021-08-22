package com.day6;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class SW1228_암호문1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();

			LinkedList<String> list = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				list.add(sc.next());
			}
			int count = sc.nextInt();
			for (int i = 0; i < count; i++) {
				String tt = sc.next();
				int x = sc.nextInt(); //위치
				int y = sc.nextInt(); //개수

				for (int j = 0; j < y; j++) {
						list.add(x, sc.next());
						x++;
					
				}
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 10; ++i) {
				System.out.print(list.poll() + " ");
			}
			System.out.println();
		}

	}

}
