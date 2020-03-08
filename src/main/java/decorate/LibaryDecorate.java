package decorate;

import java.util.List;

public class LibaryDecorate extends ToolBarDecorate {


    public LibaryDecorate(IToolBar iToolBar) {
        super(iToolBar);
        super.getToolBar().add("题库");
    }

    @Override
    public List<String> getToolBar() {
        return super.getToolBar();
    }
}

