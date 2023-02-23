package com.dt.api.main;

public class Endpoints {

	public static final String baseURI = "https://api-qa.dthreaddev.com";
	// GET//
	// *********Users*****************//
	public static final String userdetails = "/api/users/details/{email}";
	public static final String userInvites = "/api/users/invites";
	public static final String userdetails_userrole = "/api/userroles/{propertyId}/{emailId}/{isActive}";
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
	public static final String Adddevicestozone = "/api/devices/";
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
//<<<<<<< HEAD
	// *************SmartThings********************//
	public static final String smartThingsdevices = "/api/smartthings/devices/{propertyId}/{cloudEmailId}";
	public static final String getaccountofanuser = "/api/smartthings/accounts/{propertyId}";
	public static final String accountdetails = "/api/smartthings/accounts/{propertyId}/{cloudEmailId}";
	// *************PropertyTokens********************//
	public static final String getTokenforproperty = "/api/propertytoken/{propertyId}";
	// *************Schedule********************//
	public static final String minandmaxintervals = "/api/schedule/interval/{deviceType}";
	public static final String getlockmonitoringinterval = "/api/schedule/{deviceId}";
	// *************KeyRequest********************//
	public static final String getrequestkeysforguestorstaff = "/api/keyrequest/{propertyId}/{type}";
	public static final String getdetailforrequestkeysforguestorstaff = "/api/keyrequest/detail/{keyId}";
	// *************Collection********************//
	public static final String collectionsinaproperty = "/api/collection/property/{propertyId}";
	public static final String getalldevicesandzonesinacollection = "/api/collection/{collectionId}";
//>>>>>>> 01779337959a101ea50d1eba4f3ab2fc233e8fb3

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
	// *********SmartThings*****************//
	public static final String deletecloudaccount = "/api/smartthings/{protocolId}";
	// *************PropertyTokens********************//
	public static final String deleteTokenforproperty = "/api/propertytoken/";
	// *************KeyRequest********************//
	public static final String deletekeyforguestorstaff = "/api/keyrequest/{keyId}";
	// *************Collection********************//
	public static final String deletecollection = "/api/collection/{collectionId}";
	public static final String removezonesandDevicesfromcollection = "/api/collection/removeZonesAndDevices/{collectionId}";

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
	// *********smartThings*****************//
	public static final String savePATforcloudaccount = "/api/zones";
	// *************PropertyTokens********************//
	public static final String generateTokenforproperty = "/api/propertytoken";
	// *************PMSkeyrequest********************//
	public static final String createguestkeyrequest = "/api/pmskeyrequest";
	// *************Schedule********************//
	public static final String setlockmonitoringinterval = "/api/schedule";
	// *********KeyRequest*****************//
	public static final String sendcodestolockguestorboth = "/api/keyrequest/resend/{keyId}";
	public static final String getlocklistbycode = "/api/keyrequest/lockList";
	public static final String getlockreport = "/api/keyrequest/lockReport";
	public static final String createkeyrequestforguestorstaff = "/api/keyrequest/create";
	// *************Collection********************//
	public static final String createcollection = "/api/collection";

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
//<<<<<<< HEAD
//<<<<<<< HEAD
	public static final String renamedevice1= "/api/devices/{deviceId}";
	public static final String updateuserrole = "/api/userroles/{propertyId}";
	public static final String updatedeviceename= "/api/devices/{deviceId}";
	//------------------------------------------------------------------------------------------------------------------//
	// *************Smartthing********************//
	public static final String addsmartthingaccount= "/api/smartthings";
	public static final String getsmartthingaccountdeails= "/api/smartthings/accounts/{propertyId}";
	public static final String UpdatePAT= "/api/smartthings";
	public static final String deletesmartthing= "/api/smartthings/{protocolId}";
	public static final String updateuserdetails= "/api/users/{email}";
	
	//------------------------------------------------------------------------------------------------------------------//
	// *************GUEST KEY Request********************//
	public static final String createguestkey= "/api/keyrequest/create";
	public static final String viewguestkey= "/api/keyrequest/{propertyId}/{type}/summary";
	public static final String regeneraterequestkey= "/api/keyrequest/{keyId}/update";
	public static final String deleteguestkey= "/api/keyrequest/{keyId}";
	public static final String resendkeycode= "/api/keyrequest/{keyId}/resend";
	public static final String updateguest= "/api/keyrequest/{keyId}/update-guest";
	
	//------------------------------------------------------------------------------------------------------------------//
		// *************STAFF KEY Request********************//
	public static final String createStaffkey= "/api/keyrequest/create";
	public static final String viewstaffkey= "/api/keyrequest/{propertyId}/{type}/summary";
	public static final String regeneraterequestaffkey= "\"/api/keyrequest/{keyId}/update";
	public static final String deletestaffkey= "/api/keyrequest/{keyId}";
	public static final String resendstaffkeycode="/api/keyrequest/{keyId}/resend";
	
	public static final String viewmykeydetails= "/api/keyrequest/{propertyId}/my-key";
	

	public static final String renamedevice = "/api/devices/{deviceId}";
	// *********UserRole*****************//
	public static final String updateuserRole = "/api/userroles/{propertyId}";
	// *********SmartThings*****************//
	public static final String updatePAT = "/api/userroles/{propertyId}";
	// *********KeyRequest*****************//
	public static final String updateguestdetails = "/api/keyrequest/{keyId}/update-guest";
	public static final String requestgeneratekeyforguestorstaff = "/api/keyrequest/{keyId}/update";
	public static final String updatekeytimerequestforguestorstaff = "/api/keyrequest/{keyId}/update-time";
	public static final String expirekeyforguestorstaff = "/api/keyrequest/{keyId}/expire";
	public static final String reactivekeyforguestorstaff = "/api/keyrequest/{keyId}/reactivate";
	// *********Collection*****************//
	public static final String renamecollection = "/api/collection/{collectionId}";
	public static final String addDevicesandzonestoacollection = "/api/collection/updatezonesordevices/{collectionId}";

	
	// *************MASTER CODES ********************//
	public static final String generateMasterCode = "/api/mastercode";
	public static final String regenerateMasterCode = "/api/mastercode/{masterCodeId}/regenerate";
	public static final String viewMasterCode = "/api/mastercode/{propertyId}/all";
	public static final String deletemasterCode= "/api/mastercode";
	
//>>>>>>> 01779337959a101ea50d1eba4f3ab2fc233e8fb3
}


	
	// *********UserRole*****************//
	//public static final String updateuserRole = "/api/userroles/{propertyId}";
	
//c5894a01452583338382fe5cfcbda8788ea89e1c