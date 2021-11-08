package com.jun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JUN1259_팰린드롬수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();
			if(s.equals("0"))
				break;
			String t = sb.append(s).reverse().toString();
			if(s.equals(t))
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
		
	}

}
