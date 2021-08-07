package practice.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN2562_최댓값 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int max = 0;
		int num = 0;
		int count=0;
		int count1 =0;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			count ++;
			if (max < num)
			{
				max = num;
				count1 = count;
			}
		}
		sb.append(max).append("\n").append(count1);
		System.out.println(sb);
	}

}
