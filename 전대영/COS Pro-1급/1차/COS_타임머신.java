package com.cos;


public class COS_타임머신 {

	public static void main(String[] args) {
		COS_타임머신 sol = new COS_타임머신();
		long num = 9949999;
		long ret = sol.solution(num);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

	public long solution(long num) {
		long arr = num+1;
		String s = arr+"";
		long answer = 0;
		String sum ="";
		String[] ss = s.split("");
		for (int i = 0; i < ss.length; i++) {
			if(ss[i].equals("0"))
				ss[i] = "1";
		}
		for (int i = 0; i < ss.length; i++) {
			sum+=ss[i];
		}
		answer = Integer.parseInt(sum);
		return answer;
	}
}
