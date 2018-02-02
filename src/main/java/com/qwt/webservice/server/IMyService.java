package com.qwt.webservice.server;

import com.qwt.webservice.server.model.User;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "www.qwt.com")
//���ֻ���������targetNamespace������ʵ������ָ����
// ����wsdl������<import namespace="www.qwt.com" location="http://localhost:8888/ns?wsdl=1"/>
// ��targetNamespace="http://server.webservice.qwt.com/" ��Ȼ�õ���ʵ����İ���
// ���Ի�����ʵ������ָ��targetNamespace="www.qwt.com"
public interface IMyService {

	@WebResult(name = "addResult")
	int add(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

	@WebResult(name = "minusResult")
	int minus(@WebParam(name = "a") int a, @WebParam(name = "b") int b);

	@WebResult(name = "userResult")
	User getUser(@WebParam(name = "userId") String ID);

	@WebResult(name = "user")//it's better to use user as result name, since it's easy for converting between xml and java object
	User addUser(@WebParam(name = "user") User user);

	@WebResult(name = "user")
	User login(@WebParam(name = "username") String username, @WebParam(name = "password") String password);

	@WebResult(name = "user")
	List<User> list(@WebParam(header=true, name = "authInfo") String authInfo);

}
