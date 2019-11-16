package classpart;

public class StudentTest {
	
	public static void main(String[] args) {

		Student studentLee = new Student(); // 생성자
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
	}
}
