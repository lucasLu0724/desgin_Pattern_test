package decorate;

import decorate.Role.IUser;
import decorate.Role.VipUser;
import decorate.Role.Vistor;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        VipUser vipUser = new VipUser();
        vipUser.getHomePageToolBar();

        Vistor vistor = new Vistor();
        vistor.getHomePageToolBar();
    }
}
