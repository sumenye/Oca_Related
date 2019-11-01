package Pdf_Questions;

class C2 {
	public void displayC2() {
		System.out.println("C2");
	}
}

class C1 extends C2 implements I {

	public void displayI() {
		System.out.println("C1");
	}

	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		

		C2 s = obj1;
		I t =  obj2;
		t.displayI();
		s.displayC2();

	}

}
