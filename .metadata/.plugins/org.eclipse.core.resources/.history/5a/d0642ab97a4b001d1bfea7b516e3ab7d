package com.dt.api.qa.helpers;

import io.restassured.RestAssured;
import static org.hamcrest.Matcher.*;

import java.lang.reflect.Type;
import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.fasterxml.jackson.core.type.TypeReference;
import com.dt.api.qa.constants.EndPoints;
import com.dt.api.qa.models.*;
import com.dt.api.qa.utils.ConfigManager;
import org.apache.*;

public class UserServiceHelper {

	public static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");
	public static Response userlistresponse;
	public static Response invitesresponse;
	public static RequestSpecification httprequest;
	// public static final String PORT =
	// ConfigManager.getInstance().getString("port");

	public UserServiceHelper() {

		RestAssured.baseURI = BASE_URL;
		// RestAssured.port = PORT;
		RestAssured.useRelaxedHTTPSValidation();

	}

	public List<UserDetails> getAllUsers() {

		userlistresponse = RestAssured.given().contentType(ContentType.JSON).get(EndPoints.GET_GET_USER_DETAILS)
				.andReturn();

		Type type = new TypeReference<List<UserDetails>>() {
		}.getType();
		List<UserDetails> Userlist = (List<UserDetails>) userlistresponse.as((Class<UserDetails>) type);
		return Userlist;

	}

	public List<AllInvites> getAllInvites() {

		invitesresponse = RestAssured.given().contentType(ContentType.JSON).get(EndPoints.GET_GET_INVITES).andReturn();

		Type type = new TypeReference<List<AllInvites>>() {
		}.getType();
		List<AllInvites> Invitelist = (List<AllInvites>) userlistresponse.as((Class<AllInvites>) type);
		return Invitelist;
	}

	public Response SetPassword() {
		SetNewpassword password = new SetNewpassword();
		password.setEmail("sivac@byetridge.com");
		password.setNewPassword("Pass@12345");
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(password)
				.post(EndPoints.POST_SET_NEW_PASSWORD).andReturn();

		return response;
	}

	public Response SendOtpMail() {
		SendOtpMailUser mail = new SendOtpMailUser();
		mail.setEmail("");
		mail.setAdditionalProperty("", mail);
		mail.getAdditionalProperties();
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(mail)
				.post(EndPoints.POST_SEND_OTPMAIL_TO_USER).andReturn();

		return response;
	}

	public Response Invite() {
		InviteUser invite = new InviteUser();
	    invite.setEmail("");
	    invite.setFirstName("");
	    invite.setLastName("");
	    invite.setPropertyId(1);
	    invite.setRoleId(1);
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(invite)
				.post(EndPoints.POST_INVITE_USER).andReturn();
		return response;
	}
	
	public Response ResendInvite() {
		ResendUserInvite resendinvite = new ResendUserInvite();
		resendinvite.setEmail("");
		resendinvite.setPropertyId(1);
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(resendinvite)
				.post(EndPoints.POST_RESEND_USER_INVITE).andReturn();
		return response;
	}
	public Response Register() {
		Register register = new Register();
		register.setFirstName("");
		register.setLastName("");
		register.setPassword("");
		register.setAdditionalProperty("", register);
		
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(register)
				.post(EndPoints.POST_REGISTER_USER).andReturn();
		return response;
	}
	
	public Response CancelInvite() {
		Cancel_Invite cancelinvite = new Cancel_Invite();
		cancelinvite.setEmail("");
		cancelinvite.setPropertyId(1);
		
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(cancelinvite)
				.post(EndPoints.POST_CANCEL_INVITE).andReturn();
		return response;
	}
	public Response VerifyInvite() {
		VerifyInvite verifyinvite = new VerifyInvite();
		verifyinvite.setOtp("");
		verifyinvite.setAdditionalProperty("", "");
		
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(verifyinvite)
				.post(EndPoints.POST_VERIFY_INVITE_API).andReturn();
		return response;
	}
	
	public Response ForgotpwdOTP() {
		VerifyForgetPasswordOTP forgotpwdotp = new VerifyForgetPasswordOTP();
		forgotpwdotp.setEmailID("");
		forgotpwdotp.setOtp("");
		// post call
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(forgotpwdotp)
				.post(EndPoints.POST_VERIFY_FORGOTPASSWORD_OTP).andReturn();
		return response;
	}
}