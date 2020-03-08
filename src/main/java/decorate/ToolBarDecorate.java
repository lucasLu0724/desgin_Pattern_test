package decorate;

import java.util.List;

public class ToolBarDecorate implements IToolBar {
    private  IToolBar iToolBar ;
    ToolBarDecorate(IToolBar iToolBar){
        this.iToolBar = iToolBar;
    }


    @Override
    public List<String> getToolBar() {
        return iToolBar.getToolBar();
    }
}
