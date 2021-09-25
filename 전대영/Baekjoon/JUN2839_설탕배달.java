package com.day11;

//봉지의 수를 최소화 하려면 최대한 5kg 봉지로 구성해야 함 ->먼저 체크
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN2839_설탕배달 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0; // 총 봉지갯수. 답
		int bag3 = 0; // 3kg 봉지 갯수
		int n = Integer.parseInt(br.readLine());

		while (true) {
			if (n % 5 == 0) { // n이 5kg봉지로 해결이 되는 경우
				System.out.println(n / 5 + bag3);
				break;
			} else { // n이 5kg봉지로 해결이 안되는 경우 -> 3kg짜리 사용
				bag3++;
				n -= 3;
			}
			if (n < 0) {
				System.out.println(-1);
				break;
			}
		}
	}

}
//재귀
//private static void recur(int n) {
//	if (n % 5 == 0) {
//		result += (n / 5) + bag3;
//		return;
//	}
//	if (n < 0) {
//		result = -1;
//		return;
//	}
//	bag3++;
//	recur(n -= 3);
//}