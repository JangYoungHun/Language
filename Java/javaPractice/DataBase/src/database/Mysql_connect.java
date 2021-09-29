package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql_connect {

	public static void main(String[] args) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorials" , "root", "123456");
			
			System.out.println("DataBase 연동 성공");
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from java_connection");
			
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("Index"));
				System.out.print(".  ");
				System.out.print(resultSet.getString("Name"));
				System.out.print("  ");
				System.out.print(resultSet.getInt("Age"));
				System.out.print("  ");
				System.out.println(resultSet.getString("Location"));
			
			}
			
			statement.executeUpdate("DELETE from java_connection WHERE Name='마바사' ; ");
			resultSet = statement.executeQuery("select * from java_connection");
			
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("Index"));
				System.out.print(".  ");
				System.out.print(resultSet.getString("Name"));
				System.out.print("  ");
				System.out.print(resultSet.getInt("Age"));
				System.out.print("  ");
				System.out.println(resultSet.getString("Location"));
			
			}
			
			
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
