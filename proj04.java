
public class proj04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[] arr = new int[n];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		arr[5] = 15;
		arr[6] = 888;
		System.out.println("arr[3]" + arr[3]);
		for(int i=0; i < arr.length; i++) {
			System.out.printf("arr[%d]) = %d\n", i, arr[i]);
		}

	}

}
