package paket;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unsesi string:");
		String unos = input.nextLine();
		
		int index = 0;
		int index1 = 0;

		for (int i = unos.length() - 1; i >= 0; i--) {
			if (unos.charAt(i) == ' ') {
				index = i;
				break;
			}

		}

	
		for (int i = index; i >= 0; i--) {
			if (unos.charAt(i) == ' ') {
				index1 = i-(unos.length()-index);
				break;
			}

		}		System.out.println(index1);

		
	
		for (int i = index1; i < index; i++) {
			if (Character.isLetter(unos.charAt(i))) {
				System.out.print(unos.charAt(i));
			}
		}
		
		input.close();
	}

}
