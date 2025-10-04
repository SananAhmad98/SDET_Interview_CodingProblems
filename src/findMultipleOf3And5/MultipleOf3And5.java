package findMultipleOf3And5;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String output1 = findMultipleOfANumber(15);
		System.out.println(output1);
		String output2 = findMultipleOfANumber(9);
		System.out.println(output2);
		String output3 = findMultipleOfANumber(61);
		System.out.println(output3);
	}

	public static String findMultipleOfANumber(int inputNum) {
		
		if(inputNum % 5 == 0) {
			
			return "Sanan";
			
		}
		else if(inputNum % 3 == 0) {
			
			return "Ahmad";
			
		}
		else {
			
			return "Sanan Ahmad";
		}
	}
	
}
