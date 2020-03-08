package Proxy.LZProxy;

import Proxy.JDKProxy.IService;
import Proxy.JDKProxy.ServiceImpl;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LzProxy {

    public static final String ln ="\n\r";
    //构建代理类
    public static Object newProxyInstance(LzClassLoader loader,
                                          Class<?>[] interfaces,
                                          LzInvocationHandler h){
            //1.生成源码
            String src = generateSrouce(interfaces);
            //2.输出到磁盘
            File f = WriteToDisk(src);
            //3.把.java变成.class(编)
            CompilerFile(f);
            //4.加载到JVM
            Object returnValue = loadToJVM(loader,h);
            return returnValue;
    }

    public static Object loadToJVM(LzClassLoader loader,LzInvocationHandler h) {
        Class proxyClass = null;
        try {
            proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(LzInvocationHandler.class);
            return c.newInstance(h);

        } catch (Exception e) {
            e.printStackTrace();
        }
            return null;

    }

    private static void CompilerFile(File file) {

        try {
         //1.获取java编译器
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        //2.获取文件管理器
        StandardJavaFileManager manager =  compiler.getStandardFileManager(null,null ,null );
        //3.获取java对象
        Iterable t = manager.getJavaFileObjects(file);
        //4.加载任务
        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, t);
        //5.执行
        task.call();
        manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static File WriteToDisk(String src) {
        try {
            String filePath = LzProxy.class.getResource("").getPath();
            File file = new File(filePath+"$Proxy.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }
            return  null;

    }

    private static String generateSrouce(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package Proxy.LZProxy;"+ln);
        sb.append("import java.lang.reflect.*;"+ln);
        sb.append("import "+interfaces[0].getName()+";"+ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);
                sb.append("LzInvocationHandler h ;"+ln);
                sb.append("public $Proxy0(LzInvocationHandler h){"+ln);
                    sb.append("this.h = h;"+ln);
                sb.append("}"+ln);
                //遍历获取方法
        Method []  methods =interfaces[0].getMethods();
        int i=1;
        for(Method m :methods){
            //参数值
            StringBuilder ParamValue = new StringBuilder();
            //参数名称
            StringBuilder ParamName = new StringBuilder();
            //参数类型
            StringBuilder ParamClass =new StringBuilder();
            //eg:public void Method(String name,String name2)

            Class[] clazzlist = m.getParameterTypes();
            for(int index=0;index<clazzlist.length;index++){
                Class clzz =clazzlist[index];
                StringBuilder type =new StringBuilder(clzz.getName());
                StringBuilder clzzName = new StringBuilder(clzz.getSimpleName());
                ParamName.append(type+" "+clzzName);
                ParamClass.append(clzz.getName()+".class");
                ParamValue.append(clzz.getSimpleName());

                if(index>=0&&index<(clazzlist.length-1)){
                    ParamClass.append(",");
                    ParamName.append(",");
                    ParamValue.append(",");

                }
                System.out.println("获取的参数类型为"+ParamClass);
            }
            sb.append("public "+m.getReturnType()+" "+m.getName()+"("+ParamName.toString()+"){"+ln);
                sb.append("try{"+ln);
                    sb.append("Method m"+i+" = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\" ,new Class[]{"+ParamClass.toString()+"});"+ln);
                    // invoke(Object proxy, Method method, Object[] args)
                    sb.append("h.invoke(this,m"+i+",new Object[]{"+ParamValue+"});"+ln);
                sb.append("}catch(Exception e){"+ln);
                    sb.append("e.printStackTrace();"+ln);
                sb.append("}catch(Throwable Throwable){"+ln);
                    sb.append("Throwable.printStackTrace();"+ln);
                sb.append("}"+ln);
            sb.append("}");
        }

        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateSrouce(ServiceImpl.class.getInterfaces()));

    }



}
