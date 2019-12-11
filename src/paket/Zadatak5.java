package paket;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String unos = "";
		String kraj = "kraj";
		String suma = "";

		while (!unos.equals(kraj)) {
			System.out.print("Unesi rijec: ");
			unos = input.nextLine();

			if (!unos.equals(kraj)) {
				suma = suma + unos + " ";
			}
		}

		System.out.println("Output: " + suma);

		input.close();
	}

}
