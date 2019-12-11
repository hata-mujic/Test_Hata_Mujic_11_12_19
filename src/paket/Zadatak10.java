package paket;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unsesi string:");
		String unosString = input.nextLine();

		System.out.println("Unesi karakter:");
		char c = input.next().charAt(0);

		for (int i = unosString.length() - 1; i >= 0; i--) {
			if (unosString.charAt(i) == c) {
				System.out.println(i);
				break;
			}
		}

		input.close();
	}

}
