package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("������ ����","J.R.R ��Ų");
		library[1] = new Book("ȣ��","J.R.R ��Ų");
		library[2] = new Book("������ ����2","J.R.R ��Ų");
		library[3] = new Book("ȣ��2","J.R.R ��Ų");
		library[4] = new Book("�������","J.R.R ��Ų");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		

		for(int i = 0; i<library.length;i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("�ظ�����");
		library[0].setAuthor("j.k �Ѹ�");

		for( Book book: library) {
			book.showBookInfo();
		}
		System.out.println("=============================");
	
		for( Book book: copyLibrary) {
			book.showBookInfo();
		}
	}
}
