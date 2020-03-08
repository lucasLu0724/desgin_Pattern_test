package decorate.Role;

import decorate.BaseToolBar;
import decorate.IToolBar;

public class Vistor implements IUser {
    private IToolBar iToolBar;
    public Vistor(){
        iToolBar = new BaseToolBar();
    }

    @Override
    public void getHomePageToolBar() {
        System.out.println(iToolBar.getToolBar().toString());
    }
}
