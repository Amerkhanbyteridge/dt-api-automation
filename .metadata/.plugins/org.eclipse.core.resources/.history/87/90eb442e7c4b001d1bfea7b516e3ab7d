package com.dt.api.qa.Tests;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.qa.helpers.UserServiceHelper;
import com.dt.api.qa.models.UserDetails;
import com.dt.api.qa.models.VerifyInvite;

import io.restassured.response.Response;

public class TestUserInvites {

	private UserServiceHelper UserServiceHelper;
	
	@BeforeClass
	public void init() {
		
		UserServiceHelper = new UserServiceHelper();
	}
	
	@Test
	public void TestgetInvites() {
		
		List<UserDetails> userlist=UserServiceHelper.getAllUsers();
		assertNotNull(userlist, "User list is not empty");
		assertFalse(userlist.isEmpty(),"User list is not empty" );
		assertEquals(UserServiceHelper.userlistresponse.getStatusCode(), HttpStatus.SC_OK, "ok");
	}
}
