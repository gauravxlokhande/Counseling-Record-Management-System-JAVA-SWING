package collegeapplication.common;

import java.sql.*;

/* Made by : Gaurav Lokhande
 * Mail : gaurravlokhande@gmail.com
 * linkedin : https://www.linkedin.com/in/gauravlokhande
 * github : https://github.com/gaurravlokhande
 * Title : DataBaseConnection.java
 * Purpose : For database connection
 */

public class DataBaseConnection {
	
	static Connection con=null;
	static final String url="jdbc:mysql://localhost:3307/collegedata";
	static final String uname="root";
	static final String password="";
	
	//Stackoverflow---------------------
	
	
	public static Connection getConnection()
	{
		if(con!=null)
		{
			return con;
		}
		else
		{
			try
			{
				
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,uname,password);
				return con;
			}
			catch(Exception exp)
			{
				exp.printStackTrace();
				return con;
			}
		}
	}
	public static boolean checkconnection() 
	{
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,password);
			return true;
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
			return false;
		}
	}
	public static void  closeConnection() 
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
