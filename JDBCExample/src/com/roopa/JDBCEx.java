package com.roopa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx {

	public static void main(String[] args) {


		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String sql="insert into product(product_name,cost) values (?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "XXX");
			ps.setInt(2, 20);
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				System.out.println("Record inserted");
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
	}

}
