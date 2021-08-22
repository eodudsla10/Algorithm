package practice.Inputstar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN2438_별찍기1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String st = "*";
		for (int i = 0; i < N; i++) {
			System.out.println(st);
			st += "*";
			
		}
	}

}
