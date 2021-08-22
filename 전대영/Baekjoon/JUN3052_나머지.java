package practice.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN3052_나머지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int count = 10;
		// 수 넣기
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}
		// 나머지 넣기
		for (int i = 0; i < 10; i++) {
			arr[i] = arr[i] % 42;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i+1; j <= 9; j++) {
				if(arr[i]==arr[j])
				{
					count--;
					break;
				}
			}
			
		}
		sb.append(count);
		System.out.println(sb);
	}

}
