package com.pcsetting.example;

import java.util.Random;

public class RandomChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String setOfCharacters = "abcdefghxyz1234567-/@";
		
		int randomInt = random.nextInt(setOfCharacters.length());
		char randomChar = setOfCharacters.charAt(randomInt);
		
		System.out.println("Random character from string: " + randomChar);

	}

}
// 隨機跑出一個char