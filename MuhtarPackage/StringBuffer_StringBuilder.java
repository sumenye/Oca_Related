package MuhtarPackage;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		/*
 		String: sequences of characters, immutable. 
 		StringBuilder: sequences of characters, mutable
 		
 		StringBuilder' methods: Append, Reverse, Insert
 					replace, delete, deletecharAt.
 			
 			
 		StringBuilder vs StringBuffer
 		
 */
		// StringBuffer
		StringBuffer strbuffer = new StringBuffer("Hello");
						strbuffer.reverse();
						strbuffer.delete(1, 2);						
/*

StringBuffer vs StringBuilder
	
	all methods in Stringbuffer are synchronized. String buffer is Thread safe
	
			disadvantages of synchronization:
						1. much slower.
						2. create performance problem
*/
}

// methods in STring Builder:
public void append(StringBuilder strb) {

}

// methods in StringBuffer
public synchronized void append(StringBuffer strb) {

}

public static String Rev(String str) {
return new StringBuilder(str).reverse().toString();	
		
		
	}

}
