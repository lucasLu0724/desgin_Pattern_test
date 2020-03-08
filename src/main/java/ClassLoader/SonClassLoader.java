package ClassLoader;

import java.util.ArrayList;
import java.util.List;

public class SonClassLoader extends FatherClassLoader {
    private List<String> clazzList = new ArrayList<String>(){
        {this.add("c.class");
        this.add("d.class");
        }

    };

    @Override
    public boolean getLoader(String className) {
        if(super.getLoader(className)){
            return true;
        }else if(clazzList.contains(className)){
            System.out.println("SonClassLoader got it");
            return true;
        }else{
            return false;
        }
    }
}
