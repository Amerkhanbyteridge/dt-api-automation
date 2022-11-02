package com.dt.api.main;

public class Endpoints {

	public static final String baseURI = "https://api-qa.dthreaddev.com";
	// GET//
	// *********Users*****************//
	public static final String userdetails = "/api/users/details/{email}";
	public static final String userInvites = "/api/users/invites";
	// *********properties*****************//
	public static final String propertybyID = "/api/properties/{propertyId}";
	public static final String propertydetails = "/api/properties/";
	public static final String issuecountsforallProperties = "/api/properties/issues";
	public static final String rooms = "/api/properties/{propertyId}/rooms";
	public static final String propertyallusers = "/api/properties/{propertyId}/users";
	public static final String propertytype = "/api/properties/type";
	public static final String usstatelist = "/api/properties/us-states";
	// *************Zones********************//
	public static final String zoneinproperty = "/api/zones/{propertyId}";
	public static final String zonecountinproperty = "/api/zones/{propertyId}/summary";
	public static final String recentzonesinproperty = "/api/zones/{propertyId}/recent";
	public static final String childzones = "/api/zones/{zoneId}/sub-zones";
	public static final String zonestype = "/api/zones/types";
	// *************Devices********************//
	public static final String alldevicesforzone = "/api/devices/zone/{zoneId}";
	public static final String alldevicesforproperty = "/api/devices/property/{propertyId}";
	public static final String issuecountsforproperty = "/api/devices/property/{propertyId}/issue/count";
	public static final String issuesforproperty = "/api/devices/property/{propertyId}/issues";
	public static final String issuescountforzones = "/api/devices/{propertyId}/{zoneId}/issue/count";
	public static final String devicebatterystatus = "/api/devices/{deviceId}/battery-status";
	public static final String deviceactivity = "/api/devices/{propertyId}/{zoneId}/issue/count";
	public static final String lockstatusfromsmartThings = "/api/devices/{deviceId}/lock-status";
	// *************HubDevices********************//
	public static final String allhubdevices = "/api/hubdevices/";
	public static final String hubdevicebyID = "/api/hubdevices/{id}";
	// *************Activity********************//
	public static final String useractivityinproperty = "/api/activities/{propertyId}/{emailId}";
	public static final String useractivity = "/api/activities/{emailId}";
	// **************Role***********************//
	public static final String allroles = "/api/roles/{roleType}";
	// **************UserRole***********************//
	public static final String userdetails_role = "/api/userroles/{propertyId}/{emailId}/{isActive}";
	// *************SignedURL********************//
	public static final String imageuploadURLforproperty = "/api/signedurl/property";
	public static final String imageuploadURLforprofile = "/api/signedurl/profile/";

//------------------------------------------------------------------------------------------------------------------//		
	// DELETE//
	// *********Users*****************//
	public static final String deleteuser = "/api/users/{email}/{propertyId}";
	// *********properties*****************//
	public static final String deleteproperty = "/api/properties/{propertyId}";
	// *********ZOnes*****************//
	public static final String deletezone = "/api/zones/{zoneId}";
	// *********Devices*****************//
	public static final String deletedevicesforzone = "/api/devices/";
//------------------------------------------------------------------------------------------------------------------//
	// POST//
	// *********Users*****************//
	public static final String setnewpassword = "/api/users/updatepassword";
	public static final String sendotpmail = "/api/users/forgetpassword";
	public static final String inviteuser = "/api/users/invitation";
	public static final String resenduserinvite = "/api/users/resendinvitation";
	public static final String cancelinvite = "/api/users/cancelinvitation";
	public static final String registeruser = "/api/users/";
	public static final String verifyinvite = "/api/users/verifyinvitation";
	public static final String acceptinvite = "/api/users/acceptinvitation";
	public static final String veriifyforgotpasswordotp = "/api/users/forgetpassword";
	// *********properties*****************//
	public static final String addproperty = "/api/properties/";
	public static final String filterusers = "/api/properties/{propertyId}/filter-users";
	public static final String togglefavourite = "/api/properties/toggle-favourite";
	// *********zones*****************//
	public static final String addzone = "/api/zones";
	// *********Devices*****************//
	public static final String adddevicesforzone = "/api/devices";
	public static final String deviceaction = "/api/devices/action";
	public static final String refreshlockstatus = "/api/devices/refresh-lock";
//------------------------------------------------------------------------------------------------------------------//
	// PUT//
	// *********Users*****************//
	public static final String updateuserdetail = "/api/users/{email}";
	// *********properties*****************//
	public static final String updateproperty = "/api/properties/{propertyId}";
	// *********Zones*****************//
	public static final String updatezone = "/api/zones/{zoneId}";
	// *********Devices*****************//
	public static final String movedevices = "/api/devices"; // fromonezonetoanotherzone
	public static final String renamedevice = "/api/devices/{deviceId}";
	// *********UserRole*****************//
	public static final String updateuserRole = "/api/userroles/{propertyId}";

}
