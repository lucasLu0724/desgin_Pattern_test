package SingleTon;

import java.util.ArrayList;
import java.util.List;

public class HungrySingleton {

    static  HungrySingleton item = new HungrySingleton();
    List<String> list = new ArrayList<String>();

    private HungrySingleton(){}

    public static HungrySingleton getItem() {
        return item;
    }
}
