package Pdf_Questions;

public class ShirtsArray {

	public static void main(String[] args) {
	
String shirts[][] = new String[2][2];
shirts[0][0]="red";
shirts[0][1]="blue";
shirts[1][0]="small";
shirts[1][1]="medium";
for(int i=0; i<2;i++) {
	for(int j=0; j<2;j++) {
		System.out.print(shirts[i][j]+":");
	}
}


	}

}
