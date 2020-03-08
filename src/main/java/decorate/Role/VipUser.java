package decorate.Role;

import decorate.*;

public class VipUser implements  IUser{
    private IToolBar iToolBar;
    public VipUser(){
        iToolBar = new GrowUpWallDecorate(new HomeworkDecorate(new LibaryDecorate(new BaseToolBar())));
    }

    @Override
    public void getHomePageToolBar() {
        System.out.println(iToolBar.getToolBar().toString());
    }
}
