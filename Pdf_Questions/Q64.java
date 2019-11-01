package Pdf_Questions;

public class Q64 {
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}

	public static void main(String[] args){
		Q64 ex = new Q64();
		int cardNo=12344;
		ex.checkCard(cardNo);
		//ex.readCard(cardNo);
		

	}
}
