package dsaArrays;

public class maxElement {

	public static void main(String[] args) {
		
		int arr[] = {11,22,33,44,55};
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}System.out.println(max);
	}
}
