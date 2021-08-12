package practice_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class JUN10773_제로 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken());
		Stack<Integer>stack = new Stack<>();
		ArrayList<Integer>list = new ArrayList<>();
		
		//반복
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			if(number == 0)
				stack.pop();
			else
				stack.add(number);
		}
		int sum =0;
		for (int a : stack) {
			sum += a;
		}
		sb.append(sum);
		System.out.println(sb);
	}

}
