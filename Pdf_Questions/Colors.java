package Pdf_Questions;

import java.util.ArrayList;
import java.util.List;

public class Colors {

	public static void main(String[] args) {
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3,"cyan");
		System.out.println(colors);
		
		

	}

}
