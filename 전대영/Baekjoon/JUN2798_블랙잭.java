package practice.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2798_블랙잭 {
	static int N, M;
	static int[] arr;
	static int[] arr2;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		arr2 = new int[3];
		st = new StringTokenizer(br.readLine());

		// 블랙잭 카드 넣기
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		combin(0, 0);
		System.out.println(max);
	}

	private static void combin(int cnt, int start) {
		if (cnt == 3) {
			int sum = 0;
			for (int i = 0; i < arr2.length; i++) {
				sum += arr2[i];
			}
			if (sum <= M)
				if (max < sum)
					max = sum;
			return;

		}
		for (int i = start; i < N; i++) {
			arr2[cnt] = arr[i];
			combin(cnt + 1, i + 1);

		}
	}

}
