//package Proxy.LZProxy;
//import java.lang.reflect.*;
//import Proxy.JDKProxy.IService;
//public class $Proxy0 implements Proxy.JDKProxy.IService{
//    LzInvocationHandler h ;
//    public $Proxy0(LzInvocationHandler h){
//        this.h = h;
//    }
//    public void checkCount(java.lang.String String,java.lang.Integer Integer){
//        try{
//            Method m1 = Proxy.JDKProxy.IService.class.getMethod("checkCount" ,new Class[]{java.lang.String.class,java.lang.Integer.class});
//            h.invoke(this,m1,new Object[]{String,Integer});
//        }catch(Exception e){
//            e.printStackTrace();
//        }catch(Throwable Throwable){
//            Throwable.printStackTrace();
//        }
//    }}