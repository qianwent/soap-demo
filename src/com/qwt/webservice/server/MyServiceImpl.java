package com.qwt.webservice.server;

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

}
