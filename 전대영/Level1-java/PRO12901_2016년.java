package com.pro;


class Solution {
    public String solution(int a, int b) {
        int[] month ={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        int total =0;
         // 월마다 일수 더해주기
        for(int i=1; i<a; i++){
            total += month[i-1];
        }
        total += b-1; // 1월 1일부터 시작했으므로 -1 처리
        return day[(total +5)%7]; // 1월 1일이 금요일이므로 + 5로 초기값 설정
    }
}