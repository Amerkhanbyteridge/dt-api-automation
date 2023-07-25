package com.dt.api.e2e;

package com.dt.api.Auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dt.api.ExtentReports.Reporting;
import com.dt.api.main.Config;
import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthenticationDemo {
	
	JSONObject request;

	@SuppressWarnings("unchecked")
	@BeforeTest

	public void init() throws FileNotFoundException, IOException {
		RequestSpecification getAuthTokenRequest = RestAssured.with();
	 
      
        
        request = new JSONObject();
		request.put("email", ConfigAuth.getemailID());
		request.put("password", ConfigAuth.getPassword());
		request.put("code",ConfigAuth.getCode());
		baseURI = Endpoints.baseURI;
    
	}
	@Test
		public void testuserList() throws FileNotFoundException, IOException{
       
      Response getAuthTokenResponse = given().header("accept", "application/json").contentType(ContentType.JSON).log().all()
				.body(request.toJSONString()).when().post("/api/sessions/auth");
        System.out.println(getAuthTokenResponse.getStatusCode());
        System.out.println(getAuthTokenResponse.asString());
        
        String userid;
        String organizationId;
        String token;
            
        userid= getAuthTokenResponse.jsonPath().getString("data.userData.id");
      System.out.println(userid);
      new ConfigAuth("userid", userid);
		System.out.println("userid" + userid);
		
      organizationId= getAuthTokenResponse.jsonPath().getString("data.userData.organizationId");
      System.out.println(organizationId);
      new ConfigAuth("organizationId", organizationId);
		System.out.println("organizationId" + organizationId);
	    
   ////2fa & capture session token /////
				
		Response sessionToken = given().header("accept", "application/json").header("dt-auth-login-key",userid)
				.header("dt-auth-login-key-2",organizationId)
				.contentType(ContentType.JSON).log().all()
				.body(request.toJSONString()).when().post("/api/sessions/verify-2fa");
		
		  System.out.println(sessionToken.getStatusCode());
	        System.out.println(sessionToken.asString());
	            
	      token= sessionToken.jsonPath().getString("data.sessionToken");
	      System.out.println(token);
	      new ConfigAuth("token", token);
			System.out.println("token" + token);
	
}
		
	}



