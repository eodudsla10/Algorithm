package practice.for1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JUB2439_별찍기2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				sb.append(" ");
			}
			for (int k = 1; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
