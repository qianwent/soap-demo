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
		//TODO Ŀǰ�������û�иĽӿڣ���ô����Ҫ��������client������һ����Ҫ�Ľӿڣ�����ô���أ�
		User user = new User();
		user.setID(ID);
		user.setUsername("user" + ID);
		user.setPassword("defaultpwd");
		return user;
	}

}
