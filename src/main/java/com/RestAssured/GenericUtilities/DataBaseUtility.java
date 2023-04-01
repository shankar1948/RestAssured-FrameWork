package com.RestAssured.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	/**
	 * This Method is used to execute query and get data for user
	 * @author B G ARUNKUMAR
	 * @param query
	 * @param columnIndex
	 * @param expdata
	 * @throws Throwable
	 */
	Connection con;

	public void databaseConnect() throws Throwable {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.dbURL, IpathConstants.dbUsername, IpathConstants.dbPassword);
	
	}
	
	public String executeQueryAndGetData(String query, int columnIndex, String expdata) throws Throwable {
		boolean flag = false;
		//String data=null;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next())
		{
			//data=result.getString(columnIndex);
			if(result.getString(columnIndex).equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("____>data verified");
			return expdata;
		}
		else {
			System.out.println("________>Not verified");
			return "";
		}
	
	}

		public void closeDB() throws Throwable {
			con.close();
		}
	
}