package Pdf_Questions;
class MyException extends RuntimeException{}

public class ExceptionTestQ120 {

	public static void main(String[] args) {
		try {
			method1();
		}catch (MyException ne) {
			System.out.println("A");
		}

	}
	public static void method1() {
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException(); 
		} catch (RuntimeException re) {
			System.out.println("B");
		}
	}

}
