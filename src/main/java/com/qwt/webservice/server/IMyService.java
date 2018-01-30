package com.qwt.webservice.server;

import com.qwt.webservice.server.model.User;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IMyService {

	@WebResult(name = "addResult")
	int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

	@WebResult(name = "minusResult")
	int minus(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

	@WebResult(name = "userResult")
	User getUser(@WebParam(name = "userId") String ID);

}
