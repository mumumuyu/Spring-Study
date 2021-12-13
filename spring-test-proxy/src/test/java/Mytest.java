import org.junit.Test;
import pojo.Host;
import pojo.PdProxy;
import pojo.Proxy;

public class Mytest {
    @Test
    public void test(){
//        Proxy proxy = new Proxy(new Host());
//        proxy.rent();
        PdProxy pdProxy = new PdProxy();
        pdProxy.rent();
    }
}
