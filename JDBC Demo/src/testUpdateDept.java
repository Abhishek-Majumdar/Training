import com.pojos.Department;

public class testUpdateDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dept_name = "CMOT";
		Department dept2 = new Department(12500,"COMMODITIES");
		
		DepartmentDAO dao = new DepartmentDAO();
		Department dept_updated = dao.updateDept(dept_name, dept2);
		System.out.println(dept_updated.getDeptID() + " " + dept_updated.getDeptName());
	}

}
