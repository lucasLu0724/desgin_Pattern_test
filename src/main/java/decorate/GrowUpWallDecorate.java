package decorate;

import java.util.List;

public class GrowUpWallDecorate extends ToolBarDecorate {
    public GrowUpWallDecorate(IToolBar iToolBar) {
        super(iToolBar);
        super.getToolBar().add("成长墙");
    }

    @Override
    public List<String> getToolBar() {
        return super.getToolBar();
    }
}
