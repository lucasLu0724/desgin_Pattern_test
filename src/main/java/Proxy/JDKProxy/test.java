package Proxy.JDKProxy;

public class test {
    public static void main(String[] args) {


        IService iService = new ServiceImpl();
        ServiceProxy serviceProxy = new ServiceProxy();
        IService proxy = (IService)serviceProxy.getInstance(iService);
//        proxy.checkCount();

    }
}
