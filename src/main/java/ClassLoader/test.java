package ClassLoader;

public class test {
    public static void main(String[] args) {
        IClassLoader cl = new GrandsonClassLoader();
        cl.getLoader("e.class");
        System.out.println("finish");
    }
}
