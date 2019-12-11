package paket;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesi broj:");
		int broj = input.nextInt();
		System.out.print("Hilstone sekvenca za broj " + broj + " je: " + broj + " ");

		while (broj != 1) {
			if (broj % 2 == 0) {
				broj = broj / 2;
				System.out.print(broj + " ");
			} else if (broj % 2 != 0) {
				broj = (3 * broj) + 1;
				System.out.print(broj + " ");
			}
		}
		input.close();
	}

}
