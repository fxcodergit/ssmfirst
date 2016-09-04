package com.bestpay.skynet.mockerplatform.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bestpay.skynet.mockerplatform.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/Spring/applicationContext.xml")
public class AppTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testcase() {
		User userModel = new User();
		userModel.setId(100L);
		userModel.setName("maliang");
		userService.addUserModelInfo(userModel);
	}
}
