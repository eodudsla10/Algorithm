package com.pro;


import java.util.ArrayList;
import java.util.Arrays;

class Solution {


	public int[] solution(int[] answers) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] score = new int[3];
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == arr[i % arr.length])
				score[0]++;
			if (answers[i] == arr2[i % arr2.length]) {
				score[1]++;
			}
			if (answers[i] == arr3[i % arr3.length]) {
				score[2]++;
			}
		}

		
		//가장 높은 점수
		int max =0;
		for (int i = 0; i < 3; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		
		//가장 높은 점수를 받은 사람 수
		int maxCount =0;
		for (int j = 0; j < 3; j++) {
			if(score[j] == max) {
				maxCount++;
			}
		}
		int[] answer = new int[maxCount];
		int idx =0;
		for (int k = 0; k < 3; k++) {
			if(score[k] == max) {
				answer[idx] = k+1;
				idx++;
			}
		}

		
		return answer;
	}
}