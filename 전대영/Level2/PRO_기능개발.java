package com.day17;

import java.util.ArrayList;
import java.util.Arrays;
//stack, queue로 구현으로도 풀어보기
public class PRO_기능개발 {

	public static void main(String[] args) {
		int[] progresses = new int[] { 93, 30, 55 };
		int[] speeds = new int[] { 1, 30, 5 };

		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = new int[progresses.length];
		
		//걸린시간 알아내기
		for (int i = 0; i < progresses.length; i++) {
			int aa = progresses[i];
			int time =0;
			while(true) {
				if(aa >=100)
					break;
				aa += speeds[i];
				time++;
			}
			answer[i] = time;
		}
		
		//값 - 배포가능 날 (막힘)
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < answer.length; i++) {
			int search = answer[i];	//기준값
			int count =1;	//배포 가능 숫자
			
			if(search<0)	//조사가 완료됐으면 넘긴다.
				continue;
			
			//조사
			for (int j = i+1; j < answer.length; j++) {
				int compare = answer[j];	//기준값의 다음 값을 가져온다
				if(search >= compare) {	//만약 기준값이 더 크다면
					answer[j] = -1;	//기준값의 다음값을 음수로 만든다
					count++;	//배포가능숫자 하나 더하기
				}else {
					break;
				}
			}
			list.add(count);
		}
		int[] answer2 = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer2[i] = list.get(i);
		}
		return answer2;
	}

}
