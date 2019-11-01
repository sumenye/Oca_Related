package ExceptionsReview;
import java.io.IOException;

public class Exceptions_Throws_Throw {

	/*
		
		1. throws: used with the method signature, 
					indicates that method throws an exception.
					if the method with throws signature is being called by another method, 
					then the caller will have to handle the exception.
					
					
		2. throw : used to create instance of an exception.
		 				(creates the object of the exceptions' classes)
		 				Must be declared within the methods or blocks
*/

public static void main(String[] args)  {

methodF();  // the method contains an unchecked exception

//	methodG();  // method contains checked exception


}

public static void methodA() throws Exception {

Thread.sleep(3000);
System.out.println("hello");

}


public static void methodB() throws Exception{



}

public static void methodC() throws Exception {

methodB();


}
public static void methodE() throws RuntimeException {


}

public static void methodD() {
//methodA();
//methodB();
//methodC();
//main( new String[] {"A"} ); 

methodE() ;

}

public static void methodF() {

throw new RuntimeException();   // we created an unchecked exception

}

public static void methodG() throws Exception{

throw new IOException();

}




}