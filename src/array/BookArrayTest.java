package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		library[0] = new Book("������ ����","J.R.R ��Ų");
		library[1] = new Book("ȣ��","J.R.R ��Ų");
		library[2] = new Book("������ ����2","J.R.R ��Ų");
		library[3] = new Book("ȣ��2","J.R.R ��Ų");
		library[4] = new Book("�������","J.R.R ��Ų");
		
		
		for(int i=0; i<library.length;i++) {
//			System.out.println(library[i]);
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
