package pojo;

public class PdProxy implements Rent{

    private static Proxy proxy;

    static{proxy = new Proxy();}

    @Override
    public void rent() {
        proxy.setHost(new Host());
        log("rent");
        proxy.rent();
    }

    public void log(String msg){
        System.out.println("使用了"+ msg +"的方法");
    }
}
