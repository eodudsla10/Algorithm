package com.day16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1926_간단한369게임 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int count = 0; // 3,6,9의 수
			if (tc < 10) { // 10이하
				if (tc % 3 == 0)
					System.out.print("- ");
				else
					System.out.print(tc + " ");
			} else {// 10 이상
				String a = Integer.toString(tc);
				String[] num = a.split("");

				for (int i = 0; i < num.length; i++) {
					if (num[i].contains("3") || num[i].contains("6") || num[i].contains("9"))
						count++;
				}
				if (count == 0)
					System.out.print(tc + " ");
				else {
					for (int i = 0; i < count; i++) {
						if (count == 1)
							System.out.print("-");
						else
							System.out.print("-");

					}
					System.out.print(" ");
				}
			}
		}
	}

}
