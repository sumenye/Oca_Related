package Pdf_Questions;

import java.util.Arrays;

public class Q143 {

	public static void main(String[] args) {
		int num[][] =new int[1][3];
		for(int i=0; i<num.length;i++) {
			for(int j=0; j>num[i].length;j++) {
				num[i][j]=10;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}

}
