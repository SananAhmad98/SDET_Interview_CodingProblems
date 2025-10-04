package findSecondHighestNumberInArray;

import java.util.HashMap;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {5, 2, 8, 1, 9, 3};
        System.out.println(findSecondHighestNumberInArray(arr1)); // Output: 8
        
        int[] arr2 = {10,10, 5};
        //System.out.println(findSecondHighestNumberInArray(arr2)); // Output: 5
	}

	
	public static int findSecondHighestNumberInArray(int nums[]) {
		
		int secondLargestNumber = 0;
		int tracker = 0;
		HashMap<Integer,Integer> record = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int k = 0 ; k < nums.length; k++) {
				
				System.out.println("number i: "+nums[i]);
				System.out.println("number k: "+nums[k]);
				
				
				if((nums[i] < nums[k]) && (checkRecord(record,nums[i],nums[k]))) {
					
					tracker = tracker +1;
					
				}
				
			}
			
			if(tracker == 1) {
				
				secondLargestNumber = nums[i];
				return secondLargestNumber;
			}
			
			tracker = 0;
		}
		
		
		return secondLargestNumber;
	}
	
	public static boolean checkRecord(HashMap<Integer, Integer> tempRecord,int key,int value) {
		
		boolean Result = false;
		
		if(!(tempRecord.containsKey(key)) && (!tempRecord.containsValue(value))) {
			
			tempRecord.put(key, value);
			System.out.println("key recorded: "+key);
			System.out.println("value recorded: "+value);
			Result = true;
		}
		
		return Result;
		
	}
	
}
