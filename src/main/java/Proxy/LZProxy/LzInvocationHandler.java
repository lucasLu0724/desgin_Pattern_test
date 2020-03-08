package Proxy.LZProxy;

import java.lang.reflect.Method;

public interface LzInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}

