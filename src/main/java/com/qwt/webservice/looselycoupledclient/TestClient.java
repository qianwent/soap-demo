package com.qwt.webservice.looselycoupledclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClient {

	private static final Logger logger = LoggerFactory.getLogger(TestClient.class);

	public static void main(String[] args) throws MalformedURLException {

		logger.debug("entering into main method.");

		URL url = new URL("http://localhost:8888/ns?wsdl");
		QName qname = new QName("http://server.webservice.qwt.com/", "MyServiceImplService");
		
		Service service = Service.create(url, qname);
		
		IMyService ms = service.getPort(IMyService.class);
		
		System.out.println(ms.minus(11, 2));
		
	}

}
