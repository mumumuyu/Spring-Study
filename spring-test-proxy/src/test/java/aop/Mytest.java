package aop;

import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        Host host = new Host();
        ProxyInvocation pi = new ProxyInvocation();
        pi.setRent(host);
        Rent proxy = (Rent) pi.getProxy();
        proxy.rent();
    }
}
