package com.RestAssured.GenericUtilities;

public interface IpathConstants {
	String dbURL="jdbc:mysql://localhost:3306/projects";
	String dbUsername="root";
	String dbPassword="root";
	String createProject="/addProject";
	String getProjectList="/projects";
	String getSingleProject="/projects/";
	String deleteProject="/projects";
	String updateProject="/projects";
}
