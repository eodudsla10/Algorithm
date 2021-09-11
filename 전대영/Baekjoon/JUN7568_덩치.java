package practice.brute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUN7568_덩치 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int [][] arr = new int[T][2];
		int max = Integer.MIN_VALUE;
		int count;
		//값 대입
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1]  = Integer.parseInt(st.nextToken());
		}
		
		//탐색
		for (int i = 0; i < T; i++) {
			count =1;
			for (int j = 0; j < T; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					count++;
				else if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1])
					continue;
				else if(arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1])
					continue;
				else if(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1])
					continue;
			}
			sb.append(count).append(" ");
		}
		System.out.println(sb);
		
	}

}
