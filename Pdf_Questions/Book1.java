package Pdf_Questions;

public abstract class Book1 implements Readable1{
	public void readBook() {
		System.out.println("Read Book");
	}
	

}
class EBook1 extends Book1{
	public void readBook() {
		System.out.println("Read E-Book");
	}

	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}




}