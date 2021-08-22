package com.day9;

import java.util.Arrays;
import java.util.Scanner;

//combination 이용
//nCr: r(1~n)
public class JUN2961_도영이가만든맛있는음식3 {
	static int n, r;// 총재료수, 선택된 재료수
	static int[] sour;// 재료별 신맛 저장하는 배열
	static int[] bitter;// 재료별 쓴맛 저장하는 배열
	static int[] selected;// 선택된 재료번호가 저장될 배열
	static int min = Integer.MAX_VALUE;// 답. 가장 작은 차이

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sour = new int[n];// 재료별 신맛 저장하는 배열
		bitter = new int[n];// 재료별 쓴맛 저장하는 배열
		selected = new int[n];

		for (int i = 0; i < n; i++) {// 재료 갯수만큼 입력 받음
			sour[i] = sc.nextInt();
			bitter[i] = sc.nextInt();
		} // 입력 끝

		for (int i = 1; i <= n; i++) {// i: 선택하는 재료 수 nCr에서 r의 의미
			r = i;
			combination(0, 0);
		}

		System.out.println(min);
	}

	private static void combination(int cnt, int start) {
		if (cnt == r) { // 하나의 조합이 완성되면 할일
			int mul = 1;// 신맛
			int sum = 0;// 쓴맛

			for (int i = 0; i < n; i++) {
				mul *= sour[selected[i]];
				sum += bitter[selected[i]];
			}
			
			min = Math.min(min, Math.abs(mul - sum));// 기존 min과 방금 계산한 min중 더 작은 값
			return;
		}

		for (int i = start; i < n; ++i) {
			selected[cnt] = i;// i:선택한 재료의 번호
			combination(cnt + 1, i + 1);
		}
	}

	/*부분조합으로 풀은 풀이
	 * private static void subset(int count) { // count: 현재까지 고려한 원소 수 //종료조건 if
	 * (count == n) {//하나의 부분집합이 완성되면 할일->사용된 재료별 신맛(*), 쓴맛(+) 계산후 그 차이 구하기 int mul
	 * = 1;//신맛 int sum = 0;//쓴맛
	 * 
	 * for (int i = 0; i < n; i++) { if(flag[i]) {//선택된 재료에 대해서만 mul *= sour[i]; sum
	 * += bitter[i]; } } if(sum != 0) min = Math.min(min, Math.abs(mul - sum));//기존
	 * min과 방금 계산한 min중 더 작은 값 return; }
	 * 
	 * //count번째의 재료를 사용하는 경우 flag[count] = true; subset(count + 1);
	 * 
	 * //count번째의 재료를 사용 안하는 경우 flag[count] = false; subset(count + 1); }
	 */
}