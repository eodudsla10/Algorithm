package practice.while1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class JUN1110_더하기사이클 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int first = N;
		while (true) {

			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			if (first == N) {
				sb.append(count);
				break;
			}
		}
		System.out.println(sb);
	}
}