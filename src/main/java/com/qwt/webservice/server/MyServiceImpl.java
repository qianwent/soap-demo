package com.qwt.webservice.server;

import com.qwt.webservice.server.model.User;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebService(endpointInterface= "com.qwt.webservice.server.IMyService")
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
		//TODO Ŀǰ�������û�иĽӿڣ���ô����Ҫ��������client������һ����Ҫ�Ľӿڣ�����ô���أ�
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
	public User login(String username, String password) {
		return userList.stream()
				.filter(Objects::nonNull)
				.filter(user -> Objects.nonNull(user.getUsername()) && Objects.nonNull(user.getPassword())
						&& user.getUsername().equals(username) && user.getPassword().equals(password))
				.findFirst().orElse(null);
	}

	@Override
	public List<User> list(String authInfo) {
		return userList;
	}

}
