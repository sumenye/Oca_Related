package ExceptionsReview;

public class Exception_Handlings {

	/*
	Exceptions can be handled by using try&catch blocks and throws keyword
	 			
	 			1. try& catch blocks: only one of the blocks gets executed.
		 					 try block: only executed if there is no unchecked exception
		 					 catch block: only executed when if there is unchecked exception
		 					
	 					1. one try block can have multiple catch blocks:
	 				
	 						if there are more multiple catch blocks, the catch blocks arguments ( or exception classes needs
	 						to be in Ascending order ( from child class to the parent). 
	 						CAN NOT be in Descending ( from parent to child) order, and cannot be duplicated
	 						
	 
	 
	 */
	
	
	public static void main(String[] args) {
		
		// checked exceptions: 
			try {
				
				Thread.sleep(1000);
				System.out.println("This is try block from checked exception");
				// if the exception is checked exception. try block gets executed
				
			}catch( InterruptedException e ) {
				System.out.println("This is catch block from checked exception");
				
			}
			
			System.out.println("==========================");
			
			//unchecked exceptions:
				int[] arr=  new int[10];
				
				try {
					
					System.out.println(arr[1000]);
					System.out.println("this is try block from unchecked exception");
					
				}catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("this is catch block from unchecked exception");
				}
				
				System.out.println("=========================");
				
				
				try {
					
				System.out.println(arr[1000]);
				
				} catch (IndexOutOfBoundsException e) {
					
					System.out.println("This is Arthimcatic exception");
					
				} catch (NullPointerException e) {
					
					System.out.println("This is null pointer exception");
					
				}
//				catch (ArrayIndexOutOfBoundsException e) {
//					
//					System.out.println("This is Array index out of bound exception");
//					
//				}   //catch blocks should follow Ascending order ( from child to parent)
				
				
			
				
			
			
			
	}

}