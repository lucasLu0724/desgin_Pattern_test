package ClassLoader;

import java.util.ArrayList;
import java.util.List;

public class GrandsonClassLoader extends SonClassLoader {
    private List<String> clazzList = new ArrayList<String>(){
        {this.add("e.class");
            this.add("f.class");
        }

    };

    @Override
    public boolean getLoader(String className) {
        if(super.getLoader(className)){
            return true;
        }else if(clazzList.contains(className)){
            System.out.println("GrandsonClassLoader got it");
            return true;
        }else{
            return false;
        }
    }
}
