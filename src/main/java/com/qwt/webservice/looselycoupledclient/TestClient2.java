package com.qwt.webservice.looselycoupledclient;

/**
 * Created by Wentao Qian on 1/30/2018.
 */
public class TestClient2 {

    public static void main(String[] args) {
        //���ַ�ʽ�Ա�TestClient����ķ�ʽ�����ӿ��ټ��
        MyServiceImplService myServiceImplService = new MyServiceImplService();
        IMyService myService = myServiceImplService.getMyServiceImplPort();
        System.out.println(myService.add(1,2));
    }

}
