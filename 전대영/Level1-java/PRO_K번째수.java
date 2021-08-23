package com.day16;

import java.util.Arrays;

public class PRO_K번째수 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] num = solution(array, commands);
		System.out.println(Arrays.toString(num));
	}

	private static int[] solution(int[] array, int[][] commands) {
		int[] answer= new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[]arr1 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(arr1);
			answer[i] = arr1[commands[i][2]-1];
		}
		return answer;
	}

}
