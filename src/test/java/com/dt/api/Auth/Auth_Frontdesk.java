package com.dt.api.Auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.ExtentReports.Reporting;
import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Auth_Frontdesk extends Baseclass {

	private static final int priority = 0;
	JSONObject request = new JSONObject();

	@SuppressWarnings("unchecked")

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		  request = new JSONObject();
			request.put("email", ConfigAuth.getemail());
			request.put("emailID1", ConfigAuth.getemailID1());
			request.put("email1", ConfigAuth.getemail1());
			request.put("email2", ConfigAuth.getemail2());
			request.put("firstName", ConfigAuth.getfirstname());
			request.put("lastName", ConfigAuth.getlastname());
			 request.put("propertyId", ConfigAuth.getpropertyID());
			request.put("roleId", ConfigAuth.getroleID());
			request.put("deviceId", ConfigAuth.getdeviceID());
			request.put("deviceIds", ConfigAuth.getdeviceIDs());
			request.put("roleIds", ConfigAuth.getroleIds());  
			request.put("name", ConfigAuth.getname());
			request.put("imageURL", ConfigAuth.getimage());
			request.put("propertyTypeId", ConfigAuth.getpropertyTypeId());
			request.put("apartment", ConfigAuth.getapartment());
			request.put("street", ConfigAuth.getstreet());
			request.put("city", ConfigAuth.getcity());
			request.put("state", ConfigAuth.getstate());
			request.put("country", ConfigAuth.getcountry());
			request.put("zipCode", ConfigAuth.getzipCode());
			request.put("latitude", ConfigAuth.getlatitude());
			request.put("longitude", ConfigAuth.getlongitude());
			request.put("parentId", ConfigAuth.getparentId());
			request.put("zoneTypeId", ConfigAuth.getzoneTypeId());
			request.put("zoneId", ConfigAuth.getzoneID());
			request.put("zoneId1", ConfigAuth.getzoneID1());
			request.put("type", ConfigAuth.gettype());
			request.put("timezone", ConfigAuth.gettimezone());
			
			
			request.put("cloudEmailId", ConfigAuth.getcloudEmailId());
			request.put("pat", ConfigAuth.getpat());
			request.put("tokenname", ConfigAuth.gettokenname());
			
			request.put("newPat", ConfigAuth.getnewPat());
			//request.put("id", ConfigAuth.getid());
			request.put("typeId", ConfigAuth.gettypeId());
			
			request.put("devices", ConfigAuth.getdevices());
			 request.put("protocolId", ConfigAuth.getprotocolId());
			request.put("moveToZoneId", ConfigAuth.getmoveToZoneId());
			request.put("type", ConfigAuth.gettype());
			request.put("collectionIds", ConfigAuth.getcollectionIds());
			request.put("phone", ConfigAuth.getphone());
			request.put("phoneNumber", ConfigAuth.getphonenumber());
			request.put("requestKeyName", ConfigAuth.getrequestKeyName());
			request.put("startDate", ConfigAuth.getstartDate());
			request.put("startTime", ConfigAuth.getstartTime());
			request.put("endDate", ConfigAuth.getendDate());
			request.put("endTime", ConfigAuth.getendTime());
			request.put("neverExpires", false);
			request.put("usePhoneNumberAsKey", false);
			request.put("sendToLock", true);
			request.put("sendToGuest", true); 
			request.put("keyID", ConfigAuth.getkeyId());
			request.put("keyID1", ConfigAuth.getkeyId1());
			request.put("phoneNumberCountryCode", ConfigAuth.getphoneNumberCountryCode());
			//request.put("userId", ConfigAuth.getuserId());
			//request.put("staffId", ConfigAuth.getstaffId());
			request.put("groupId", ConfigAuth.getgroupId());
			

		System.out.println(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}

	// Invite user//
	@Test
	public void testInvite_asFD() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.inviteuser).then()
				.statusCode(403).log().all();
	}

	// View user list//

	@SuppressWarnings("rawtypes")
	@Test
	public void testGetallusers() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.propertyallusers, ConfigAuth.getpropertyID()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

	// get user details//

	@SuppressWarnings("rawtypes")
	@Test
	public void testGetUserdetails() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.userdetails, ConfigAuth.getemail()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 403);
	}

	// remove user from property//
	@Test
	public void testDeleteUser() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deleteuser, ConfigAuth.getemailID(), ConfigAuth.getpropertyID()).then()
				.statusCode(403).log().all();

	}

	// can view self details//

	@SuppressWarnings("rawtypes")
	@Test
	public void testGET_SelfDetails_FD() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.userdetails, ConfigAuth.getemailID()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 403);
	}

	// can edit self details//

	@Test

	public void testPUTEditSelf() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().pathParam("email", ConfigAuth.getemailID())
				.body(request.toJSONString()).when().put(Endpoints.updateuserdetail).then().statusCode(200);

	}

	@Test

	public void testUpdateUD_FD() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().pathParam("email", ConfigAuth.getemailID())
				.body(request.toJSONString()).when().put(Endpoints.updateuserdetail).then().statusCode(400);
	}

	@Test

	public void UpdateUserRole_FD() throws FileNotFoundException, IOException {

		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updateuserrole, ConfigAuth.getpropertyID()).then().statusCode(403);
	}

	// done!
	@Test
	public void testCreateProperty() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.addproperty).then()
				.statusCode(201).log().all();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testGetpropertydetails() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.propertydetails).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

//-----------------------------------------------------------------------------------------//
	@Test

	public void testUpdateProperty() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updateproperty, ConfigAuth.getpropertyID()).then().statusCode(403).log().all();
	}

	// --------------------------------------------------------------------------------------------------//
	/*
	 * @Test public void testDeleteProperty() throws FileNotFoundException,
	 * IOException { given().headers("accept", "application/json", "authorization",
	 * "bearer " +ConfigAuth.getToken())
	 * .contentType(ContentType.JSON).log().all().when().delete(Endpoints.
	 * deleteproperty, ConfigAuth.getpropertyID1())
	 * .then().statusCode(403).log().all(); }
	 */
	// -----------------------------------------------------------------------------------------//
	@Test
	public void testAddZone() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.addzone).then()
				.statusCode(403).log().all();

	}
//--------------------------------------------------------------------------------------------------//

	@Test
	public void testGetZones() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.zoneinproperty, ConfigAuth.getpropertyID()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

	// -----------------------------------------------------------------------------------------//
	@Test

	public void testUpdateZone() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updatezone, ConfigAuth.getzoneID()).then().statusCode(403).log().all();
	}
	// ----------------------------------------------------------------------------------------------//

	@Test
	public void testDeleteZone() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when().delete(Endpoints.deletezone, ConfigAuth.getzoneID())
				.then().statusCode(403).log().all();
	}

	// -----------------------------------------------------------------------------------------//
	@Test
	public void testAddDevices() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.Adddevicestozone)
				.then().statusCode(403).log().all();

	}

	// ----------------------------------------------------------------------------------------------//
	@Test
	public void testGetDevices() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.alldevicesforproperty, ConfigAuth.getpropertyID()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}
	// -----------------------------------------------------------------------------------------//

	@Test

	public void testUpdateDevices() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updatedeviceename, ConfigAuth.getdeviceID()).then().statusCode(403).log().all();
	}

	// -----------------------------------------------------------------------------------------//
	@Test
	public void testDeleteDevice() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when().delete(Endpoints.deletedevicesforzone).then()
				.statusCode(403).log().all();

	}

	// -----------------------------------------------------------------------------------------//
	@Test
	public void testAddSmartthingAccount() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.addsmartthingaccount)
				.then().statusCode(403).log().all();
	}
	// -------------------------------------------------------------------------------------------//

	@Test

	public void testViewSmartthingDetails() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.getsmartthingaccountdeails, ConfigAuth.getpropertyID()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

//--------------------------------------------------------------------------------------------------------//

	@Test

	public void testUpdatePAT() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when().put(Endpoints.UpdatePAT)
				.then().statusCode(403).log().all();
	}

//------------------------------------------------------------------------------------------------------------//
	@Test
	public void testDeleteSmartthing() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deletesmartthing, ConfigAuth.getprotocolId()).then().statusCode(403).log().all();

	}

//----------------------------------------------------------------------------------------------------------// 
	@Test
	public void testCreateGuestKey() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.createguestkey).then()
				.statusCode(201).log().all();
	}
//--------------------------------------------------------------------------------------------------------------------------//

	@Test
	public void viewGuestKey() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.viewguestkey, ConfigAuth.getpropertyID(), ConfigAuth.gettype()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

//--------------------------------------------------------------------------------------------------------------------------//
	@Test
	public void testDeleteGuestKey() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deleteguestkey, ConfigAuth.getkeyId()).then().statusCode(200).log().all();

	}

//--------------------------------------------------------------------------------------------------------------------------//
	@Test

	public void regeneratekey() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.regeneraterequestkey, ConfigAuth.getkeyIDs()).then().statusCode(200);
	}

//--------------------------------------------------------------------------------------------------------------------------//
	  
	  @SuppressWarnings("rawtypes")
	//---------------------------------------------------------------------------new & works
	  @Test
	  public void testResendKeycode() throws FileNotFoundException, IOException {
			given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
					.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.resendkeycode,ConfigAuth.getkeyId1()).then()
					.statusCode(202).log().all();
			 

		}

//----------------------------------------------------------------------------------------------------------------------------//
	@Test

	public void testUpdateGuestDetails() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updateguest, ConfigAuth.getkeyId()).then().statusCode(200).log().all();
	}

//--------------------------------------------------------------------------------------------------------------------------//
	@Test
	public void testCreateStaffKey() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.createStaffkey).then()
				.statusCode(403).log().all();
	}

//----------------------------------------------------------------------------------------------------//
	@Test
	public void viewStaffKey() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.viewstaffkey, ConfigAuth.getpropertyID(), ConfigAuth.gettype()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 403);
	}

//---------------------------------------------------------------------------------------------------------------//
	@Test
	public void testResendStaffkeycode() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.resendstaffkeycode, ConfigAuth.getkeyId()).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 403);
	}

//------------------------------------------------------------------------------------------------------------------//
	@Test
	public void testDeleteStaffKey() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deletestaffkey, ConfigAuth.getkeyId()).then().statusCode(403).log().all();

	}
	 //---------------mastercodesflow----------------------------//
	  
	  @Test
	  public void testGenerateMasterCodes() throws FileNotFoundException, IOException {

	  	given().header("Authorization", "bearer " + ConfigAuth.getToken(), "accept", "application/json")
	  			.contentType(ContentType.JSON).body(request.toJSONString()).when()
	  			.post(Endpoints.generateMasterCode).then().statusCode(201).log().all();
	  	}	  

  @Test	  
	  public void testRegenerateMasterCode() throws FileNotFoundException, IOException
  {
	  given().headers("accept", "application/json", "Authorization", "bearer " +
	  ConfigAuth.getToken()) .contentType(ContentType.JSON).log().all()
	  .body(request.toJSONString())
	  .when().put(Endpoints.regenerateMasterCode,ConfigAuth.getmasterCodeId()).then().statusCode(200); 
		  
}
  @Test 
  public void viewMasterCode() throws FileNotFoundException, IOException {
  	Response response = given().headers("Authorization","bearer "+ConfigAuth.getToken(), "accept" ,"application/json").log().all()
  	.get(Endpoints.viewMasterCode,ConfigAuth.getpropertyID()).andReturn();
  	ResponseBody body = response.getBody();
  	logger.info("Status code is: " + response.getStatusCode());
  	Reporting.getTest().log(LogStatus.INFO,"Status code is: " + response.getStatusCode());
  	logger.info("Response time is: " + response.getTime());
  	Reporting.getTest().log(LogStatus.INFO,"Response time is: " + response.getTime());
  	logger.info("Response body is: " + body.asPrettyString());
  	Reporting.getTest().log(LogStatus.INFO,"Response body is: " + body.asPrettyString());
  	logger.info("Status line is: " + response.getStatusLine());
  	Reporting.getTest().log(LogStatus.INFO,"Status line is: " + response.getStatusLine());
  	logger.info("Content type is: " + response.getHeader("content-type"));
  	Reporting.getTest().log(LogStatus.INFO,"Content type is: " + response.getHeader("content-type"));
  	assertEquals(response.getStatusCode(), 200);
  }
  @Test 
  public void testDeleteMastercode() throws FileNotFoundException, IOException 
  {
  	given().headers("accept", "application/json", "authorization", "bearer " + ConfigAuth.getToken())
  			.contentType(ContentType.JSON).log().all().when()
  			.delete(Endpoints.deletemasterCode,ConfigAuth.getmasterCodeId()).then().statusCode(200).log().all();

  }
	

}
