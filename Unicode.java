package Convert;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
	        try {
	        	System.out.print("請輸入文字：");
	        	
	            String character = in.readLine();
	            char[] ch = character.toCharArray();
	            StringBuilder sb = new StringBuilder(ch.length);
                for(int i : ch)
                    sb.append(Integer.toHexString(i))
                      .append(" ");
                System.out.printf("%s 的 Unicode 編碼是: %s%n", character, sb.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
        }
	}

}
