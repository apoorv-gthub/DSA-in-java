package dsaArrays;

public class sumOfElements {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int arr[] = {11,22,33,44,55};
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
