package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentShin = new Student(100, "shin");
		studentShin.setKoreaSubject("����", 80);
		studentShin.setMathSubject("����", 100);
		
		Student studentLee = new Student(101,"Lee");
		studentLee.setKoreaSubject("����", 90);
		studentLee.setMathSubject("����", 40);
		
		studentShin.showStudentScore();
		studentLee.showStudentScore();
	}
}
