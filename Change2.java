package com.pcsetting.example;
//import java.util.Scanner;
public class Change2 {
	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		
		
		str = reverse(str);
		
		System.out.println("" + str);

	}

}
// ABC反轉成CBA