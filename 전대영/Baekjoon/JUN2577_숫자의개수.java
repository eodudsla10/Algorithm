package practice.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2577_숫자의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = 1;
		int num = 0;
		int number = 0;
		int[] arr = new int[10];
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			max = max * num;
		}
		while (true) {
			if(max ==0)
				break;
			switch (max % 10) {
			case 0:
				arr[0] += 1;
				break;
			case 1:
				arr[1] += 1;
				break;
			case 2:
				arr[2] += 1;
				break;
			case 3:
				arr[3] += 1;
				break;
			case 4:
				arr[4] += 1;
				break;
			case 5:
				arr[5] += 1;
				break;
			case 6:
				arr[6] += 1;
				break;
			case 7:
				arr[7] += 1;
				break;
			case 8:
				arr[8] += 1;
				break;
			case 9:
				arr[9] += 1;
				break;
			}
			max = max / 10;
		}
		// 출력
		for (int i = 0; i <= 9; i++) {
			System.out.println(arr[i]);
		}
	}

}
