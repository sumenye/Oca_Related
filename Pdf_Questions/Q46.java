package Pdf_Questions;

public class Q46{
	int a1;
	
	public static void doProduction(int a) {
		a=a*a;
	}
	public static void doString(StringBuilder s) {
		s.append(" "+s);
	}

	public static void main(String[] args) {
		Q46  item = new Q46();
		item.a1=11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i=10;
		doProduction(i);
		doString(sb);
		doProduction(item.a1);
		System.out.println(i+" "+sb+" "+item.a1);
		

	}

}
