package practice.Inputstar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN2443_별찍기6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i > 0; i--) {
			for (int j = 1; j <= N + i - 1; j++) {
				if (j <= N - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
