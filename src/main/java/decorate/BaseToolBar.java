package decorate;

import java.util.ArrayList;
import java.util.List;

public class BaseToolBar implements IToolBar {
    private List<String> value = new ArrayList<String>(){
        {
            this.add("问答");
            this.add("文章");
            this.add("精品课");
            this.add("冒泡");
            this.add("商城");
        }
    };
    @Override
    public List<String> getToolBar() {
        return value;
    }
}
