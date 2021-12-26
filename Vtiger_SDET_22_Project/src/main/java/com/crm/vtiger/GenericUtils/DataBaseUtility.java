package com.crm.vtiger.GenericUtils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author ARIJIT
 *
 */
public class DataBaseUtility {
	Connection con=null;
	ResultSet result=null;
	Driver driverRef;
	
	/**
	 * Connection with database is established
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException {
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
	}
	/**
	 * DB connection is Closed
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException {
		con.close();
	}
	
	/**
	 * This method returns the data wrt to column Index
	 * @param query
	 * @param Columnindex
	 * @return
	 * @throws SQLException
	 */
	public String getDataFromDb(String query,int Columnindex) throws SQLException {
		String value=null;
		result=con.createStatement().executeQuery(query);
		while(result.next()) {
			value=result.getString(Columnindex);
		}
		return value;
		
	}
	
	public String executeQueryAndGetDataFromDB(String query,int columnName,String expectedData) throws Throwable {
		boolean flag=false;
		result=con.createStatement().executeQuery(query);
		while(result.next()) {
			if(result.getString(columnName).equalsIgnoreCase(expectedData)) {
				flag=true;
				break;
			}
		}
			if(flag) {
				System.out.println(expectedData+"-->data verified in database");
				return expectedData;
			}else {
				System.out.println(expectedData+"-->data is not verified in the database");
				return expectedData;
			}
		
		
	}
}
