package com.qwt.webservice.soapmessage;

import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPFaultException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Wentao Qian on 2/1/2018.
 */
public class TestSoap03 {

    private static final String wsdlUrl = "http://localhost:8888/ns?wsdl";
    private static final String ns = "https://www.qwt.com";

    @Test
    public void testSoap03() {
        try {
            URL url = new URL(wsdlUrl);
            QName qName = new QName(ns, "MyServiceImplService");
            Service service = Service.create(url, qName);

            //注意这里在new QName的时候，一定要指定我们自己定义的namespace，即命名空间，否则程序就找不到我们想要的元素
            Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns,"MyServiceImplPort"),
                    SOAPMessage.class, Service.Mode.MESSAGE);

            SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
            SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
            SOAPBody soapBody = soapEnvelope.getBody();

            QName ename = new QName(ns, "login", "nn");//<nn:add xmlns="ns">

            SOAPBodyElement soapBodyElement = soapBody.addBodyElement(ename);
            soapBodyElement.addChildElement("username").setValue("abc");
            soapBodyElement.addChildElement("password").setValue("12345");

            soapMessage.writeTo(System.out);

            System.out.println("\n invoking...");

            SOAPMessage response = dispatch.invoke(soapMessage);
            response.writeTo(System.out);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (SOAPFaultException e) {
            System.out.println(e.getMessage());
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
