package removeDuplicatesFromSortedArray;

public class removeDuplicatesFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 2, 2, 3, 4, 5,5};
		int outputArray [] = removeDuplicatesFromSortedArray(nums);
		System.out.println("Length of the output array: "+(outputArray.length-1));

	}

	public static int[] removeDuplicatesFromSortedArray(int inputArray[]) {
		
		int k = 0;
		int l = 0;
		int dynamicArray[] = {};
		
		for(int i = 0; i <= inputArray.length-1; i++) {
			
			for(int j=0; j <= inputArray.length-1; j++) {
				
				if((inputArray[i] == inputArray[j]) && (i != j)) {
					
					inputArray[j] = 0;
					
				}
				
			}
			
		}
		System.out.println("length: "+inputArray.length);
		while(l <= inputArray.length-1) {
			
			dynamicArray = new int[k+1];
			
			
			if(inputArray[l] != 0) {
				
				dynamicArray[k] = inputArray[l];
				System.out.println("dynamic array: "+dynamicArray[k]);
				k++;
				
			}
			l++;
		}
		
		return dynamicArray;
		
		
	}
}
