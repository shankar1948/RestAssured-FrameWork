package com.RestAssured.GenericUtilities;

import io.restassured.response.Response;

/**
 * This method is used to get the data using JSON Path
 * @author B G ARUNKUMAR
 *
 */
public class RestAssuredLibrary {
public String getJsonData(Response res, String path) {
	String data=res.jsonPath().getString(path);
	return data;
}
}
