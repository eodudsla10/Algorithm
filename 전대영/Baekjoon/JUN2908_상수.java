package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2908_상수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int arr1 = Integer.parseInt(st.nextToken());
		int arr2 = Integer.parseInt(st.nextToken());
		arr1 = Integer.parseInt(new StringBuilder().append(arr1).reverse().toString());
		arr2 = Integer.parseInt(new StringBuilder().append(arr2).reverse().toString());
		System.out.println(arr1>arr2 ? arr1:arr2);
	}

}

//기존 풀이 방법
//String a = "";
//String b = "";
//for (int i = 0; i < 3; i++) {
//	a += Integer.toString(arr1%10);
//	arr1 = arr1/10;
//}
//
//for (int i = 0; i < 3; i++) {
//	b += Integer.toString(arr2%10);
//	arr2 = arr2/10;
//}
//if(Integer.parseInt(a)> Integer.parseInt(b))
//	System.out.println(a);
//else
//	System.out.println(b);
