package practice.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN8958_OX퀴즈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
	
		String[] str = new String[100];
//		Queue<String> des = new LinkedList<String>
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int result = 0;
			st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			str = num.split("");
			for (int j = 0; j < str.length; j++) {
				if (str[j].contains("O")) {
					sum += 1;
					result += sum;
				} else
					sum = 0;

			}
			sb.append(result).append("\n");
		}
		//출력
		System.out.println(sb);
	}

}
