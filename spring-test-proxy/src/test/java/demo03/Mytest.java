package demo03;

import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        Host host = new Host();
        ProxyInvocation pi = new ProxyInvocation();
        pi.setTarget(host);
        Rent proxy = (Rent) pi.getProxy();
        proxy.rent();
//        aop.Host host = new Host();
//        aop.ProxyInvocation pi = new ProxyInvocation();
//        pi.setRent(host);
//        aop.Rent proxy = (Rent) pi.getProxy();
//        proxy.rent();
    }
}
