package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class LoginDAO {
	
	public boolean checkLogin(String username, String password)
	{
		boolean success=false;
		
		try {
			String FIND_USERNAME = "select UNAME from LOGIN where UNAME=? and PWD=? ";
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(FIND_USERNAME);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet set = ps.executeQuery();
			if(set.next())
				success = true;
			else
				success = false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}

}
