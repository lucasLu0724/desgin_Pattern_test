package ClassLoader;

import java.util.ArrayList;
import java.util.List;

public class FatherClassLoader implements IClassLoader {
    List<String> clazzList = new ArrayList<String>(){
        {
            this.add("a.class");
            this.add("b.class");

        }
    };

    @Override
    public boolean getLoader(String className) {
        boolean result = this.clazzList.contains(className);
        if(result){
            System.out.println("FatherClassLoader got it ");
            return true;
        }else{
            return false;
        }

    }
}
