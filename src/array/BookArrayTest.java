package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		library[0] = new Book("반지의 제왕","J.R.R 톨킨");
		library[1] = new Book("호빗","J.R.R 톨킨");
		library[2] = new Book("반지의 제왕2","J.R.R 톨킨");
		library[3] = new Book("호빗2","J.R.R 톨킨");
		library[4] = new Book("스마우그","J.R.R 톨킨");
		
		
		for(int i=0; i<library.length;i++) {
//			System.out.println(library[i]);
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
