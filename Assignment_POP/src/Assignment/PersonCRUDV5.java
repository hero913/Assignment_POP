package week7.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import week7.day3.Person;

//person(pid:int, full_name varchar(50), email varchar(50)

public class PersonCRUDV5 {
	final String HOST = "localhost";
	final String USER = "root";
	final String PASS = "bhularun7";
	final int PORT = 3306;
	final String DBNAME = "person";
	final String DRIVER = "com.mysql.cj.jdbc.Driver";
	final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
	
	// Declare
	Connection conn;
	public void connect() {
		
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void insert(Person person) {
		String sql="INSERT INTO person(pid, full_name, email) VALUES(?, ?, ?)";
		PreparedStatement pStat;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, person.getPID()); //Set value
			pStat.setString(2, person.getFullName()); //Set value
			pStat.setString(3, person.getEmail()); //Set value
			pStat.executeUpdate(); //Run Query
			pStat.close();
			System.out.println("Insert record successfully");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
	public void update(int pid) {
		
	}	
}