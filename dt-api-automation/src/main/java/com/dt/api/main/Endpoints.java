package com.dt.api.main;

public class Endpoints {

	public static final String baseURI = "https://api-qa.dthreaddev.com";
	//GET//
	//*********Users*****************//
	public static final String userdetails = "/api/users/details/{email}";
	public static final String userInvites = "/api/users/invites";
	//*********properties*****************//
	public static final String propertybyID = "/api/properties/{propertyId}";
	public static final String propertydetails = "/api/properties/";
	public static final String issuecountsforallproperties = "/api/properties/issues";
	public static final String rooms = "/api/properties/{propertyId}/rooms";
	public static final String propertyallusers = "/api/properties/{propertyId}/users";
	public static final String propertytype = "/api/properties/type";
	public static final String usstatelist = "/api/properties/us-states";
	
	// DELETE//
	//*********Users*****************//
	public static final String deleteuser = "/api/users/{email}/{propertyId}";
	//*********properties*****************//
	public static final String deleteproperty = "/api/properties/{propertyId}";
	
	// POST//
	//*********Users*****************//
	public static final String setnewpassword = "/api/users/updatepassword";
	public static final String sendotpmail = "/api/users/forgetpassword";
	public static final String inviteuser = "/api/users/invitation";
	public static final String resenduserinvite = "/api/users/resendinvitation";
	public static final String cancelinvite = "/api/users/cancelinvitation";
	public static final String registeruser = "/api/users/";
	public static final String verifyinvite = "/api/users/verifyinvitation";
	public static final String acceptinvite = "/api/users/acceptinvitation";
	public static final String veriifyforgotpasswordotp = "/api/users/forgetpassword";
	//*********properties*****************//
	public static final String addproperty = "/api/properties/";
	public static final String filterusers = "/api/properties/{propertyId}/filter-users";
	public static final String togglefavourite = "/api/properties/toggle-favourite";

	// PUT//
	//*********Users*****************//
	public static final String updateuserdetail = "/api/users/{email}";
	//*********properties*****************//
	public static final String updateproperty = "/api/properties/{propertyId}";

}
