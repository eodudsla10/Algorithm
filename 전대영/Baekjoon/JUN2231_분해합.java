package practice.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2231_분해합2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int size = String.valueOf(N).length(); // n의 자리수를 구하기 위한..
		int start = N - (9 * size);
		int result = 0;
		while (true) {
			int sum = 0;
			int count = start;
			// 각 자리수 합 구하기
			while (true) {
				if (count == 0)
					break;
				sum += count % 10;
				count = count / 10;
			}

			// 종료조건
			if (sum + start == N) {
				result = start;
				break;
			}
			if(start >= N)
				break;
			start += 1;
		}
		sb.append(result);
		System.out.println(sb);
	}

}
