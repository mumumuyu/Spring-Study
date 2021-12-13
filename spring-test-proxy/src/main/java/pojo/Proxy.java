package pojo;

public class Proxy implements Rent{
    private Host host;

    public Host getHost() {
        return host;
    }



    public void setHost(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seehourse();
        hetong();
    }

    public void seehourse(){
        System.out.println("中介来看房子了");
    }

    public void hetong(){
        System.out.println("中介签合同了");
    }
}
