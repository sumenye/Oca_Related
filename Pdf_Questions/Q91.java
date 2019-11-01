package Pdf_Questions;

public class Q91 {
	public static int stVar=100;
	public int var=200;
	public String toString() {
		return var+":"+stVar;
	}

	public static void main(String[] args) {
		Q91 t1 = new Q91();
		t1.var=300;
		System.out.println(t1);
		Q91 t2 = new Q91();
		t2.stVar=300;
		System.out.println(t2);	

	}

}
