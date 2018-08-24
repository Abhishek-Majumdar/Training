import com.pojo.Student;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentIOIMPL sI = new StudentIOIMPL();
		
		Student[] student = new Student[5];
		student = sI.readFromUser();
		
		StudentFileIOImpl sfI = new StudentFileIOImpl();
		sfI.writeStudents(student);
		
//		StudentFileIOImpl sfO = new StudentFileIOImpl();
		student = sfI.readStudents();
		
//		StudentIOIMPL fIO = new StudentIOIMPL();
		sI.writeToUser(student);
	}



}
