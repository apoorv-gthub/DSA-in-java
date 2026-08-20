package dsaArrays;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55,66};
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}System.out.println("odd count = " + odd);
		System.out.println("even count = " + even);
		
		
	}

}
