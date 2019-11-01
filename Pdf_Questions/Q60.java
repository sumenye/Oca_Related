package Pdf_Questions;

public class Q60 {

	public static void main(String[] args) {
		Q60 ts = new Q60();
		System.out.println(isAvailable+" ");
		isAvailable=ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
static boolean isAvailable=false;
}
