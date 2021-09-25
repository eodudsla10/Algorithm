package com.day16;

import java.util.Arrays;
import java.util.Scanner;

public class JUN1152_단어의개수 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.nextLine();
		String[] tt = s.split(" ");
		for (int i = 0; i < tt.length; i++) {
			if(tt[i].equals(""))
				continue;
			count++;
		}
		System.out.println(count);
	}

}
