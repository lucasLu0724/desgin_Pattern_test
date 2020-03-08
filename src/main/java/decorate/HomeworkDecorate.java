package decorate;

import java.util.List;

public class HomeworkDecorate extends ToolBarDecorate {
    public HomeworkDecorate(IToolBar iToolBar) {
        super(iToolBar);
        super.getToolBar().add("作业");
    }



    @Override
    public List<String> getToolBar() {
        return super.getToolBar();
    }
}
