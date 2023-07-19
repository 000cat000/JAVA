package Convert;

import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		  
		  
		  
		int input;//執行輸入數據
		  
		//創建輸入字符串的實例
		  
		BufferedReader string=new BufferedReader(new InputStreamReader(System.in));
		  
		System.out.println("請輸入一個的時間：");
		  
		String x=null;
		  
		try{
		  
		x=string.readLine();
		  
		}catch(IOException ex){
		  
		ex.printStackTrace();
		  
		}
		  
		input=Integer.parseInt(x);
		  
		System.out.println("你輸入的數字是："+input);//輸出從輸入接收到的數字
		  
		  
		  
		System.out.println("它的16進制是："+Integer.toHexString(input));//用toHexString把10進制轉換成16進制
		  
		}  //  輸入一個10位數字並把它轉換成16位數字
		  
		}

