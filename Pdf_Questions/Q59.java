package Pdf_Questions;

import MuhtarPackage.Acc;

public class Q59 extends Acc{

	public static void main(String[] args) {
	
Acc obj = new Q59();
System.out.println(obj.s);
Acc obj1 = new Acc();
System.out.println(obj1.s);
Q59 obj2 = new Q59();
System.out.println(obj2.r);//protected fields are accessible for the extending class obj but not for extended class obj
System.out.println(obj2.s);//


	}

}
