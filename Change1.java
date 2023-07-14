package com.pcsetting.example;

public class Change1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;  // 數字會顯示列出幾行隨機的英文字母
		String str = "";
		for (int i = 0; i < n; i++) {
			str = str + (char)(Math.random()*26+'a'); 
		
		for (int a = 0; a < n; a++) {
			str = str + (char)(Math.random()*26+'A'); 
			// 26代表隨機出現26個英文字母，a代表小寫字母，A代表大寫字母。
		}
		System.out.println(str);
	}
	// 隨機顯示小寫和大寫的英文字母，因為我前面字串是a，所以顯示出每行英文亂數開頭都是小寫。
	
	}	
}
