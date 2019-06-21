
public class Stack {
	// global variable declarations
		private char[] charArray;
		private int maxSize;
		private int top;

		
		/**
		 * constructor for stack
		 * @param size : the desired size of the stack
		 */
		public Stack( int size ){
			
			maxSize = size;
			charArray = new char[maxSize];
			top = -1;
			
		}
		
		/**
		 * pushes a state into the stack
		 * @param state accepts a state object 
		 * to push
		 */
		public void push( char character ){
			
			charArray[ ++top ] = character;
			
		}
		
		/**
		 * pops a state from the stack
		 * @return returns the popped state
		 */
		public char pop( ){
			
			return charArray[ top-- ];
		}
		
		/**
		 * gets the value of top
		 * @return returns the value of top
		 */
		public int getTop(){
			return this.top;
		}
		
		/**
		 * print the stack
		 * @param states : the stack to be printed
		 */
		public void printStack( Stack chars ){
			
			
			if(chars.isEmpty()){
				System.out.println("The stack is empty");
			}
			
			else{
				for(int x = chars.getTop(); x > -1; x--){
					System.out.println(chars.charArray[x] );
					
				}
			}
				
			
		}
		
		/**
		 * checks if stack is empty
		 * @return returns true or false
		 */
		public boolean isEmpty( ){
			
			boolean empty = false;
			
			if ( top == -1)
				empty = true;
		
			return empty;
		}
		
		/**
		 * checks if stack is full
		 * @return returns true or false
		 */
		public boolean isFull( ){
			
			boolean full = false;
			
			if ( top == maxSize - 1 )
				full = true;
			
			return full;
		}
}
