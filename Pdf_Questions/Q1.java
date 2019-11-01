package Pdf_Questions;

class Base{
public void test() {
	System.out.println("Base");
}
}

class DerivedA extends Base{
	public void test() {
	System.out.println("Derived A");	}
}

class DerivedB extends DerivedA{
	public void test() {
	System.out.println("DerivedB");	
}}

public class Q1 {

	public static void main(String[] args) {
	Base b1 = new DerivedB();
	Base b2 = new DerivedA();
	Base b3 = new DerivedB();
	b1=(Base)b3;
	Base b4 = (DerivedA)b3;
	b1.test();
	b4.test();
	
	
	}

}
