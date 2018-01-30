package com.qwt.webservice.coupled;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8888/ns?wsdl");
		QName qname = new QName("http://coupled.webservice.qwt.com/", "MyServiceImplService");
		
		Service service = Service.create(url, qname);
		
		IMyService ms = service.getPort(IMyService.class);
		
		System.out.println(ms.minus(11, 2));
		
	}

}
