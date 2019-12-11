package zadatak1;

public class Test {

	public static void main(String[] args) {
		Author author = new Author("Mujo", "m@gmail.com", 'M');
		Book book = new Book("Lesi se ", author, 10, 1);
		System.out.println(book);
	}

}
