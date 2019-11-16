package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("반지의 제왕","J.R.R 톨킨");
		library[1] = new Book("호빗","J.R.R 톨킨");
		library[2] = new Book("반지의 제왕2","J.R.R 톨킨");
		library[3] = new Book("호빗2","J.R.R 톨킨");
		library[4] = new Book("스마우그","J.R.R 톨킨");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for( Book book : copyLibrary) {
			book.showBookInfo();
		}*/
		
		library[0].setTitle("해리포터");
		library[0].setAuthor("j.k 롤링");

		for( Book book: library) {
			book.showBookInfo();
		}
		System.out.println("=============================");
	
		for( Book book: copyLibrary) {
			book.showBookInfo();
		}
	}
}
