package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03_T03 {

	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
		      Date dateTime = sf.parse("2030-09-10 13:10:20");
//		    System.out.println(dateTime);
		      System.out.printf("今年是 %1$tY年 現在是 %1$tp 今天是今年以來的第 %1$tj 天", dateTime);  
		} catch (ParseException e) {
		    e.printStackTrace();

	}
}
}