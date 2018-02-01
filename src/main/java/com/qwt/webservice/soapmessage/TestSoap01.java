package com.qwt.webservice.soapmessage;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;

/**
 * Created by Wentao Qian on 2/1/2018.
 */
public class TestSoap01 {

    public static void main(String[] args) {
        try {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
            SOAPBody soapBody = soapEnvelope.getBody();
            QName qName = new QName("http://server.webservice.qwt.com/webservice",
                    "add", "ns");
//            soapBody.addBodyElement(qName).setValue("test");
            SOAPBodyElement soapBodyElement = soapBody.addBodyElement(qName);
            soapBodyElement.addChildElement("a").setValue("11");
            soapBodyElement.addChildElement("b").setValue("22");
            soapMessage.writeTo(System.out);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
