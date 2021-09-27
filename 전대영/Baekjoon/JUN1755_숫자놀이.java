import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Algo1_서울_11반_전대영 {

	static String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		StringBuilder sb = null;	//arr 배열값을 빼와서 저장하는 공간
		ArrayList<num> list = new ArrayList<>();	//정렬한 값을 넣어두는 공간

		// M부터 N까지
		for (int i = M; i <= N; i++) {
			sb = new StringBuilder(); // 새롭게 초기화 해줘야 한다.
			String s = i + ""; // 정수를 문자열로 바꾸기 위한 방법
//			System.out.println(tt);

			//temp에 문자열 s의 자릿수마다 정수로 바꾸고 sb에 해당되는 arr 배열의 문자를 저장한다
			for (int h = 0; h < s.length(); h++) {
				int temp = s.charAt(h)-'0';	//문자열을 숫자로 변환
				sb.append(arr[temp]);
			}
			list.add(new num(s, sb.toString()));	//num 클래스에 비교한다음 리스트에 저장
		}
		
		Collections.sort(list);	//리스트를 정렬 해준다
		sb = new StringBuilder();	//출력에 쓰기 위해서 새롭게 초기화
		
		//출력
		for (int i = 0; i < list.size(); i++) {
			if(i+1 ==10)	//10개 이상일때 줄바꿈
				sb.append("\n");
			sb.append(list.get(i).num).append(" ");
		}
		System.out.println(sb);
	}

}

//숫자와 영어로 변한 숫자를 관리하는 클래스
class num implements Comparable<num> {

	String num, eng;

	public num(String num, String eng) {
		this.num = num;
		this.eng = eng;
	}

	@Override
	public int compareTo(num a) {
		return this.eng.compareTo(a.eng); // 영어를 사전순으로 정렬
	}

}