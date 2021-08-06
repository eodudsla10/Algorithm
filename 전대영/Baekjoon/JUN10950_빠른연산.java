package practice.for1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class JUN10950_빠른연산 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < num; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = Integer.parseInt(st.nextToken());
			int result2 = Integer.parseInt(st.nextToken());
			bw.write(result+result2+"\n");			
		}
		bw.close();
	}
}
