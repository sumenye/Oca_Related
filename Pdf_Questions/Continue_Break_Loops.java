package Pdf_Questions;

public class Continue_Break_Loops {

	public static void main(String[] args) {

		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			if (arr[i].contentEquals("C")) {
				continue;
			}

			System.out.println("Work Done");
			break;
		}

	}
}
