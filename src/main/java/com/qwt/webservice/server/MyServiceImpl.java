package com.qwt.webservice.server;

import com.qwt.webservice.server.exception.UserException;
import com.qwt.webservice.server.model.User;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebService(endpointInterface= "com.qwt.webservice.server.IMyService", targetNamespace = "https://www.qwt.com")
@HandlerChain(file= "handler-chain.xml")
public class MyServiceImpl implements IMyService {

	private static List<User> userList = new ArrayList<>();

	public MyServiceImpl() {
		userList.add(new User("123", "abc", "12345"));
	}

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

	@Override
	public User addUser(User user) {
		userList.add(user);
		return user;
	}

	@Override
	public User login(String username, String password) throws UserException{
		return userList.stream()
				.filter(Objects::nonNull)
				.filter(user -> Objects.nonNull(user.getUsername()) && Objects.nonNull(user.getPassword())
						&& user.getUsername().equals(username) && user.getPassword().equals(password))
				.findFirst().orElseThrow(()->new UserException("User does not exist! \n"));
	}

	@Override
	public List<User> list(String authInfo) {
		return userList;
	}

}
