package com.pro;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
	public int[] solution(int[] numbers) {
		int[] answer;
		int cnt=0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(!list.contains(numbers[i]+numbers[j])) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
		Collections.sort(list);
		answer = new int[list.size()];
		for (int arr : list) {
			answer[cnt] = arr;
			cnt++;
		}
		
		return answer;
	}
}