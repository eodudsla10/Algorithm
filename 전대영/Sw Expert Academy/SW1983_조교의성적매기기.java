import java.io.*;
import java.util.*;

public class SW1983_조교의성적매기기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] grade = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken())-1;
			int[] total = new int[N];
            
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				int midScore = Integer.parseInt(st.nextToken());
				int finalScore = Integer.parseInt(st.nextToken());
				int homework = Integer.parseInt(st.nextToken());
				total[i] = midScore*35 + finalScore*45 + homework*20; //총점의 값 자체는 중요하지 않으므로 정수형으로 곱해줬다.
			}
            
			int score = total[K];
			Arrays.sort(total);
			int index = -1;
			for(int i=0; i<N; i++) {
				if(total[i] == score) {
					index = i; //K번째 학생의 성적 위치
					break;
				}
			}
            
			int ans = index/(N/10);
			System.out.println("#"+tc+" "+grade[ans]);
			
		}
	}

}