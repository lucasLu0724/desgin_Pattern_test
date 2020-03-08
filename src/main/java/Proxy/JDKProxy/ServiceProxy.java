package Proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {
    private IService target ;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       before();
       Object  returnValue = method.invoke(target,args);
       after();
       return returnValue;
    }

    private void after() {
        System.out.println("记录行为:注销");
    }

    public   Object getInstance(IService target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    private  void before(){
        System.out.println("记录行为:登录");

    }
}
