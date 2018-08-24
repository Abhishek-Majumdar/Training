import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.pojos.Department;

public class DepartmentDAO {
	
	public int addDepartment(Department dept)
	{
		String INSERT_DEPT = "insert into DEPARTMENT values (?,?)";
		int r =0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_DEPT);
			
			ps.setInt(1, dept.getDeptID());
			ps.setString(2, dept.getDeptName());
			
			r = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	public List<Department> getAllDepartments()
	{
		List <Department> departments = new ArrayList<>();
		
		String LIST_DEPT = "select * from DEPARTMENT";
		try {
			Connection con = MyConnection.getMyConnection();
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(LIST_DEPT);
			while(set.next())
			{
				int depID = set.getInt(1);
				String depName = set.getString(2);
//				System.out.println("Department ID: " + depID + " " + "Department Name: " + depName);
				Department dept = new Department(depID,depName);
				
				departments.add(dept);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return departments;
	}
	
	public Department updateDept(String deptName, Department dept)
	{
		Department dept1 = new Department();
		
		String UPDATE_DEPT = "update DEPARTMENT set DEPTNAME = ? where DEPTID = ? ";
		
		PreparedStatement ps;
		try {
			ps = MyConnection.getMyConnection().prepareStatement(UPDATE_DEPT);
			ps.setString(1,deptName);
			ps.setInt(2, dept.getDeptID());
			
			int rows = ps.executeUpdate();
			if(rows > 0)
			{
				dept1 = findDepartmentbyID(dept.getDeptID());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dept1;
		
	}
	
	public Department findDepartmentbyID(int deptID)
	{
		Department dept = new Department();
		String FINDBYID = "select * from DEPARTMENT where DEPTID = ? ";
		
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FINDBYID);
			ps.setInt(1, deptID);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				dept = new Department(set.getInt("DEPTID"),set.getString("DEPTNAME"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}

}
