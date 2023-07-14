package com.pcsetting.example;
import java.util.Scanner;
public class Scanner_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		int num1;
		double double1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一個字串:");
		str1 = scanner.nextLine();
		System.out.print("請輸入一個整數:");
		num1 = scanner.nextInt();
		System.out.print("請輸入一個浮點數:");
		double1 = scanner.nextDouble();
		System.out.println("你輸入的字串為:" + str1);
		System.out.println("你輸入的整數為:" + num1);
		System.out.println("你輸入的福點數為:" + double1);

	}

}
