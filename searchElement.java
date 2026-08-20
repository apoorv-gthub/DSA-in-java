package dsaArrays;

public class searchElement {

	public static void main(String[] args) {
		
		int num = 13;
		int arr[] = {5,10,15,20,25,30};
		boolean found = false;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] == num) {
				found = true;
			}
		}if(found == true) {
			System.out.println("element present in the array :)");
		}else {
			System.out.println("element not found :(");
		}
		
	}

}
