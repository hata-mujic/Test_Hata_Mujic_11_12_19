package Zadatak3;

public class MyArray {

	private int[] array;

	public MyArray(int[] array) {
		super();
		this.array = array;
	}

	public int getSmallestElement() {
		int b = 100000;
		for (int i = 0; i < array.length; i++) {
			if (b > array[i]) {
				b = array[i];
			}
		}
		return b;
	}

	public int getLargestElement() {
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			if (b < array[i]) {
				b = array[i];
			}
		}
		return b;
	}

	public int sumAllElement() {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;
	}

	public void printAllElement() {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
