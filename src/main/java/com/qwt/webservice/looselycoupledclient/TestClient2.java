package com.qwt.webservice.looselycoupledclient;

/**
 * Created by Wentao Qian on 1/30/2018.
 */
public class TestClient2 {

    public static void main(String[] args) {
        //这种方式对比TestClient里面的方式，更加快速简洁
        MyServiceImplService myServiceImplService = new MyServiceImplService();
        IMyService myService = myServiceImplService.getMyServiceImplPort();
        System.out.println(myService.add(1,2));
    }

}
