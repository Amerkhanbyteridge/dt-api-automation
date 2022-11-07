/*
 * package com.dt.api.Auth;
 * 
 * import static io.restassured.RestAssured.baseURI; import static
 * io.restassured.RestAssured.given; import static
 * org.testng.Assert.assertEquals;
 * 
 * import java.io.FileNotFoundException; import java.io.IOException;
 * 
 * import org.json.simple.JSONObject; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.Test;
 * 
 * import com.dt.api.baseclass.Baseclass; import com.dt.api.main.Config; import
 * com.dt.api.main.Endpoints;
 * 
 * import io.restassured.http.ContentType; import
 * io.restassured.response.Response; import
 * io.restassured.response.ResponseBody;
 * 
 * public class test_PM extends Baseclass {
 * 
 * private static final int priority = 0; JSONObject request = new JSONObject();
 * 
 * @SuppressWarnings("unchecked")
 * 
 * @BeforeClass public void init() throws FileNotFoundException, IOException {
 * request = new JSONObject(); request.put("email", Config.getemailID());
 * request.put("firstName", Config.getfirstname()); request.put("lastName",
 * Config.getlastname()); request.put("propertyId", Config.getpropertyID());
 * request.put("roleId", Config.getroleID()); request.put("DeviceID",
 * Config.getdeviceID()); request.put("roleIds", Config.getroleIds());
 * request.put("name", Config.getname()); request.put("imageURL", "");
 * request.put("propertyTypeId", Config.getpropertyTypeId());
 * request.put("apartment", Config.getapartment()); request.put("street",
 * Config.getstreet()); request.put("city", Config.getcity());
 * request.put("state", Config.getstate()); request.put("country",
 * Config.getcountry()); request.put("zipCode", Config.getzipCode());
 * request.put("latitude", ""); request.put("longitude", "");
 * request.put("typeId", Config.gettypeId()); request.put("parentId",
 * Config.getparentId()); request.put("devices", Config.getdevices());
 * request.put("protocolId", Config.getprotocolId());
 * request.put("moveToZoneId", Config.getmoveToZoneId());
 * //request.put("cloudEmailId", Config.getcloudEmailId()); request.put("pat",
 * Config.getpat()); request.put("tokenname", Config.gettokenname());
 * request.put("type", Config.gettype()); request.put("collectionIds",
 * Config.getcollectionIds()); request.put("phone", Config.getphone());
 * request.put("phoneNumber", Config.getphonenumber());
 * request.put("requestKeyName", Config.getrequestKeyName());
 * request.put("startDate", Config.getstartDate()); request.put("startTime",
 * Config.getstartTime()); request.put("endDate", Config.getendDate());
 * request.put("endTime", Config.getendTime()); request.put("neverExpires",
 * false); request.put("usePhoneNumberAsKey", false); request.put("sendToLock",
 * true); request.put("sendToGuest", true);
 * System.out.println(request.toJSONString()); baseURI = Endpoints.baseURI;
 * 
 * //---------------------------------------------------------------------------
 * --------------// }
 * 
 * @Test public void testInviteUser() throws FileNotFoundException, IOException
 * { given().header("Authorization", "bearer " + Config.getToken(), "accept",
 * "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when().post(
 * Endpoints.inviteuser).then() .statusCode(400).log().all();
 * 
 * }
 * 
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @SuppressWarnings("rawtypes")
 * 
 * @Test public void testuserList() throws FileNotFoundException, IOException {
 * Response response = given() .headers("Authorization", "bearer " +
 * Config.getToken(), "accept", "application/json").log().all()
 * .get(Endpoints.propertyallusers, Config.getpropertyID()).andReturn();
 * ResponseBody body = response.getBody(); logger.info("Status code is: " +
 * response.getStatusCode()); logger.info("Response time is: " +
 * response.getTime()); logger.info("Response body is: " +
 * body.asPrettyString()); logger.info("Status line is: " +
 * response.getStatusLine()); logger.info("Content type is: " +
 * response.getHeader("content-type")); assertEquals(response.getStatusCode(),
 * 200); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testUserDetails() throws FileNotFoundException, IOException
 * { Response response = given() .headers("Authorization", "bearer " +
 * Config.getToken(), "accept", "application/json").log().all()
 * .get(Endpoints.userdetails, Config.getemailID()).andReturn(); ResponseBody
 * body = response.getBody(); logger.info("Status code is: " +
 * response.getStatusCode()); logger.info("Response time is: " +
 * response.getTime()); logger.info("Response body is: " +
 * body.asPrettyString()); logger.info("Status line is: " +
 * response.getStatusLine()); logger.info("Content type is: " +
 * response.getHeader("content-type")); assertEquals(response.getStatusCode(),
 * 200);
 * 
 * }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test
 * 
 * public void UpdateUserRole() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updateuserrole,Config.
 * getpropertyID()).then().statusCode(200); }
 * 
 * @Test
 * 
 * 
 * 
 * public void testPUT() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken())
 * .contentType(ContentType.JSON).log().all().pathParam("email",
 * Config.getemailID())
 * .body(request.toJSONString()).when().put(Endpoints.updateuserdetail).then().
 * statusCode(200); }
 * 
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testDeleteUser() throws FileNotFoundException, IOException
 * { given().headers("accept", "application/json", "authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all().when()
 * .delete(Endpoints.deleteuser, Config.getemailID(), Config.getpropertyID())
 * .then().statusCode(400).log().all();
 * 
 * }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testSelfDetails() throws FileNotFoundException, IOException
 * { Response response = given() .headers("Authorization", "bearer " +
 * Config.getToken(), "accept", "application/json").log().all()
 * .get(Endpoints.userdetails_userrole,
 * Config.getpropertyID(),Config.getemailID(),Config.getisActive()).andReturn();
 * ResponseBody body = response.getBody(); logger.info("Status code is: " +
 * response.getStatusCode()); logger.info("Response time is: " +
 * response.getTime()); //logger.info("Response body is: " +
 * body.asPrettyString()); logger.info("Status line is: " +
 * response.getStatusLine()); logger.info("Content type is: " +
 * response.getHeader("content-type")); assertEquals(response.getStatusCode(),
 * 200);}
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test
 * 
 * public void testUpdateSelfDetails() throws FileNotFoundException, IOException
 * { given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updateuserdetails,Config.
 * getemail()).then().statusCode(200).log().all(); }
 * //---------------------------------------------------------------------------
 * --------//
 * 
 * @Test public void testCreateProperty() throws FileNotFoundException,
 * IOException { given().header("Authorization", "bearer " + Config.getToken(),
 * "accept", "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when().post(
 * Endpoints.addproperty).then() .statusCode(201).log().all(); }
 * //---------------------------------------------------------------------------
 * --------------------//
 * 
 * 
 * @SuppressWarnings("rawtypes")
 * 
 * @Test public void testGetpropertydetails() throws FileNotFoundException,
 * IOException { Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all() .get(Endpoints.propertydetails).andReturn();
 * ResponseBody body= response.getBody(); logger.info("Status code is: " +
 * response.getStatusCode()); logger.info("Response time is: " +
 * response.getTime()); logger.info("Response body is: " +
 * body.asPrettyString()); logger.info("Status line is: " +
 * response.getStatusLine()); logger.info("Content type is: " +
 * response.getHeader("content-type")); assertEquals(response.getStatusCode(),
 * 200); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test
 * 
 * public void testUpdateProperty() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updateproperty
 * ,Config.getpropertyID()).then().statusCode(200).log().all(); }
 * //---------------------------------------------------------------------------
 * -----------------------//
 * 
 * @Test public void testDeleteProperty() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "authorization",
 * "bearer " +Config.getToken())
 * .contentType(ContentType.JSON).log().all().when().delete(Endpoints.
 * deleteproperty, Config.getpropertyID()) .then().statusCode(403).log().all();
 * }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testAddZone() throws FileNotFoundException, IOException {
 * 
 * given().header("Authorization", "bearer " + Config.getToken(), "accept",
 * "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when()
 * .post(Endpoints.addzone).then().statusCode(400).log().all();
 * 
 * }
 * //---------------------------------------------------------------------------
 * -----------------------//
 * 
 * @Test public void testGetZones() throws FileNotFoundException, IOException {
 * Response response = given() .headers("Authorization", "bearer " +
 * Config.getToken(), "accept", "application/json").log().all()
 * .get(Endpoints.zoneinproperty, Config.getpropertyID()).andReturn();
 * ResponseBody body = response.getBody(); logger.info("Status code is: " +
 * response.getStatusCode()); logger.info("Response time is: " +
 * response.getTime()); logger.info("Response body is: " +
 * body.asPrettyString()); logger.info("Status line is: " +
 * response.getStatusLine()); logger.info("Content type is: " +
 * response.getHeader("content-type")); assertEquals(response.getStatusCode(),
 * 200); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test
 * 
 * public void testUpdateZone() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updatezone ,
 * Config.getzoneID()).then().statusCode(400).log().all(); }
 * //---------------------------------------------------------------------------
 * -------------------//
 * 
 * @Test public void testDeleteZone() throws FileNotFoundException, IOException
 * { given().headers("accept", "application/json", "authorization", "bearer "
 * +Config.getToken())
 * .contentType(ContentType.JSON).log().all().when().delete(Endpoints.deletezone
 * ,Config.getzoneID()) .then().statusCode(400).log().all(); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testAddDevices() throws FileNotFoundException, IOException
 * {
 * 
 * given().header("Authorization", "bearer " + Config.getToken(), "accept",
 * "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when()
 * .post(Endpoints.Adddevicestozone).then().statusCode(400).log().all();}
 * //---------------------------------------------------------------------------
 * -------------------//
 * 
 * @Test public void testGetDevices() throws FileNotFoundException, IOException
 * { Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all() .get(Endpoints.alldevicesforproperty,
 * Config.getpropertyID()).andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 200); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test
 * 
 * public void testUpdateDevices() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updatedeviceename ,
 * Config.getdeviceID()).then().statusCode(400).log().all(); }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testDeleteDevice() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "authorization",
 * "bearer " + Config.getToken())
 * .contentType(ContentType.JSON).log().all().when()
 * .delete(Endpoints.deletedevicesforzone) .then().statusCode(400).log().all();
 * 
 * }
 * //---------------------------------------------------------------------------
 * --------------//
 * 
 * @Test public void testAddSmartthingAccount() throws FileNotFoundException,
 * IOException { given().header("Authorization", "bearer " + Config.getToken(),
 * "accept", "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when().post(
 * Endpoints.addsmartthingaccount).then() .statusCode(400).log().all(); }
 * //---------------------------------------------------------------------------
 * ----------------//
 * 
 * 
 * @Test
 * 
 * 
 * public void testViewSmartthingDetails() throws FileNotFoundException,
 * IOException { Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all() .get(Endpoints.getsmartthingaccountdeails,
 * Config.getpropertyID()).andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 200); }
 * 
 * //---------------------------------------------------------------------------
 * -----------------------------//
 * 
 * @Test
 * 
 * public void testUpdatePAT() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.UpdatePAT
 * ).then().statusCode(400).log().all(); }
 * //---------------------------------------------------------------------------
 * ---------------------------------//
 * 
 * @Test public void testDeleteSmartthing() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "authorization",
 * "bearer " + Config.getToken())
 * .contentType(ContentType.JSON).log().all().when() .delete(Endpoints.
 * deletesmartthing,Config.getprotocolId()) .then().statusCode(400).log().all();
 * 
 * }
 * //---------------------------------------------------------------------------
 * -------------------------------//
 * 
 * @Test public void testCreateGuestKey() throws FileNotFoundException,
 * IOException {
 * 
 * given().header("Authorization", "bearer " + Config.getToken(), "accept",
 * "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when()
 * .post(Endpoints.createguestkey).then().statusCode(201).log().all(); }
 * //---------------------------------------------------------------------------
 * -----------------------------------------------//
 * 
 * @Test public void viewGuestKey() throws FileNotFoundException, IOException {
 * Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all()
 * .get(Endpoints.viewguestkey,Config.getpropertyID(),Config.gettype()).
 * andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 200); }
 * //---------------------------------------------------------------------------
 * -----------------------------------------------//
 * 
 * @Test public void testDeleteGuestKey() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "authorization",
 * "bearer " + Config.getToken())
 * .contentType(ContentType.JSON).log().all().when() .delete(Endpoints.
 * deleteguestkey,Config.getkeyId()) .then().statusCode(200).log().all();
 * 
 * }
 * //---------------------------------------------------------------------------
 * -----------------------------------------------//
 * 
 * @Test
 * 
 * public void regeneratekey() throws FileNotFoundException, IOException {
 * given().headers("accept", "application/json", "Authorization", "bearer " +
 * Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString())
 * .when().put(Endpoints.regeneraterequestkey,Config.getkeyIDs()).then().
 * statusCode(200); }
 * 
 * //---------------------------------------------------------------------------
 * -----------------------------------------------//
 * 
 * @Test public void testResendkeycode() throws FileNotFoundException,
 * IOException { Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all() .get(Endpoints.resendkeycode,
 * Config.getkeyId()).andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 400); }
 * //---------------------------------------------------------------------------
 * -------------------------------------------------//
 * 
 * @Test
 * 
 * public void testUpdateGuestDetails() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "Authorization",
 * "bearer " + Config.getToken()) .contentType(ContentType.JSON).log().all()
 * .body(request.toJSONString()).when().put(Endpoints.updateguest,Config.
 * getkeyId() ).then().statusCode(200).log().all(); }
 * //---------------------------------------------------------------------------
 * -----------------------------------------------//
 * 
 * @Test public void testCreateStaffKey() throws FileNotFoundException,
 * IOException {
 * 
 * given().header("Authorization", "bearer " + Config.getToken(), "accept",
 * "application/json")
 * .contentType(ContentType.JSON).body(request.toJSONString()).when()
 * .post(Endpoints.createStaffkey).then().statusCode(201).log().all(); }
 * //---------------------------------------------------------------------------
 * -------------------------//
 * 
 * @Test public void viewStaffKey() throws FileNotFoundException, IOException {
 * Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all()
 * .get(Endpoints.viewstaffkey,Config.getpropertyID(),Config.gettype()).
 * andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 200); }
 * //---------------------------------------------------------------------------
 * ------------------------------------//
 * 
 * @Test public void testResendStaffkeycode() throws FileNotFoundException,
 * IOException { Response response =
 * given().headers("Authorization","bearer "+Config.getToken(), "accept"
 * ,"application/json").log().all() .get(Endpoints.resendstaffkeycode,
 * Config.getkeyId()).andReturn(); ResponseBody body= response.getBody();
 * logger.info("Status code is: " + response.getStatusCode());
 * logger.info("Response time is: " + response.getTime());
 * logger.info("Response body is: " + body.asPrettyString());
 * logger.info("Status line is: " + response.getStatusLine());
 * logger.info("Content type is: " + response.getHeader("content-type"));
 * assertEquals(response.getStatusCode(), 400); }
 * //---------------------------------------------------------------------------
 * ---------------------------------------//
 * 
 * @Test public void testDeleteStaffKey() throws FileNotFoundException,
 * IOException { given().headers("accept", "application/json", "authorization",
 * "bearer " + Config.getToken())
 * .contentType(ContentType.JSON).log().all().when() .delete(Endpoints.
 * deletestaffkey,Config.getkeyId()) .then().statusCode(200).log().all();
 * 
 * }
 * 
 * }
 * 
 */