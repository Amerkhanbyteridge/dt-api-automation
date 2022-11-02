package com.api.Auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RoleAccess_PV {

	JSONObject request = new JSONObject();
	@Test
	                                               //Invite user//
	public void testInviteasPV() throws FileNotFoundException, IOException {


		request.put("email", ConfigAuth.getemail());
		request.put("firstName", ConfigAuth.getfirstname());
		request.put("lastName", ConfigAuth.getlastname());
		request.put("propertyId", ConfigAuth.getpropertyID());
		request.put("roleId", ConfigAuth.getroleID());

		System.out.println(request.toJSONString());
		baseURI=Endpoints.baseURI;
	}
	/*@Test
	public void testPost() throws FileNotFoundException, IOException {
		given().
		header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
		.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.inviteuser)
		.then()
		.statusCode(400).log().all();  
	}
*/
	
	
	
	                                         //View user list//
	public class testGETallusers_asPV extends Baseclass {
		
		@SuppressWarnings("rawtypes")
		@Test
		public void testGetallusers() throws FileNotFoundException, IOException {
			Response response = given().headers("Authorization","bearer "+ConfigAuth.getToken(), "accept" ,"application/json").log().all()
			.get(Endpoints.propertyallusers,ConfigAuth.getpropertyID()).andReturn();
			ResponseBody body= response.getBody();
			logger.info("Status code is: " + response.getStatusCode());
			logger.info("Response time is: " + response.getTime());
			logger.info("Response body is: " + body.asPrettyString());
			logger.info("Status line is: " + response.getStatusLine());
			logger.info("Content type is: " + response.getHeader("content-type"));
			assertEquals(response.getStatusCode(), 200);			 
		}
	}
	
	                                        //get user details//
	public class testGET_UserDetails_PV extends Baseclass {
		
		@SuppressWarnings("rawtypes")
		@Test
		public void testGet() throws FileNotFoundException, IOException {
			Response response = given()
					.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
					.get(Endpoints.userdetails, ConfigAuth.getemail()).andReturn();
			ResponseBody body = response.getBody();
			logger.info("Status code is: " + response.getStatusCode());
			logger.info("Response time is: " + response.getTime());
			logger.info("Response body is: " + body.asPrettyString());
			logger.info("Status line is: " + response.getStatusLine());
			logger.info("Content type is: " + response.getHeader("content-type"));
			assertEquals(response.getStatusCode(), 200);
		}
	}
	
	                                         //remove user from property//
	
	/*public class testDELETE_User_PV extends Baseclass{


		@Test
		public void testDELETE() throws FileNotFoundException, IOException {
			given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
					.contentType(ContentType.JSON).log().all().when()
					.delete(Endpoints.deleteuser, ConfigAuth.getemailID(), ConfigAuth.getpropertyID()) // users/{email}/{propertyId}","vindhyar@byteridge.com",
					.then().statusCode(400).log().all();

		}

	}  */
	
	                              //can view self details//
public class testGET_SelfDetails_PV extends Baseclass {
		
		@SuppressWarnings("rawtypes")
		@Test
		public void testGet() throws FileNotFoundException, IOException {
			Response response = given()
					.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
					.get(Endpoints.userdetails, ConfigAuth.getemailID()).andReturn();
			ResponseBody body = response.getBody();
			logger.info("Status code is: " + response.getStatusCode());
			logger.info("Response time is: " + response.getTime());
			logger.info("Response body is: " + body.asPrettyString());
			logger.info("Status line is: " + response.getStatusLine());
			logger.info("Content type is: " + response.getHeader("content-type"));
			assertEquals(response.getStatusCode(), 200);
		}
	}
                                           //can edit self details//
public class testPUT_UserDetail_PV extends Baseclass {
	JSONObject request = new JSONObject();

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("firstName", ConfigAuth.getfirstname());
		request.put("lastName", ConfigAuth.getlastname());
		request.put("phoneNumber", ConfigAuth.getphonenumber());
		request.put("imageURL", ConfigAuth.getimage());
		logger.info(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}

	@Test

	public void testPUT() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().pathParam("email", ConfigAuth.getemailID())
				.body(request.toJSONString()).when().put(Endpoints.updateuserdetail).then().statusCode(200);
	}

}




}
