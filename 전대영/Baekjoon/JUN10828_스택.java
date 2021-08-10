package practice_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class JUN10828_스택 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			int num;
			switch (command) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				stack.add(num);
				break;
			case "top":
				if (stack.isEmpty())
					System.out.println("-1");
				else
					System.out.println(stack.peek());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "pop":
				if(stack.isEmpty())
					System.out.println("-1");
				else
					System.out.println(stack.pop());
				break;

			}
		}
	}

}
