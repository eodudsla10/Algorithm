package practice.for1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN10871_X보다작은수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sc = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()); //이미 사용했기 때문에 초기화를 해준다.
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value<X)
				sc.append(value).append(" ");
		}
		System.out.println(sc);
	}

}
