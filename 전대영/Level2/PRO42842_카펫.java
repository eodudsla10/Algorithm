package com.day25;

public class PRO42842_카펫 {

	static int[] answer;
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		Solution(brown, yellow);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
	}

	public static int[] Solution(int brown, int yellow) {
		answer = new int[2];
		int total = brown + yellow;

		for (int i = 3; i <= total; i++) {
			if (total % i == 0) {
				int col = total / i; // 세로
				int row = total / col; // 가로

				int yellow2 = (col - 2) * (row - 2);

				if (yellow2 == yellow) {
					answer[0] = row;
					answer[1] = col;
				}
			}
		}
		return answer;
	}

}
