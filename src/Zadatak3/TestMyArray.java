package Zadatak3;

public class TestMyArray {

	public static void main(String[] args) {
		int[] niz = { 1, 3, 5, 7, 2, 44 };

		MyArray myArray = new MyArray(niz);

		System.out.println("Najveci: " + myArray.getLargestElement());
		System.out.println("Najmanji: " + myArray.getSmallestElement());
		System.out.println("Suma: " + myArray.sumAllElement());

		myArray.printAllElement();
	}

}
