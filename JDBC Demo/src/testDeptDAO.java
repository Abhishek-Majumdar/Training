import com.pojos.Department;

public class testDeptDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dept1 = new Department(145, "CPB");
		DepartmentDAO dao = new DepartmentDAO();
		int rows = dao.addDepartment(dept1);
		if(rows>0)
		{
			System.out.println("Record added.");
		}
		else
			System.out.println("X");
	}

}
