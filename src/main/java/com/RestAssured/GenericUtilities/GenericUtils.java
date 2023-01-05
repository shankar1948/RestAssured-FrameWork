package com.RestAssured.GenericUtilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import com.mysql.cj.jdbc.Driver;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenericUtils {
	/**
	 * This Method is used to register and get the connection for the database
	 * @author B G ARUNKUMAR
	 */
	public ExcelUtility excel=new ExcelUtility();
	public DataBaseUtility database=new DataBaseUtility();
	public RestAssuredLibrary restAssured=new RestAssuredLibrary();
	public Connection con;
	public RequestSpecification requestSpec;
	
	
	@BeforeSuite
	public void databaseConnect() throws Throwable {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.dbURL, IpathConstants.dbUsername, IpathConstants.dbPassword);
	System.out.println("DataBase Connected");
	}
	
	
	
	/**
	 * This method is used to close the data base
	 * @throws Throwable 
	 */
	@AfterSuite
	public void closeDB() throws Throwable {
		con.close();
	}
	
	
	/**
	 * This method is used to launch Base uri and port number and defining contentType
	 */
	@BeforeClass
	public void URI()
	{
//		baseURI="http://localhost";
//		port=8084;
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
	builder.setContentType(ContentType.JSON);
	 requestSpec = builder.build();
    }
	
	@AfterMethod
	public void validation() {
		ResponseSpecBuilder response=new ResponseSpecBuilder();
		response.expectContentType(ContentType.JSON);
	}
	
	
	
	/**
	 * Used for Generating random alphabets
	 * @return
	 */
	public String alphabet() {
		String alpha = RandomStringUtils.randomAlphabetic(3);
		
		return alpha;
	}
	
	
}
