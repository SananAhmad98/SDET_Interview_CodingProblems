package findPalindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean output = findPalindrome("Sanan");

		if(output) {
			
			System.out.println("User input is palindrome");
		}
		else {
			
			System.out.println("User input is not palindrome");
		}
	}

	public static boolean findPalindrome(String inputStr) {
		
		int tracker = inputStr.length()-1;
		
		for(int i = 0; i < inputStr.length(); i++) {
			
			if(inputStr.charAt(i) != inputStr.charAt(tracker)) {
				
				return false;
				
			}
			
			tracker = tracker - 1;
			
		}
		
		return true;
	}
}
