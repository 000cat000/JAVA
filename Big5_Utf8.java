package Convert;
import java.io.UnsupportedEncodingException;

public class Big5_Utf8 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		// TODO Auto-generated method stub
		String str="菜";
		byte[] big5Str=str.getBytes("big5");
		byte[] utf8Str=str.getBytes("utf8");
		
 
		System.out.printf("%s \tbig5\t編碼為: ",str);
		for(byte b:big5Str) System.out.printf("%02X",b);
		System.out.println();
                
		System.out.printf("%s \tutf-8\t編碼為: ",str);
		for(byte b:utf8Str) System.out.printf("%02X",b);
		System.out.println();
        
		
	}

}
//  查詢中文字的BIG5和UTF-8編碼