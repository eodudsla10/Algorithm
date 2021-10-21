package com.pro;

import java.util.Arrays;

public class PRO81301_숫자문자열과영단어 {

	public static void main(String[] args) {
		String s = "23four5six7";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		String[] eng = {"zero","one","two","three","four","five","six",
				"seven","eight","nine"};
		
		String [] num = new String[10];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i+"";
		}
//		System.out.println(Arrays.toString(num));
		for (int i = 0; i < eng.length; i++) {
			s = s.replace(eng[i], num[i]);
		}
        
		int answer = Integer.parseInt(s);
        return answer;
    }
	
	//더 쉬운 방법
	//Integer.toString -> 정수형을 문자형으로
//	for(int i=0; i<numArr.length; i++) {
//        s = s.replace(numArr[i], Integer.toString(i));
//    }

}
