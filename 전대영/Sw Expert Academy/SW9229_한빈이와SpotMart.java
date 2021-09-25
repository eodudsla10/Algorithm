package com.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class SW9229_한빈이와SpotMart {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= N; tc++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int size = Integer.parseInt(st.nextToken());
			int[] arr = new int[num];
			ArrayList<Integer> list = new ArrayList<>();
			int sum;
			
			st = new StringTokenizer(br.readLine());
			//과자 n개의 무게
			for (int i = 0; i < num; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			//리스트에 나올 수 있는 과자무게 넣기
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if(i == j)
						continue;
					else {
						sum = arr[i]+arr[j];
						if(sum <= size)
							list.add(sum);
					}
				}
			}
			//리스트 내림차순으로 정렬
			Collections.sort(list,Collections.reverseOrder());
			
			//출력
			System.out.print("#"+tc+ " ");
			if(!list.isEmpty())
				System.out.println(list.get(0));
			else
				System.out.println("-1");

			
		}
	}

}
