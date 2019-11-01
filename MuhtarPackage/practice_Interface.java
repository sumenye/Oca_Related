package MuhtarPackage;

class ClassG{
	
	int a=10;

public static void main(String[] args) {
//	System.out.println(a);   // instance variable cannot be called in static method
	
	System.out.println(  new ClassG().a );
	
}


final int b;

//ClassG(){
//	b=70;
//}

{
	b=30;
}




}


public interface practice_Interface {

		int z=20;
	//	int y;  // final variables MUST be initialized immidietly
		
		public static void main(String[] args) {
			System.out.println(z);   // variable in an interface by default is static and final
		//	z=30;   // variable in an interface by default is static and final
		}

//  public void method1(){ }
		
		void method1();
abstract void method2();


}
