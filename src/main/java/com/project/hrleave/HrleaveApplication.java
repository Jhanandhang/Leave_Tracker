package com.project.hrleave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrleaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrleaveApplication.class, args);
		String url="jdbc:mysql://localhost:3306/hr";
		String user="root";
		String pass="root";
		
		try(Connection conn=DriverManager.getConnection(url, user, pass)){
			if(conn!=null) {
				System.out.println("Connection Succesfully");
			}
		}
		catch(SQLException e) {
			System.out.println("Connection Unsuccesfully"+e.getMessage());
		}
	}
}
