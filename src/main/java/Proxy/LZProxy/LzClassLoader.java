package Proxy.LZProxy;

/**
 * 类加载器
 */
public class LzClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
