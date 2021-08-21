package com.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2056_연월일달력 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			String cal = st.nextToken();

			if (Integer.parseInt(cal.substring(4, 6)) == 00) {
				sb.append("#").append(i).append(" ").append(-1).append("\n");
				continue;
			}
			if (Integer.parseInt(cal.substring(4, 6)) == 02) {
				if (Integer.parseInt(cal.substring(6, 8)) > 28) {
					sb.append("#").append(i).append(" ").append(-1).append("\n");
					continue;
				}
			}
			sb.append("#").append(i).append(" ").append(cal.substring(0, 4)).append("/").append(cal.substring(4, 6))
					.append("/").append(cal.substring(6, 8)).append("\n");

		}
		System.out.println(sb);
	}

}
