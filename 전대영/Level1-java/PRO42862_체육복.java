package com.day28;

import java.util.Arrays;

public class PRO42862_체육복 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(solution(n,lost,reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;	// 체육복을 가지고 올수 있는 학생
        
		//테스트 케이스에서 걸려서 추가한 항목
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // -1 : 체육복 없는 상태
        
        //경우1) 여벌 체육복을 가져온 학생이 도난당함
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        
        //경우2) 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }

}
