package com.qwt.webservice.server.handler;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by Wentao Qian on 2/2/2018.
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        System.out.println("handler");
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        System.out.println("error");
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
