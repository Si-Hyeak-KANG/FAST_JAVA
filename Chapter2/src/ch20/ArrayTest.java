package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10];//{1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i = 0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		
		for( int num : arr) {
			total += num;
		}//처음부터 끝까지(변수:배열)0~n-1까지
	
		System.out.println(total);
	}

}
