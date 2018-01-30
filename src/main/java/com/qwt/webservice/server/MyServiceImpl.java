package com.qwt.webservice.server;

import com.qwt.webservice.server.model.User;

import javax.jws.WebService;

@WebService(endpointInterface= "com.qwt.webservice.server.IMyService")
public class MyServiceImpl implements IMyService {

	@Override
	public int add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a-b));
		return a-b;
	}

	@Override
	public User getUser(String ID) {
		//TODO 目前看来如果没有改接口，那么不需要重新生成client，但是一旦需要改接口，该怎么办呢？
		User user = new User();
		user.setID(ID);
		user.setUsername("user" + ID);
		user.setPassword("defaultpwd");
		return user;
	}

}
