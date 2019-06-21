import java.io.*;

public class LISPChecker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please enter a string for validation.");
		System.out.println("If you wish to end the program, enter 'quit'");
		String lispString;
		while (true) {
			System.out.print("Enter string here: ");
			System.out.flush();
			lispString = readLine();
			
			if (lispString.contentEquals("quit") ) {
				break;
			}

			else{
				boolean returned = checker(lispString);
				System.out.println("The program returned: " + returned);
				
			}
		}

		
	}

	/**
	 * reads input entered
	 * @return returns string entered by user
	 * @throws IOException
	 */
	public static String readLine() throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;

	}

	/**
	 * checks string to validate the parentheses 
	 * @param lispString
	 * @return returns true if the string is valid and false if not
	 */
	public static boolean checker(String lispString) {

		int stackSize = lispString.length(); // get the maximum stack size
		Stack theStack = new Stack(stackSize); // make the stack
		boolean returnVal = true;
		for (int j = 0; j < lispString.length(); j++) // get each character
		{
			char character = lispString.charAt(j); 

			switch (character) {
			case '(': 

				theStack.push(character); 
				break;

			case ')':

				if (!theStack.isEmpty()) // if stack not empty,
				{
					char chx = theStack.pop(); // pop and check
					if (character == ')' && chx != '(') {
						returnVal = false;
					}

				} else { // if the stack is prematurely empty
					returnVal = false;
				}
				break;

			default: 
				break;

			} // end switch statement
		} // end for loop

		if (!theStack.isEmpty()) {
			returnVal = false;
		}

		return returnVal;

	}
}
