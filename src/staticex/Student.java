package staticex;

public class Student {

	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name; // 积己磊 备泅
		address = "林家绝澜";
		serialNum++;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	public String getStudentName() {
		return studentName;
	}
	int getStudentID() {
		return studentID;
	}
}
