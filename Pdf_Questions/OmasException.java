package Pdf_Questions;

import java.util.Arrays;

public class OmasException {

	public static void main(String[] args) {
		String names[] = {"Thomas","Peter","Joseph"};
		String pwd[] =new String[3];
		System.out.println(Arrays.deepToString(pwd));
		int idx=0;
		try {
			for(String n : names) {
				pwd[idx]=n.substring(2,6);
				
				idx++;
				
			}
			System.out.println(Arrays.deepToString(pwd));
		}
		catch (Exception e) {
		System.out.println("Invalid name");
	}
		System.out.println("==========");
	for(String p : pwd) {
		System.out.println(p);
	}

	}

}
