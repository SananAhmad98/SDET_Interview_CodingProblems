package findFirstNonRepeatingCharacter;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char nonRepeatingCharacterFirst = findFirstNonRepeatingCharacter("aabbcdef");
		System.out.println("First non-repeating character is: "+nonRepeatingCharacterFirst);
		

	}
	
	public static char findFirstNonRepeatingCharacter(String inputString) {
		
		char finalOutput = 0;
		int tracker = 0;
		
		for(int i = 0; i < inputString.length(); i++ ) {
			
			for(int j = 0; j < inputString.length(); j++) {
				
				
				if((inputString.charAt(i) == inputString.charAt(j))) {
					
					tracker = tracker + 1;
					
				}
				
			}
			
			if(tracker < 2) {
				
				finalOutput = inputString.charAt(i);
				return finalOutput;
			}
			
			tracker = 0;
			
		}
		return finalOutput;	
		
	}

}
