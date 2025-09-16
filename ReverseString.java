package reverseStringProblem;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversedString = reverseInputString("NASA");
		System.out.println("Output String is reversed: "+reversedString);
	}
	
	public static String reverseInputString(String inputString) {
		
		char outputString[] = new char[inputString.length()];
		int tracker = inputString.length() - 1;
		
		for(int i = 0; i < inputString.length(); i++) {
			
			outputString[i] = inputString.charAt(tracker);
			tracker = tracker - 1;
			
		}
		
		String finalOutput = new String(outputString);
		return finalOutput; 
		
		
	}

}
