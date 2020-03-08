package Proxy.Reflact;

import Proxy.LZProxy.LzProxy;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //练习反射

        System.out.println(LzProxy.class.getSimpleName());
        Method [] methods = LzProxy.class.getMethods();
        for(Method m:methods){
            System.out.println(m.getName());
            Class[] clzzList =m.getParameterTypes();
            for (Class clzz:clzzList) {
                System.out.println("---"+clzz.getName());
            }
        }
    }
}
