package com.dt.api.main;

public class Endpoints {

	public static final String baseURI="https://api-qa.dthreaddev.com";
	  //GET//
		 public static final String userdetails = "/api/users/details/{email}";
		 public static final String userInvites = "/api/users/invites";
		 //DELETE//
		 public static final String deleteuser = "/api/users/{email}/{propertyId}";
		 //POST//
		 public static final String setnewpassword = "/api/users/updatepassword";
		 public static final String sendotpmail = "/api/users/forgetpassword";
		 public static final String inviteuser = "/api/users/invitation";
		 public static final String resenduserinvite = "/api/users/resendinvitation";
		 public static final String cancelinvite = "/api/users/cancelinvitation";
		 public static final String registeruser = "/api/users/";
		 public static final String verifyinvite = "/api/users/verifyinvitation";
		 public static final String acceptinvite = "/api/users/acceptinvitation";
		 public static final String veriifyforgotpasswordotp = "/api/users/verifyotp";
		 //PUT//
		 public static final String updateuserdetail = "/api/users/{email}";
		 
	
}
